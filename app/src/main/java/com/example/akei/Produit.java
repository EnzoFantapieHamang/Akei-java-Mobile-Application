package com.example.akei;

public class Produit {
    private String referenceP;
    private String nomP;
    private String descriptionTechniqueP;
    private double prixP;
    private double poidsP;
    private double longueurP;
    private double largeurP;
    private double hauteurP;
    private long idR;

    public Produit(String referenceP, String nomP, String descriptionTechniqueP, double prixP, double poidsP, double longueurP, double largeurP, double hauteurP, long idR) {
        this.referenceP = referenceP;
        this.nomP = nomP;
        this.descriptionTechniqueP = descriptionTechniqueP;
        this.prixP = prixP;
        this.poidsP = poidsP;
        this.longueurP = longueurP;
        this.largeurP = largeurP;
        this.hauteurP = hauteurP;
        this.idR = idR;
    }

    public String getReferenceP() {
        return referenceP;
    }

    public void setReferenceP(String referenceP) {
        this.referenceP = referenceP;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public String getDescriptionTechniqueP() {
        return descriptionTechniqueP;
    }

    public void setDescriptionTechniqueP(String descriptionTechniqueP) {
        this.descriptionTechniqueP = descriptionTechniqueP;
    }

    public double getPrixP() {
        return prixP;
    }

    public void setPrixP(double prixP) {
        this.prixP = prixP;
    }

    public double getPoidsP() {
        return poidsP;
    }

    public void setPoidsP(double poidsP) {
        this.poidsP = poidsP;
    }

    public double getLongueurP() {
        return longueurP;
    }

    public void setLongueurP(double longueurP) {
        this.longueurP = longueurP;
    }

    public double getLargeurP() {
        return largeurP;
    }

    public void setLargeurP(double largeurP) {
        this.largeurP = largeurP;
    }

    public double getHauteurP() {
        return hauteurP;
    }

    public void setHauteurP(double hauteurP) {
        this.hauteurP = hauteurP;
    }

    public long getIdR() {
        return idR;
    }

    public void setIdR(long idR) {
        this.idR = idR;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "referenceP='" + referenceP + '\'' +
                ", nomP='" + nomP + '\'' +
                ", descriptionTechniqueP='" + descriptionTechniqueP + '\'' +
                ", prixP=" + prixP +
                ", poidsP=" + poidsP +
                ", longueurP=" + longueurP +
                ", largeurP=" + largeurP +
                ", hauteurP=" + hauteurP +
                '}';
    }
}