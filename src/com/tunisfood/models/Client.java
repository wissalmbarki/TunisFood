package com.tunisfood.models;

import java.util.ArrayList;
import java.util.List;

public class Client extends Utilisateur {
    private String adresseLivraison;
    private List<Commande> historiqueCommandes = new ArrayList<>();

    public Client() {}
    public Client(String nom, String email, String mdpHash, String adresseLivraison) {
        super(nom, email, mdpHash, "CLIENT");
        this.adresseLivraison = adresseLivraison;
    }

    public String getAdresseLivraison() { return adresseLivraison; }
    public void setAdresseLivraison(String adresseLivraison) { this.adresseLivraison = adresseLivraison; }
    public List<Commande> getHistoriqueCommandes() { return historiqueCommandes; }

    // Sprint 1 provisoire
    public Commande passerCommande(Panier panier, String adresse) {
        System.out.println("Commande passée depuis panier");
        return new Commande();
    }

    public List<Commande> consulterHistorique() {
        System.out.println("Affichage historique");
        return historiqueCommandes;
    }

    public void ajouterAvis(Commande commande, int note, String commentaire) {
        System.out.println("Avis ajouté");
    }
}