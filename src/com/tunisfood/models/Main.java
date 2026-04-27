package com.tunisfood.models;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TunisFood - Sprint 1 ===\n");

        // Test Authentification (Wissal)
        Client client = new Client("Wissal Mbarki", "wissal@tunisfood.com", "hash123", "Tunis Centre");
        System.out.println("--- Auth ---");
        client.seConnecter("wissal@tunisfood.com", "mdp");
        client.mettreAJourProfil("Wissal Ben Ali", "wissal.mbarki@tunisfood.com");
        System.out.println(client);

        // Test Admin
        Administrateur admin = new Administrateur("Admin TunisFood", "admin@tunisfood.com", "adminHash");
        ArrayList<Plat> menu = new ArrayList<>();
        admin.voirStatistiques(new ArrayList<>(), new ArrayList<>());
    }
}