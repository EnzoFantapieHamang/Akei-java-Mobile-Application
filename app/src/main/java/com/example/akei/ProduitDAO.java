package com.example.akei;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;

public class ProduitDAO {
    private static String base = "BDAkei";
    private static int version = 1;
    private BdSQLiteOpenHelper accesBD;

    public ProduitDAO(Context ct){
        accesBD = new BdSQLiteOpenHelper(ct, base, null, version);
    }

    public ArrayList<Produit> getProduits(long idR){
        Cursor curseur;
        String req = "select * from produit where idM like '"+idR+"';";
        curseur = accesBD.getReadableDatabase().rawQuery(req,null);
        return cursorToProduitArrayList(curseur);
    }

    private ArrayList<Produit> cursorToProduitArrayList(Cursor curseur){
        ArrayList<Produit> listeProduits = new ArrayList<Produit>();
        String refP;
        String nomP;
        String descriptionTechniqueP;
        double prixP;
        double poidsP;
        double longueurP;
        double largeurP;
        double hauteurP;
        long idR;

        curseur.moveToFirst();
        while (!curseur.isAfterLast()){
            refP= curseur.getString(0);
            nomP = curseur.getString(1);
            descriptionTechniqueP = curseur.getString(2);
            prixP = curseur.getDouble(3);
            poidsP = curseur.getDouble(4);
            longueurP = curseur.getDouble(5);
            largeurP = curseur.getDouble(5);
            hauteurP = curseur.getDouble(5);
            idR = curseur.getLong(5);



            listeProduits.add(new Produit(refP,nomP,descriptionTechniqueP,prixP,poidsP,longueurP,largeurP,hauteurP,idR));
            curseur.moveToNext();
        }
        return listeProduits;
    }

}
