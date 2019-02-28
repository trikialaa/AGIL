package com.looboo.agil.Entities.FirebaseEntities;

import java.util.Map;

public class commande {
    private String id;
    private String id_compte;
    private String type;
    private Map<String,String> produits;
    private String date_de_creation;

    public commande() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_compte() {
        return id_compte;
    }

    public void setId_compte(String id_compte) {
        this.id_compte = id_compte;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String,String> getProduits() {
        return produits;
    }

    public void setProduits(Map<String,String> produits) {
        this.produits = produits;
    }

    public String getDate_de_creation() {
        return date_de_creation;
    }

    public void setDate_de_creation(String date_de_creation) {
        this.date_de_creation = date_de_creation;
    }
}
