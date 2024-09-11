package com.example.akei;

public class Vehicule {
    private String imatriculationV;
    private String nomV;
    private double volumeV;
    private double longueurV;
    private double hauteurV;
    private String carburantV;
    private double kilometrageV;
    private short estLouerV;
    private String marqueV;
    private Long idM;

    public String getImatriculationV() {
        return imatriculationV;
    }

    public void setImatriculationV(String imatriculationV) {
        this.imatriculationV = imatriculationV;
    }

    public String getNomV() {
        return nomV;
    }

    public void setNomV(String nomV) {
        this.nomV = nomV;
    }

    public double getVolumeV() {
        return volumeV;
    }

    public void setVolumeV(double volumeV) {
        this.volumeV = volumeV;
    }

    public double getLongueurV() {
        return longueurV;
    }

    public void setLongueurV(double longueurV) {
        this.longueurV = longueurV;
    }

    public double getHauteurV() {
        return hauteurV;
    }

    public void setHauteurV(double hauteurV) {
        this.hauteurV = hauteurV;
    }

    public String getCarburantV() {
        return carburantV;
    }

    public void setCarburantV(String carburantV) {
        this.carburantV = carburantV;
    }

    public double getKilometrageV() {
        return kilometrageV;
    }

    public void setKilometrageV(double kilometrageV) {
        this.kilometrageV = kilometrageV;
    }

    public short isEstLouerV() {
        return estLouerV;
    }

    public void setEstLouerV(short estLouerV) {
        this.estLouerV = estLouerV;
    }

    public String getMarqueV() {
        return marqueV;
    }

    public void setMarqueV(String marqueV) {
        this.marqueV = marqueV;
    }

    public Long getIdM() {
        return idM;
    }

    public void setIdM(Long idM) {
        this.idM = idM;
    }


    @Override
    public String toString() {
        return "Vehicule{" +
                "imatriculationV='" + imatriculationV + '\'' +
                ", nomV='" + nomV + '\'' +
                ", volumeV=" + volumeV +
                ", longueurV=" + longueurV +
                ", hauteurV=" + hauteurV +
                ", carburantV='" + carburantV + '\'' +
                ", kilometrageV=" + kilometrageV +
                ", estLouerV=" + estLouerV +
                ", marqueV='" + marqueV + '\'' +
                '}';
    }

    public Vehicule(String imatriculationV, String nomV, double volumeV, double longueurV, double hauteurV, String carburantV, double kilometrageV, short estLouerV, String marqueV, Long idM) {
        this.imatriculationV = imatriculationV;
        this.nomV = nomV;
        this.volumeV = volumeV;
        this.longueurV = longueurV;
        this.hauteurV = hauteurV;
        this.carburantV = carburantV;
        this.kilometrageV = kilometrageV;
        this.estLouerV = estLouerV;
        this.marqueV = marqueV;
        this.idM = idM;
    }
}
