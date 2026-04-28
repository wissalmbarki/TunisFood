package com.tunisfood.models;

public class LigneCommande {
    private Plat plat;
    private int quantite;

    // Constructeur
    public LigneCommande(Plat plat, int quantite) {
        this.plat = plat;
        this.quantite = quantite;
    }

    // Calcul du sous-total
    public double getSousTotal() {
        return plat.getPrix() * quantite;
    }

    // Getters et setters
    public Plat getPlat() {
        return plat;
    }

    public void setPlat(Plat plat) {
        this.plat = plat;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return plat.getNom() + " x" + quantite + " = " + getSousTotal() + " DT";
    }
}