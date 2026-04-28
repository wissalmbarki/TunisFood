package com.tunisfood.models;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Wissal", "wissal@tn", "pass123");
        Panier panier = new Panier(client);

        Plat couscous = new Plat("Couscous", 18.50);
        Plat brik = new Plat("Brik", 4.50);

        panier.ajouterPlat(couscous, 2);
        panier.ajouterPlat(brik, 3);
        panier.afficherContenu();

        Commande cmd = new Commande("Rue de la Liberté, Tunis", panier.calculerTotal());
        cmd.confirmer();
        cmd.afficherDetails();
    }
}