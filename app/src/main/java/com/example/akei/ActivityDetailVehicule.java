package com.example.akei;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDetailVehicule extends AppCompatActivity {


    TextView tv_immatriculation;
    TextView tv_nomV;
    TextView tv_volume;
    TextView tv_longueur;
    TextView tv_hauteur;
    TextView tv_carburant;
    TextView tv_kilometres;
    TextView tv_marque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_vehicule);


        Bundle bundleRecu = this.getIntent().getExtras();
// recuperation des valeurs stockees dans des variables
        String imatriculation = bundleRecu.getString("imatriculation");
        VehiculeDAO VehiculeAcces = new VehiculeDAO(this);
        Vehicule vehicule=VehiculeAcces.getVehiculee(imatriculation);

        tv_immatriculation=findViewById(R.id.tv_immatriculation);
        tv_nomV=findViewById(R.id.tv_nomV);
        tv_volume=findViewById(R.id.tv_volume);
        tv_longueur=findViewById(R.id.tv_longueur);
        tv_hauteur=findViewById(R.id.tv_hauteur);
        tv_carburant=findViewById(R.id.tv_carburant);
        tv_kilometres=findViewById(R.id.tv_kilometres);
        tv_marque=findViewById(R.id.tv_marque);

        tv_immatriculation.setText(vehicule.getImatriculationV());
        tv_nomV.setText(vehicule.getNomV());
        tv_volume.setText(String.valueOf(vehicule.getVolumeV()));
        tv_longueur.setText(String.valueOf(vehicule.getLongueurV()));
        tv_hauteur.setText(String.valueOf(vehicule.getHauteurV()));
        tv_carburant.setText(vehicule.getCarburantV());
        tv_kilometres.setText(String.valueOf(vehicule.getKilometrageV()));
        tv_marque.setText(vehicule.getMarqueV());

        tv_immatriculation.setTextSize(15);
        tv_nomV.setTextSize(15);
        tv_volume.setTextSize(15);
        tv_longueur.setTextSize(15);
        tv_hauteur.setTextSize(15);
        tv_carburant.setTextSize(15);
        tv_kilometres.setTextSize(15);
        tv_marque.setTextSize(15);

        tv_immatriculation.setTypeface(Typeface.DEFAULT_BOLD);
        tv_nomV.setTypeface(Typeface.DEFAULT_BOLD);
        tv_volume.setTypeface(Typeface.DEFAULT_BOLD);
        tv_longueur.setTypeface(Typeface.DEFAULT_BOLD);
        tv_hauteur.setTypeface(Typeface.DEFAULT_BOLD);
        tv_carburant.setTypeface(Typeface.DEFAULT_BOLD);
        tv_kilometres.setTypeface(Typeface.DEFAULT_BOLD);
        tv_marque.setTypeface(Typeface.DEFAULT_BOLD);


    }
}