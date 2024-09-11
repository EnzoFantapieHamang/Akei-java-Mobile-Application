package com.example.akei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    LinearLayout lst_magasin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst_magasin=findViewById(R.id.lst_magasin);

        ArrayList<Magasin> listeMagasinRecherche;
        MagasinDAO MagasinAcces = new MagasinDAO(this);
        listeMagasinRecherche = MagasinAcces.getMagasins();
        Intent intent = new Intent(this, ChoixActivity.class);
        for(int i= 0;i<listeMagasinRecherche.size();i++){
            LinearLayout unLayout = new LinearLayout(getApplicationContext());
            unLayout.setOrientation(LinearLayout.HORIZONTAL);
            LinearLayout Spacelayout = new LinearLayout(getApplicationContext());
            Spacelayout.setOrientation(LinearLayout.HORIZONTAL);

            TextView tv_nom = new TextView(getApplicationContext());
            tv_nom.setText(listeMagasinRecherche.get(i).getNomM());
            TextView tv_pays = new TextView(getApplicationContext());
            tv_pays.setText(listeMagasinRecherche.get(i).getPaysM());
            TextView tv_ville = new TextView(getApplicationContext());
            tv_ville.setText(listeMagasinRecherche.get(i).getVilleM());
            TextView tv_rue= new TextView(getApplicationContext());
            tv_rue.setText(listeMagasinRecherche.get(i).getRueM());

            LinearLayout.LayoutParams params = new
                    LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            params.weight = 1;

            tv_nom.setLayoutParams(params);
            tv_pays.setLayoutParams(params);
            tv_ville.setLayoutParams(params);
            tv_rue.setLayoutParams(params);






            unLayout.addView(tv_nom);
            unLayout.addView(tv_pays);
            unLayout.addView(tv_ville);
            unLayout.addView(tv_rue);
            unLayout.setBackgroundResource(R.drawable.bg_border_white_large);

            int finalI = i;
            unLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
// TODO Auto-generated method stub


                    Bundle bundleATransmettre = new Bundle();
                    bundleATransmettre.putLong("idM",listeMagasinRecherche.get(finalI).getId());
                    intent.putExtras(bundleATransmettre );
                    startActivity(intent);

                }

            });




            TextView Space= new TextView(getApplicationContext());
            Space.setText("\n");
            Spacelayout.addView(Space);

            lst_magasin.addView(Spacelayout);
            lst_magasin.addView(unLayout);


        }




    }
}