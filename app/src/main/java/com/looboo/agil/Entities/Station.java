package com.looboo.agil.Entities;

public class Station {
    public String gov;
    public String adr;
    public String longitude;
    public String latitude;

    public Station(String gov, String adr, String longitude, String latitude) {
        this.gov = gov;
        this.adr = adr;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getGov() {
        return gov;
    }

    public void setGov(String gov) {
        this.gov = gov;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
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
