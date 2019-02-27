package com.looboo.agil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.looboo.agil.Entities.FirebaseEntities.livraison;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(MainActivity.this);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();
        String key = ref.child("livraison").push().getKey().toString();
        livraison l = new livraison();
        l.setId(key);
        ArrayList ar = new ArrayList<String>();
        ar.add("-LZl6ZQHvAW8B3bZluRs");
        l.setId_commande(ar);
        l.setDateheure("27/02/2019 23:15");
        l.setId_dep("0");
        ref.child("livraison").child(key).setValue(l);
        setContentView(R.layout.activity_main);
    }
}
