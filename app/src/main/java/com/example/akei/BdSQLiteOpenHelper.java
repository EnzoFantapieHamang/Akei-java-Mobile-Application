package com.example.akei;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class BdSQLiteOpenHelper extends SQLiteOpenHelper {

	private String requeteMagasin="create table magasin ("
			+ "idM INTEGER PRIMARY KEY,"
			+ "villeM TEXT NOT NULL,"
			+ "paysM TEXT NOT NULL,"
			+ "nomM TEXT NOT NULL,"
			+ "rueM TEXT NOT NULL,"
			+ "cpM TEXT NOT NULL);";

	private String requeteRayon="create table rayon ("
			+ "idR INTEGER PRIMARY KEY,"
			+ "libelleR TEXT NOT NULL,"
			+ "descriptionR TEXT NOT NULL);";

	private String requeteEmploye="create table employe ("
			+ "idE INTEGER PRIMARY KEY AUTOINCREMENT,"
			+ "numTel TEXT NOT NULL,"
			+ "nomE TEXT NOT NULL,"
			+ "prenomE TEXT NOT NULL,"
			+ "idM INTEGER NOT NULL,"
			+ "idR TEXT NOT NULL,"
			+ "FOREIGN KEY(idM) REFERENCES magasin(idM),"
			+ "FOREIGN KEY(idR) REFERENCES rayon(idR));";



	private String requeteVehicule="create table vehicule ("
			+ "imatriculationV TEXT NOT NULL,"
			+ "nomV TEXT NOT NULL,"
			+ "volumeV DOUBLE NOT NULL,"
			+ "longueurV DOUBLE NOT NULL,"
			+ "hauteurV DOUBLE NOT NULL,"
			+ "carburantV TEXT NOT NULL,"
			+ "kilometrageV DOUBLE NOT NULL,"
			+ "EstlouerV BOOLEAN NOT NULL,"
			+ "marqueV TEXT NOT NULL,"
			+ "idM INTEGER NOT NULL,"
			+ "PRIMARY KEY(imatriculationV),"
			+ "FOREIGN KEY(idM) REFERENCES magasin(idM));";


	private String requeteProduit="create table produit ("
			+ "referenceP TEXT NOT NULL,"
			+ "nomP TEXT NOT NULL,"
			+ "descriptionTechniqueP TEXT NOT NULL,"
			+ "prixP DOUBLE NOT NULL,"
			+ "poidsP DOUBLE NOT NULL,"
			+ "longueurP DOUBLE NOT NULL,"
			+ "largeurP DOUBLE NOT NULL,"
			+ "hauteurP DOUBLE NOT NULL,"
			+ "idR INTEGER NOT NULL,"
			+ "FOREIGN KEY(idR) REFERENCES rayon(idR),"
			+ "PRIMARY KEY(referenceP));";


	public BdSQLiteOpenHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(requeteMagasin);
		db.execSQL(requeteRayon);
		db.execSQL(requeteEmploye);
		db.execSQL(requeteVehicule);
		db.execSQL(requeteProduit);


		db.execSQL("insert into magasin (idM,villeM,paysM,nomM,rueM,cpM) values(1,'panaco','Japon','akeiBayonne','Osaka',65000);");

		ContentValues value = new ContentValues();
		value.put("idM", 2);
		value.put("villeM","Anglet");
		value.put("paysM", "France");
		value.put("nomM", "akei Amedzondo");
		value.put("rueM", "Amedzondo");
		value.put("cpM", 64600);

		db.insert("magasin", null, value);


		db.execSQL("insert into vehicule (imatriculationV,nomV,volumeV,longueurV,hauteurV,carburantV,kilometrageV,EstlouerV,marqueV,idM) values('aa-000-aa','voiture',12,10,4,'Diesel',200000,1,'Hyundai',1);");
		db.execSQL("insert into vehicule (imatriculationV,nomV,volumeV,longueurV,hauteurV,carburantV,kilometrageV,EstlouerV,marqueV,idM) values('by-010-cx','voiture',12,10,4,'Diesel',200000,0,'Bugati',1);");
		db.execSQL("insert into vehicule (imatriculationV,nomV,volumeV,longueurV,hauteurV,carburantV,kilometrageV,EstlouerV,marqueV,idM) values('vb-000-bb','voiture',11,11,3,'Diesel',200120,1,'Lotus',2);");

		db.execSQL("insert into Rayon (idR,libelleR,descriptionR) values (1,'Cuisine','Tout ce qui tourne autour de la cuisine.')");

		db.execSQL("insert into Employe (idE, nomE, prenomE, numTel, idM, idR) values (1,'Dupont','Jacques','0652233857',1,1)");



	}



	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
