package com.tunisfood.models;

public class Livreur extends Utilisateur {
    private String vehicule;
    private boolean disponible;

    public Livreur() {}
    public Livreur(String nom, String email, String mdpHash, String vehicule) {
        super(nom, email, mdpHash, "LIVREUR");
        this.vehicule = vehicule;
        this.disponible = true;
    }

    public boolean accepterLivraison(Livraison livraison) {
        System.out.println("Livraison acceptée");
        return true;
    }

    public void voirItineraire(String adresseRetrait, String adresseClient) {
        System.out.println("Itinéraire : " + adresseRetrait + " → " + adresseClient);
    }

    public void mettreAJourStatut(String statut) {
        System.out.println("Statut mis à jour : " + statut);
    }
}