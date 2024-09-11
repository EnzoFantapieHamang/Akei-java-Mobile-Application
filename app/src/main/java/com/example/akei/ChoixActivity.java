package com.example.akei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ChoixActivity extends AppCompatActivity {

    Button bt_lstRayon;
    Button bt_lstEmploye;
    Button bt_lstVehicule;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix);

        Bundle bundleRecu = this.getIntent().getExtras();
        Long idM = bundleRecu.getLong("idM");

        bt_lstRayon = (Button) findViewById(R.id.bt_lstRayon);
        bt_lstEmploye = (Button) findViewById(R.id.bt_lstEmploye);
        bt_lstVehicule = (Button) findViewById(R.id.bt_lstVehicule);

        Intent listeRayon = new Intent(this, ListeRayon.class);
        Bundle bundleATransmettre = new Bundle();
        bundleATransmettre.putLong("idM",idM);
        listeRayon.putExtras(bundleATransmettre );


        Intent listeEmploye = new Intent(this, ListeEmploye.class);
        Bundle bundleATransmettre2 = new Bundle();
        bundleATransmettre2.putLong("idM",idM);
        listeEmploye.putExtras(bundleATransmettre2 );


        Intent listeVehicule = new Intent(this, ListeVehicule.class);
        listeVehicule.putExtras(bundleATransmettre );


        bt_lstRayon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                startActivity(listeRayon);

            }

        });

        bt_lstEmploye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                startActivity(listeEmploye);

            }

        });

        bt_lstVehicule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                startActivity(listeVehicule);

            }

        });




    }

}
