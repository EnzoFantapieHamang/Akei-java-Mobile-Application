package com.example.akei;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;

public class VehiculeDAO {

    private static String base = "BDAkei";
    private static int version = 1;
    private BdSQLiteOpenHelper accesBD;

    public VehiculeDAO(Context ct){
        accesBD = new BdSQLiteOpenHelper(ct, base, null, version);
    }

    public ArrayList<Vehicule> getVehicule(long idM){
        Cursor curseur;
        String req = "select * from vehicule where idM="+idM+";";
        curseur = accesBD.getReadableDatabase().rawQuery(req,null);
        return cursorToVehiculeArrayList(curseur);
    }

    public Vehicule getVehiculee(String imatriculationV){
        Vehicule vehicule = null;
        Cursor curseur;
        String req = "select * from vehicule where imatriculationV='"+imatriculationV+"';";
        curseur = accesBD.getReadableDatabase().rawQuery(req,null);
        if(curseur.getCount()>0){
            curseur.moveToFirst();

            String nomV;
            double volumeV;
            double longueurV;
            double hauteurV;
            String carburantV;
            double kilometrageV;
            short estLouerV;
            String marqueV;
            Long idM;

                idM = curseur.getLong(9);
                nomV = curseur.getString(1);
                volumeV = curseur.getDouble(2);
                longueurV = curseur.getDouble(3);
                hauteurV = curseur.getDouble(4);
                carburantV = curseur.getString(5);
                kilometrageV = curseur.getDouble(6);
                estLouerV = curseur.getShort(7);
                marqueV = curseur.getString(8);



                vehicule=new Vehicule(imatriculationV,nomV,volumeV,longueurV,hauteurV,carburantV,kilometrageV,estLouerV,marqueV,idM);


        }
        return vehicule;
    }

    private ArrayList<Vehicule> cursorToVehiculeArrayList(Cursor curseur){
        ArrayList<Vehicule> listeVehicule = new ArrayList<Vehicule>();
        String imatriculationV;
        String nomV;
        double volumeV;
        double longueurV;
        double hauteurV;
        String carburantV;
        double kilometrageV;
        short estLouerV;
        String marqueV;
        Long idM;



        curseur.moveToFirst();
        while (!curseur.isAfterLast()){
            idM = curseur.getLong(9);
            imatriculationV = curseur.getString(0);
            nomV = curseur.getString(1);
            volumeV = curseur.getDouble(2);
            longueurV = curseur.getDouble(3);
            hauteurV = curseur.getDouble(4);
            carburantV = curseur.getString(5);
            kilometrageV = curseur.getDouble(6);
            estLouerV = curseur.getShort(7);
            marqueV = curseur.getString(8);



            listeVehicule.add(new Vehicule(imatriculationV,nomV,volumeV,longueurV,hauteurV,carburantV,kilometrageV,estLouerV,marqueV,idM));
            curseur.moveToNext();
        }
        return listeVehicule;
    }
}
