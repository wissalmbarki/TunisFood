package com.tunisfood.models;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<LigneCommande> lignes;
    private Client client;

    // Constructeur avec client
    public Panier(Client client) {
        this.client = client;
        this.lignes = new ArrayList<>();
    }

    // Constructeur vide (optionnel)
    public Panier() {
        this.lignes = new ArrayList<>();
    }

    // Ajouter un plat (version Sprint 1)
    public void ajouterPlat(Plat plat, int quantite) {
        for (LigneCommande ligne : lignes) {
            if (ligne.getPlat().getNom().equals(plat.getNom())) {
                ligne.setQuantite(ligne.getQuantite() + quantite);
                System.out.println(quantite + " x " + plat.getNom() + " ajouté (quantité augmentée)");
                return;
            }
        }
        lignes.add(new LigneCommande(plat, quantite));
        System.out.println(quantite + " x " + plat.getNom() + " ajouté au panier");
    }

    // Calculer le total
    public double calculerTotal() {
        double total = 0;
        for (LigneCommande ligne : lignes) {
            total += ligne.getSousTotal();
        }
        return total;
    }

    // Afficher le contenu
    public void afficherContenu() {
        System.out.println("=== Panier de " + (client != null ? client.getNom() : "Client") + " ===");
        if (lignes.isEmpty()) {
            System.out.println("Le panier est vide.");
        } else {
            for (LigneCommande ligne : lignes) {
                System.out.println(ligne);
            }
            System.out.println("Total : " + calculerTotal() + " DT");
        }
    }

    // Getters et setters
    public List<LigneCommande> getLignes() {
        return lignes;
    }

    public void setLignes(List<LigneCommande> lignes) {
        this.lignes = lignes;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}