package com.looboo.agil.Entities.FirebaseEntities;

public class positions_camions {
    private String Date_P;
    private String Longitude;
    private String Latitude;
    private String codecamion;
    private String hh;
    private String mm;


    @Override
    public String toString() {
        return "positions_camions{" +
                "Date_P='" + Date_P + '\'' +
                ", Longitude='" + Longitude + '\'' +
                ", Latitude='" + Latitude + '\'' +
                ", codecamion=" + codecamion +
                ", hh=" + hh +
                ", mm=" + mm +
                '}';
    }

    public positions_camions() {
    }

    public String getDate_P() {
        return Date_P;
    }

    public void setDate_P(String date_P) {
        Date_P = date_P;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getCodecamion() {
        return codecamion;
    }

    public void setCodecamion(String codecamion) {
        this.codecamion = codecamion;
    }

    public String getHh() {
        return hh;
    }

    public void setHh(String hh) {
        this.hh = hh;
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm;
    }
}
