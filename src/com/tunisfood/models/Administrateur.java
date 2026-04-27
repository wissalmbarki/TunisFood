package com.tunisfood.models;

import java.util.List;
import java.util.stream.Collectors;

public class Administrateur extends Utilisateur {
    public Administrateur(String nom, String email, String mdpHash) {
        super(nom, email, mdpHash, "ADMIN");
    }

    public void ajouterPlat(Plat plat, List<Plat> menu) {
        menu.add(plat);
        System.out.println("Plat ajouté : " + plat.getNom());
    }

    public void modifierPlat(Plat plat, String nouveauNom, double nouveauPrix) {
        plat.setNom(nouveauNom);
        plat.setPrix(nouveauPrix);
        System.out.println("Plat modifié");
    }

    // Sprint 1 provisoire
    public void voirStatistiques(List<Commande> toutesCommandes, List<Utilisateur> utilisateurs) {
        System.out.println("Statistiques : 5 commandes, 4 utilisateurs");
    }
}