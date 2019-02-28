package com.looboo.agil.Entities;

import java.util.Map;

public class Commande {

    public String id;
    public String mat_compte;
    public String type;
    public String dateCreation;
    public String etat;
    public Map<String,String> produits;

    public Commande() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMat_compte() {
        return mat_compte;
    }

    public void setMat_compte(String mat_compte) {
        this.mat_compte = mat_compte;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Map<String, String> setProduits() {
        return produits;
    }

    public String getEtat() {
        return etat;
    }
    public void setEtat(String etat) {
        this.etat=etat;
    }

    public void setProduits(Map<String, String> produitList) {
        this.produits= produitList;
    }
}
