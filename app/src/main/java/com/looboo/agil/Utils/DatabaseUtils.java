package com.looboo.agil.Utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.looboo.agil.Entities.FirebaseEntities.positions_camions;
import com.looboo.agil.Models.RealTimeTracking.TrackerActivity;

import static android.content.ContentValues.TAG;

public class DatabaseUtils {

    positions_camions res;
    Button button;

    public positions_camions loadCamionPositions(final Button button, final Context context){
        this.button=button;
        res = new positions_camions();
        FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
        DatabaseReference mDatabaseRef = mDatabase.getReference("positions_camions");
        Query query = mDatabaseRef.orderByChild("Date_P").equalTo("2019-02-28");
        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot childSnapshot: dataSnapshot.getChildren()) {
                    positions_camions p = childSnapshot.getValue(positions_camions.class);
                    TrackerUtils trackerUtils = new TrackerUtils();
                    trackerUtils.getAdequateTrackerTime();
                    if ((Integer.parseInt(p.getHh())==trackerUtils.h)&&(Integer.parseInt(p.getMm())==trackerUtils.m)){
                        Log.e(TAG, "Value is: " + p.toString());
                        res = p;
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(context, TrackerActivity.class);
                                Log.e("APP",res.toString());
                                Float longi = Float.parseFloat(res.getLongitude());
                                Float lati = Float.parseFloat(res.getLatitude());
                                intent.putExtra("long",longi);
                                intent.putExtra("lat",lati);
                                context.startActivity(intent);
                            }
                        });
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Log.e(TAG, "Erreur de l'importation des données de l'utilisateur", error.toException());
            }
        });
        return res;
    }
}
