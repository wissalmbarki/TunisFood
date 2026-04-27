package com.tunisfood.models;

public class Commande {
    private String statut;

    public Commande() {
        this.statut = "EN_ATTENTE";
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}