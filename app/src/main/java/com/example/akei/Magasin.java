package com.example.akei;

public class Magasin {
    private long idM;
    private String villeM;
    private String paysM;
    private String nomM;
    private String rueM;
    private String cpM;

    public Magasin(long idM, String villeM, String paysM, String nomM, String rueM, String cpM) {
        this.idM = idM;
        this.villeM = villeM;
        this.paysM = paysM;
        this.nomM = nomM;
        this.rueM = rueM;
        this.cpM = cpM;
    }

    public long getId() {
        return idM;
    }

    public void setId(int id) {
        this.idM = id;
    }

    public String getVilleM() {
        return villeM;
    }

    public void setVilleM(String villeM) {
        this.villeM = villeM;
    }

    public String getPaysM() {
        return paysM;
    }

    public void setPaysM(String paysM) {
        this.paysM = paysM;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public String getRueM() {
        return rueM;
    }

    public void setRueM(String rueM) {
        this.rueM = rueM;
    }

    public String getCpM() {
        return cpM;
    }

    public void setCpM(String cpM) {
        this.cpM = cpM;
    }


    @Override
    public String toString() {
        return "Magasin{" +
                "idM=" + idM +
                ", villeM='" + villeM + '\'' +
                ", paysM='" + paysM + '\'' +
                ", nomM='" + nomM + '\'' +
                ", rueM='" + rueM + '\'' +
                ", cpM='" + cpM + '\'' +
                '}';
    }
}
