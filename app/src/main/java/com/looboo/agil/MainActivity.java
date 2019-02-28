package com.looboo.agil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.looboo.agil.Utils.DatabaseUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(MainActivity.this);
        DatabaseUtils databaseUtils = new DatabaseUtils();
        databaseUtils.loadDatabaseForAccount("5001");
        setContentView(R.layout.activity_main);

    }
}
