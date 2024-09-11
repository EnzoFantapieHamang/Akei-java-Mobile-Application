package com.example.akei;

public class Rayon {
    private int idR;
    private String libelleR;
    private String descriptionR;

    public Rayon(long idR, String libelleR, String descriptionR) {
    }

    public int getId() {
        return idR;
    }

    public void setId(int id) {
        this.idR = id;
    }

    public String getLibelleR() {
        return libelleR;
    }

    public void setLibelleR(String libelleR) {
        this.libelleR = libelleR;
    }

    public String getDescriptionR() {
        return descriptionR;
    }

    public void setDescriptionR(String descriptionR) {
        this.descriptionR = descriptionR;
    }


    @Override
    public String toString() {
        return "Rayon{" +
                "idR=" + idR +
                ", libelleR='" + libelleR + '\'' +
                ", descriptionR='" + descriptionR + '\'' +
                '}';
    }
}
