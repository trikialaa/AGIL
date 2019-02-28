package com.looboo.agil.Entities.FirebaseEntities;

import java.util.ArrayList;

public class livraison {

    private String id;
    private String id_dep;
    private ArrayList<Integer> id_commande;
    private String dateheure;

    public livraison() {

    }

    public String getDateheure() {
        return dateheure;
    }

    public void setDateheure(String dateheure) {
        this.dateheure = dateheure;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_dep() {
        return id_dep;
    }

    public void setId_dep(String id_dep) {
        this.id_dep = id_dep;
    }

    public ArrayList<Integer> getId_commande() {
        return id_commande;
    }

    public void setId_commande(ArrayList<Integer> id_commande) {
        this.id_commande = id_commande;
    }
}
