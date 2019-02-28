package com.looboo.agil.Models.RealTimeTracking;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.looboo.agil.Entities.FirebaseEntities.positions_camions;
import com.looboo.agil.R;
import com.looboo.agil.Utils.DatabaseUtils;

public class MyCommandsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_commands);

        final Context context = this;
        Button button = findViewById(R.id.button2);
        button.setVisibility(View.VISIBLE);
        button.setBackgroundColor(Color.TRANSPARENT);
        final positions_camions positions_camionsDatabaseUtils = new DatabaseUtils().loadCamionPositions(button,this);
    }
}
