package com.looboo.agil.Entities.FirebaseEntities;

public class positions_camions {
    public String Date_P;
    public String Longitude;
    public String Latitude;
    public int codecamion;
    public int hh;
    public int mm;

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

    public int getCodecamion() {
        return codecamion;
    }

    public void setCodecamion(int codecamion) {
        this.codecamion = codecamion;
    }

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }
}
