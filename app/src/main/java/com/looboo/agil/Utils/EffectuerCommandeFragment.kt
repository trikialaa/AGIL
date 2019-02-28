package com.looboo.agil.Utils

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import com.looboo.agil.R
import kotlinx.android.synthetic.main.effectuer_commande_fragment.*
import org.w3c.dom.Text

class EffectuerCommandeFragment : AppCompatActivity() {
    var productsAgil = HashMap<String, String>()
    lateinit var type: String

    //recyclerView

    lateinit var recyclerView: RecyclerView
    lateinit var items: ArrayList<Int>
    lateinit var viewAdapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.effectuer_commande_fragment)
        recyclerView = findViewById(R.id.productsRecyclerView)


        lub.setOnClickListener(
    {
        type = "lub"
        lub.isClickable = false
        car.isClickable = false
        items = ArrayList()
        items.add(1)
        viewAdapter = ProductAdapter(items)
        recyclerView.layoutManager = (LinearLayoutManager(this))
        recyclerView.adapter = viewAdapter})


    car.setOnClickListener(
    {
        type = "car"
        lub.isClickable = false
        car.isClickable = false
        items = ArrayList()
        items.add(45)
        viewAdapter = ProductAdapter(items)
        recyclerView.layoutManager = (LinearLayoutManager(this))
        recyclerView.adapter = viewAdapter

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
            var nomProduits : Array<String>
           if ( type=="car") {
               nomProduits = arrayOf<String>("SUPER SANS PLOMB","PETROLE LAMPANT","GASOIL ORDINAIRE","GAZOLE 50","FUEL OIL N°2")
               var adapter= ArrayAdapter(this@EffectuerCommandeFragment,android.R.layout.simple_list_item_1,nomProduits)
               holder.name.adapter=adapter
           }
            else if (type=="lub"){
               nomProduits = arrayOf<String>("TANIX 4WD SAE 15W50","ENI I-SINT 5W40","ENI I-SINT 10W40")
               var adapter= ArrayAdapter(this@EffectuerCommandeFragment,android.R.layout.simple_list_item_1,nomProduits)
               holder.name.adapter=adapter
           }
            holder.button.setOnClickListener({
                items.add(55)
                recyclerView!!.adapter!!.notifyItemInserted(items.size)

            })
        }


        inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var button = itemView.findViewById<Button>(R.id.addanother) as Button
            var quantity = itemView.findViewById<TextView>(R.id.quantity)
            var name = itemView.findViewById<Spinner>(R.id.spinnerName)
        }
    }
}
