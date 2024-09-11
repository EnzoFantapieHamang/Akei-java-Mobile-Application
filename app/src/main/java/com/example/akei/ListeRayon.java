package com.example.akei;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListeRayon extends AppCompatActivity {
    LinearLayout lst_rayon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_rayon);

        // recuperation de l'objet Bundle utilise pour transmettre des donnees
        Bundle bundleRecu = this.getIntent().getExtras();
// recuperation des valeurs stockees dans des variables
        Long idM = bundleRecu.getLong("idM");

        lst_rayon=findViewById(R.id.lst_rayon);

        //a changer et remplacer tout les listeMagasinRecherche
        ArrayList<Rayon> listeRayonRecherche;
        RayonDAO RayonAcces = new RayonDAO(this);
        listeRayonRecherche = RayonAcces.getRayons();
        Intent intent = new Intent(this, ListeRayon.class);

        for(int i= 0;i<listeRayonRecherche.size();i++){
            LinearLayout unLayout = new LinearLayout(getApplicationContext());
            unLayout.setOrientation(LinearLayout.HORIZONTAL);
            LinearLayout Spacelayout = new LinearLayout(getApplicationContext());
            Spacelayout.setOrientation(LinearLayout.HORIZONTAL);

            TextView tv_descriptionR = new TextView(getApplicationContext());
            tv_descriptionR.setText(listeRayonRecherche.get(i).getDescriptionR());
            TextView tv_LibelleR = new TextView(getApplicationContext());
            tv_LibelleR.setText(listeRayonRecherche.get(i).getLibelleR());


            LinearLayout.LayoutParams params = new
                    LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            params.weight = 1;

            tv_descriptionR.setLayoutParams(params);
            tv_LibelleR.setLayoutParams(params);






            unLayout.addView(tv_LibelleR);
            unLayout.addView(tv_descriptionR);



            int finalI = i;
            unLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
// TODO Auto-generated method stub


                    //a changer
                    Bundle bundleATransmettre = new Bundle();
                    bundleATransmettre.putLong("idR",listeRayonRecherche.get(finalI).getId());
                    bundleATransmettre.putLong("idM",idM);
                    intent.putExtras(bundleATransmettre);
                    startActivity(intent);

                }

            });




            TextView Space= new TextView(getApplicationContext());
            Space.setText("\n");
            Spacelayout.addView(Space);

            lst_rayon.addView(Spacelayout);
            lst_rayon.addView(unLayout);


        }




    }
}
