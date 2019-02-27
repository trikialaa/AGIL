package com.looboo.agil.Entities;

public class Camion {

    public String date;
    public int hh;
    public int mm;
    public int codecamion;
    public String longitude;
    public String latitude;


    public Camion(String date, int hh, int mm, int codecamion, String longitude, String latitude) {
        this.date = date;
        this.hh = hh;
        this.mm = mm;
        this.codecamion = codecamion;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public int getCodecamion() {
        return codecamion;
    }

    public void setCodecamion(int codecamion) {
        this.codecamion = codecamion;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
