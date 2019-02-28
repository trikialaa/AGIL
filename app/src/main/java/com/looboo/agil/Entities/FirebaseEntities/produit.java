package com.looboo.agil.Entities.FirebaseEntities;

public class produit {

    private int CODEMB;
    private int CODPRD;
    private String LIBEMB;
    private String LIBPRD;
    private int PDSPRD;
    private String TYPPRD;

    public produit() {
    }

    public int getCODEMB() {
        return CODEMB;
    }

    public void setCODEMB(int CODEMB) {
        this.CODEMB = CODEMB;
    }

    public int getCODPRD() {
        return CODPRD;
    }

    public void setCODPRD(int CODPRD) {
        this.CODPRD = CODPRD;
    }

    public String getLIBEMB() {
        return LIBEMB;
    }

    public void setLIBEMB(String LIBEMB) {
        this.LIBEMB = LIBEMB;
    }

    public String getLIBPRD() {
        return LIBPRD;
    }

    public void setLIBPRD(String LIBPRD) {
        this.LIBPRD = LIBPRD;
    }

    public int getPDSPRD() {
        return PDSPRD;
    }

    public void setPDSPRD(int PDSPRD) {
        this.PDSPRD = PDSPRD;
    }

    public String getTYPPRD() {
        return TYPPRD;
    }

    public void setTYPPRD(String TYPPRD) {
        this.TYPPRD = TYPPRD;
    }
}
