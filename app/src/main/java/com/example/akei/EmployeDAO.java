package com.example.akei;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;

public class EmployeDAO {
    private static String base = "BDAkei";
    private static int version = 1;
    private BdSQLiteOpenHelper accesBD;

    public EmployeDAO(Context ct){
        accesBD = new BdSQLiteOpenHelper(ct, base, null, version);
    }

    public ArrayList<Employe> getEmployes(long idM){
        Cursor curseur;
        String req = "select * from employe where idM like '"+idM+"';";
        curseur = accesBD.getReadableDatabase().rawQuery(req,null);
        return cursorToEmployeArrayList(curseur);
    }

    private ArrayList<Employe> cursorToEmployeArrayList(Cursor curseur){
        ArrayList<Employe> listeEmployes = new ArrayList<Employe>();
        long idE;
        String nomE;
        String prenomE;
        String numTel;
        long idM;
        long idR;

        curseur.moveToFirst();
        while (!curseur.isAfterLast()){
            idE = curseur.getLong(0);
            nomE = curseur.getString(1);
            prenomE = curseur.getString(2);
            numTel = curseur.getString(3);
            idM = curseur.getLong(4);
            idR = curseur.getLong(5);



            listeEmployes.add(new Employe(idE,nomE,prenomE,numTel,idM,idR));
            curseur.moveToNext();
        }
        return listeEmployes;
    }

}
