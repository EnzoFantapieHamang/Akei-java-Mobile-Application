package com.example.akei;

public class Employe {
    private long idE;
    private String nomE;
    private String prenomE;
    private String numTel;
    private long idM;
    private long idR;

    public Employe(long idE, String nomE, String prenomE, String numTel, long idM, long idR) {
        this.idE = idE;
        this.nomE = nomE;
        this.prenomE = prenomE;
        this.numTel = numTel;
        this.idM = idM;
        this.idR = idR;
    }

    public long getId() {
        return idE;
    }

    public void setId(int id) {
        this.idE = idE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public long getIdM() {
        return idM;
    }

    public void setIdM(int idM) {
        this.idM = idM;
    }

    public long getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }


    @Override
    public String toString() {
        return "Employe{" +
                "idE=" + idE +
                ", nomE='" + nomE + '\'' +
                ", prenomE='" + prenomE + '\'' +
                ", numTel='" + numTel + '\'' +
                '}';
    }
}
