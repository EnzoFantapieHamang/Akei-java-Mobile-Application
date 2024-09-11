package com.example.akei;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;

public class MagasinDAO {
    private static String base = "BDAkei";
    private static int version = 1;
    private BdSQLiteOpenHelper accesBD;

    public MagasinDAO(Context ct){
        accesBD = new BdSQLiteOpenHelper(ct, base, null, version);
    }

    public ArrayList<Magasin> getMagasins(){
        Cursor curseur;
        String req = "select * from magasin ;";
        curseur = accesBD.getReadableDatabase().rawQuery(req,null);
        return cursorToMagasinArrayList(curseur);
    }

    private ArrayList<Magasin> cursorToMagasinArrayList(Cursor curseur){
        ArrayList<Magasin> listeMagasins = new ArrayList<Magasin>();
        long idM;
        String villeM;
        String paysM;
        String nomM;
        String rueM;
        String cpM;

        curseur.moveToFirst();
        while (!curseur.isAfterLast()){
            idM = curseur.getLong(0);
            villeM = curseur.getString(1);
            paysM = curseur.getString(2);
            nomM = curseur.getString(3);
            rueM = curseur.getString(4);
            cpM = curseur.getString(5);



            listeMagasins.add(new Magasin(idM,villeM,paysM,nomM,rueM,cpM));
            curseur.moveToNext();
        }
        return listeMagasins;
    }




}
