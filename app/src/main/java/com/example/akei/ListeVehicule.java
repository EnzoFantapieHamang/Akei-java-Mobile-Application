package com.example.akei;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListeVehicule extends AppCompatActivity {
    LinearLayout lst_vehicule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_vehicule);

        // recuperation de l'objet Bundle utilise pour transmettre des donnees
        Bundle bundleRecu = this.getIntent().getExtras();
// recuperation des valeurs stockees dans des variables
        Long idM = bundleRecu.getLong("idM");

        lst_vehicule=findViewById(R.id.lst_vehicules);

        //a changer et remplacer tout les listeMagasinRecherche
        ArrayList<Vehicule> listeVehiculeRecherche;
        VehiculeDAO VehiculeAcces = new VehiculeDAO(this);
        listeVehiculeRecherche = VehiculeAcces.getVehicule(idM);
        Intent intent = new Intent(this, ActivityDetailVehicule.class);

        for(int i= 0;i<listeVehiculeRecherche.size();i++){
            LinearLayout unLayout = new LinearLayout(getApplicationContext());
            unLayout.setOrientation(LinearLayout.HORIZONTAL);
            LinearLayout Spacelayout = new LinearLayout(getApplicationContext());
            Spacelayout.setOrientation(LinearLayout.HORIZONTAL);

            TextView tv_volumeV = new TextView(getApplicationContext());
            tv_volumeV.setText(String.valueOf(listeVehiculeRecherche.get(i).getVolumeV()));
            TextView tv_NomV = new TextView(getApplicationContext());
            tv_NomV.setText(listeVehiculeRecherche.get(i).getNomV());
            TextView tv_marqueV = new TextView(getApplicationContext());
            tv_marqueV.setText(listeVehiculeRecherche.get(i).getMarqueV());
            TextView tv_estLouer = new TextView(getApplicationContext());
            if(listeVehiculeRecherche.get(i).isEstLouerV()==1) {
                tv_estLouer.setText("Deja Loué");
            }
            else {
                tv_estLouer.setText("n'est pas Loué");
            }

            LinearLayout.LayoutParams params = new
                    LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            params.weight = 1;

            tv_volumeV.setLayoutParams(params);
            tv_NomV.setLayoutParams(params);
            tv_marqueV.setLayoutParams(params);
            tv_estLouer.setLayoutParams(params);


            unLayout.addView(tv_NomV);
            unLayout.addView(tv_marqueV);
            unLayout.addView(tv_volumeV);
            unLayout.addView(tv_estLouer);
            unLayout.setBackgroundResource(R.drawable.bg_border_white_large);


            int finalI = i;
            unLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
// TODO Auto-generated method stub


                    //a changer
                    Bundle bundleATransmettre = new Bundle();
                    bundleATransmettre.putString("imatriculation",listeVehiculeRecherche.get(finalI).getImatriculationV());
                    intent.putExtras(bundleATransmettre);
                    startActivity(intent);

                }

            });




            TextView Space= new TextView(getApplicationContext());
            Space.setText("\n");
            Spacelayout.addView(Space);

            lst_vehicule.addView(Spacelayout);
            lst_vehicule.addView(unLayout);


        }




    }
}
