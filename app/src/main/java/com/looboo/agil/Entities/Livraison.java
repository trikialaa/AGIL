package com.looboo.agil.Entities;

import java.util.ArrayList;

public class Livraison {

    public String id;
    public String id_dep;
    public String dateHeure;
    public String type;
    public ArrayList<Commande> commandeList;

    public Livraison() {
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

    public String getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(String dateHeure) {
        this.dateHeure = dateHeure;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Commande> getCommandeList() {
        return commandeList;
    }

    public void setCommandeList(ArrayList<Commande> commandeList) {
        this.commandeList = commandeList;
    }
}
