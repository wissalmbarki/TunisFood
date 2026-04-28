package com.tunisfood.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Fonctionnalité 3 : Menu & Photos des plats
 * Auteur : Molka (Étudiant C)
 * US-07, US-08, US-09, US-10
 */
public class Plat {
    private int id;
    private String nom;
    private String description;
    private double prix;
    private String categorie;
    private int tempsPreparation;
    private List<String> photosUrl;

    public Plat(int id, String nom, String description, double prix, String categorie, int tempsPreparation) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.categorie = categorie;
        this.tempsPreparation = tempsPreparation;
        this.photosUrl = new ArrayList<>();
    }

    public void ajouterPhoto(String url) {
        this.photosUrl.add(url);
    }

    public String getNom() { return nom; }
    public String getCategorie() { return categorie; }
    public double getPrix() { return prix; }
    public int getTempsPreparation() { return tempsPreparation; }
    public List<String> getPhotosUrl() { return photosUrl; }

    public String afficherDetails() {
        return "🍽️ " + nom + " | " + categorie + " | " + prix + " DT | " + description;
    }
}