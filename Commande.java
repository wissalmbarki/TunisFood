package com.tunisfood.models;

import java.time.LocalDateTime;

public class Commande {
    private static int compteur = 1;
    private String reference;
    private String adresseLivraison;
    private String statut;
    private double total;
    private LocalDateTime date;

    // Constructeur
    public Commande(String adresseLivraison, double total) {
        this.reference = "CMD-" + String.format("%04d", compteur++);
        this.adresseLivraison = adresseLivraison;
        this.statut = "En attente";
        this.total = total;
        this.date = LocalDateTime.now();
    }

    // Confirmer la commande
    public void confirmer() {
        this.statut = "Confirmée";
        System.out.println("Commande " + reference + " confirmée !");
    }

    // Afficher les détails
    public void afficherDetails() {
        System.out.println("Référence : " + reference);
        System.out.println("Adresse : " + adresseLivraison);
        System.out.println("Statut : " + statut);
        System.out.println("Total : " + total + " DT");
        System.out.println("Date : " + date);
    }

    // Getters et setters
    public String getReference() { return reference; }
    public String getAdresseLivraison() { return adresseLivraison; }
    public void setAdresseLivraison(String adresseLivraison) { this.adresseLivraison = adresseLivraison; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
    public LocalDateTime getDate() { return date; }
