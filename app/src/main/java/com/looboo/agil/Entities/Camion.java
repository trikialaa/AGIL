package com.looboo.agil.Entities;

import com.google.android.gms.maps.model.LatLng;

public class Camion {

    public String date;
    public int hh;
    public int mm;
    public int codecamion;
    public LatLng coord;


    public Camion() {
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

    public LatLng getCoord() {
        return coord;
    }

    public void setCoord(LatLng coord) {
        this.coord = coord;
    }
}
