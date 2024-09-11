package com.example.akei;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListeEmploye extends AppCompatActivity {
    LinearLayout lst_employe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_employe);


        Bundle bundleRecu = this.getIntent().getExtras();
        Long idM = bundleRecu.getLong("idM");

        lst_employe=findViewById(R.id.lst_employe);


        ArrayList<Employe> listeEmployeRecherche;
        EmployeDAO EmployeAcces = new EmployeDAO(this);
        listeEmployeRecherche = EmployeAcces.getEmployes(idM);
        Intent intentEmploye = new Intent(this, ActivityDetailEmploye.class);

        for(int i= 0;i<listeEmployeRecherche.size();i++){
            LinearLayout unLayout = new LinearLayout(getApplicationContext());
            unLayout.setOrientation(LinearLayout.HORIZONTAL);
            LinearLayout spacelayout = new LinearLayout(getApplicationContext());
            spacelayout.setOrientation(LinearLayout.HORIZONTAL);

            TextView tv_prenomE = new TextView(getApplicationContext());
            tv_prenomE.setText(listeEmployeRecherche.get(i).getPrenomE());
            TextView tv_nomE = new TextView(getApplicationContext());
            tv_nomE.setText(listeEmployeRecherche.get(i).getNomE());
            TextView tv_numTel = new TextView(getApplicationContext());
            tv_numTel.setText(listeEmployeRecherche.get(i).getNumTel());

            LinearLayout.LayoutParams params = new
                    LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            params.weight = 1;

            tv_prenomE.setLayoutParams(params);
            tv_nomE.setLayoutParams(params);
            tv_numTel.setLayoutParams(params);


            unLayout.addView(tv_prenomE);
            unLayout.addView(tv_nomE);
            unLayout.addView(tv_numTel);



            int finalI = i;
            unLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
// TODO Auto-generated method stub


                    //a changer
                    Bundle bundleATransmettre = new Bundle();
                    bundleATransmettre.putLong("idE",listeEmployeRecherche.get(finalI).getId());
                    bundleATransmettre.putLong("idM",idM);
                    intentEmploye.putExtras(bundleATransmettre);
                    startActivity(intentEmploye);

                }

            });




            TextView Space= new TextView(getApplicationContext());
            Space.setText("\n");
            spacelayout.addView(Space);

            lst_employe.addView(spacelayout);
            lst_employe.addView(unLayout);


        }




    }
}
