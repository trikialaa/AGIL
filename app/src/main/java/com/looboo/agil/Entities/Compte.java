package com.looboo.agil.Entities;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public class Compte {

    public String matricule;
    public String nom;
    public String scompte;
    public LatLng coord;
    public String gouv;
    public String localite;
    public List<Commande> commandeList;

    public Compte() {
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getScompte() {
        return scompte;
    }

    public void setScompte(String scompte) {
        this.scompte = scompte;
    }

    public LatLng getCoord() {
        return coord;
    }

    public void setCoord(LatLng coord) {
        this.coord = coord;
    }

    public String getGouv() {
        return gouv;
    }

    public void setGouv(String gouv) {
        this.gouv = gouv;
    }

    public String getLocalite() {
        return localite;
    }

    public void setLocalite(String localite) {
        this.localite = localite;
    }

    public List<Commande> getCommandeList() {
        return commandeList;
    }

    public void setCommandeList(List<Commande> commandeList) {
        this.commandeList = commandeList;
    }
}
