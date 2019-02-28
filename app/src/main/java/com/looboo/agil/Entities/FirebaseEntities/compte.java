package com.looboo.agil.Entities.FirebaseEntities;

public class compte {
    private int DPOSCP;
    private int GVRPNT;
    private String LATITUDE;
    private String LIBGVR;
    private String LIBLOC;
    private String LOCPNT;
    private String LONGITUDE;
    private int MATCPT;
    private String NOMCPT;
    private long SCPSCP;

    public compte() {
    }

    public int getDPOSCP() {
        return DPOSCP;
    }

    public void setDPOSCP(int DPOSCP) {
        this.DPOSCP = DPOSCP;
    }

    public int getGVRPNT() {
        return GVRPNT;
    }

    public void setGVRPNT(int GVRPNT) {
        this.GVRPNT = GVRPNT;
    }

    public String getLATITUDE() {
        return LATITUDE;
    }

    public void setLATITUDE(String LATITUDE) {
        this.LATITUDE = LATITUDE;
    }

    public String getLIBGVR() {
        return LIBGVR;
    }

    public void setLIBGVR(String LIBGVR) {
        this.LIBGVR = LIBGVR;
    }

    public String getLIBLOC() {
        return LIBLOC;
    }

    public void setLIBLOC(String LIBLOC) {
        this.LIBLOC = LIBLOC;
    }

    public String getLOCPNT() {
        return LOCPNT;
    }

    public void setLOCPNT(String LOCPNT) {
        this.LOCPNT = LOCPNT;
    }

    public String getLONGITUDE() {
        return LONGITUDE;
    }

    public void setLONGITUDE(String LONGITUDE) {
        this.LONGITUDE = LONGITUDE;
    }

    public int getMATCPT() {
        return MATCPT;
    }

    public void setMATCPT(int MATCPT) {
        this.MATCPT = MATCPT;
    }

    public String getNOMCPT() {
        return NOMCPT;
    }

    public void setNOMCPT(String NOMCPT) {
        this.NOMCPT = NOMCPT;
    }

    public long getSCPSCP() {
        return SCPSCP;
    }

    public void setSCPSCP(long SCPSCP) {
        this.SCPSCP = SCPSCP;
    }

    @Override
    public String toString() {
        return "compte{" +
                "DPOSCP=" + DPOSCP +
                ", GVRPNT=" + GVRPNT +
                ", LATITUDE='" + LATITUDE + '\'' +
                ", LIBGVR='" + LIBGVR + '\'' +
                ", LIBLOC='" + LIBLOC + '\'' +
                ", LOCPNT='" + LOCPNT + '\'' +
                ", LONGITUDE='" + LONGITUDE + '\'' +
                ", MATCPT=" + MATCPT +
                ", NOMCPT='" + NOMCPT + '\'' +
                ", SCPSCP=" + SCPSCP +
                '}';
    }
}
