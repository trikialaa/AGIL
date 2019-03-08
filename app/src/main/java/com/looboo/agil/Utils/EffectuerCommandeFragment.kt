package com.looboo.agil.Utils

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.google.firebase.database.FirebaseDatabase
import com.looboo.agil.Entities.Commande
import com.looboo.agil.R
import kotlinx.android.synthetic.main.effectuer_commande_fragment.*
import java.text.SimpleDateFormat
import java.util.*

class EffectuerCommandeFragment : AppCompatActivity() {
    var productsAgil = HashMap<String, String>()
     var type: String ="nthg"

    //recyclerView

    lateinit var recyclerView: RecyclerView
    lateinit var items: ArrayList<Int>
    lateinit var viewAdapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        setContentView(R.layout.effectuer_commande_fragment)
        recyclerView = findViewById(R.id.productsRecyclerView)
        buttonAjouter.setOnClickListener({
            var mCommande = Commande()
            val sdf = SimpleDateFormat("dd/M/yyyy")
            val currentDate = sdf.format(Date())
            mCommande.dateCreation = currentDate
            mCommande.mat_compte = "5001"
            mCommande.produits = productsAgil
            mCommande.etat = "0"
            mCommande.type = type
            var database = FirebaseDatabase.getInstance().reference.child("commande")
            var key = database.push().key.toString()
            mCommande.id = key
            database.child(key.toString()).setValue(mCommande)
            Toast.makeText(this@EffectuerCommandeFragment, "Succés", Toast.LENGTH_SHORT).show()
        })

        lub.setOnClickListener(
    {
        if((type=="car") || type=="nthg"){
        type = "lub"

        items = ArrayList()
        items.add(1)
        viewAdapter = ProductAdapter(items)
        recyclerView.layoutManager = (LinearLayoutManager(this))
        recyclerView.adapter = viewAdapter}} )



    car.setOnClickListener(
    {
        if((type=="lub")|| (type=="nthg")){
        type = "car"

        items = ArrayList()
        items.add(45)
        viewAdapter = ProductAdapter(items)
        recyclerView.layoutManager = (LinearLayoutManager(this))
        recyclerView.adapter = viewAdapter}

    })

        }



    inner class ProductAdapter(var items: ArrayList<Int>) : RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.commandeticket, parent, false)
                return ProductHolder(view)
            }

            override fun getItemCount(): Int {
                return items.count()
            }

            override fun onBindViewHolder(holder: ProductHolder, position: Int) {
                var nomProduits: Array<String>
                var theRealPosition = position + 1
                if (theRealPosition == items.size) {
                    holder.button.visibility = View.VISIBLE
                } else {
                    holder.button.visibility = View.GONE
                }
                if (type == "car") {
                    nomProduits = arrayOf<String>("SUPER SANS PLOMB", "PETROLE LAMPANT", "GASOIL ORDINAIRE", "GAZOLE 50", "FUEL OIL N°2")
                    var adapter = ArrayAdapter(this@EffectuerCommandeFragment, android.R.layout.simple_list_item_1, nomProduits)
                    holder.name.adapter = adapter
                } else if (type == "lub") {
                    nomProduits = arrayOf<String>("TANIX 4WD SAE 15W50", "ENI I-SINT 5W40", "ENI I-SINT 10W40")
                    var adapter = ArrayAdapter(this@EffectuerCommandeFragment, android.R.layout.simple_list_item_1, nomProduits)
                    holder.name.adapter = adapter
                    var produitName: String = holder.name.selectedItem.toString()

                    productsAgil.put(produitName, holder.quantity.text.toString())
                }
                holder.button.setOnClickListener {
                    if (holder.quantity.text.toString() == "") {
                        Toast.makeText(this@EffectuerCommandeFragment, "entrer une quantité valide", Toast.LENGTH_SHORT).show()
                    } else {
                        items.add(55)
                        recyclerView!!.adapter!!.notifyItemInserted(items.size)

                        var produitName: String = holder.name.selectedItem.toString()
                        productsAgil.put(produitName, holder.quantity.text.toString())
                    }

                }
            }



        inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var button = itemView.findViewById<Button>(R.id.addanother) as Button
            var quantity = itemView.findViewById<TextView>(R.id.quantityValue)
            var name = itemView.findViewById<Spinner>(R.id.spinnerName)
        }
    }
}
