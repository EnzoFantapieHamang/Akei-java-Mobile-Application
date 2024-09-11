package com.example.akei;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;

public class RayonDAO {
    private static String base = "BDAkei";
    private static int version = 1;
    private BdSQLiteOpenHelper accesBD;

    public RayonDAO(Context ct){
        accesBD = new BdSQLiteOpenHelper(ct, base, null, version);
    }

    public ArrayList<Rayon> getRayons(){
        Cursor curseur;
        String req = "select * from rayon ;";
        curseur = accesBD.getReadableDatabase().rawQuery(req,null);
        return cursorToMagasinArrayList(curseur);
    }

    private ArrayList<Rayon> cursorToMagasinArrayList(Cursor curseur){
        ArrayList<Rayon> listeRayons = new ArrayList<Rayon>();
        long id;
        String libelleR;
        String descriptionR;

        curseur.moveToFirst();
        while (!curseur.isAfterLast()){
            id = curseur.getLong(0);
            libelleR = curseur.getString(1);
            descriptionR = curseur.getString(2);



            listeRayons.add(new Rayon(id,libelleR,descriptionR));
            curseur.moveToNext();
        }
        return listeRayons;
    }

}
