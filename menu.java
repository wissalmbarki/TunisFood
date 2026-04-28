
/**
 * Fonctionnalité 3 : Menu & Photos des plats
 * Auteur : Molka (Étudiant C)
 * US-07 : Afficher la liste des plats
 * US-08 : Filtrer par catégorie
 * US-09 : Voir les photos des plats
 * US-10 : Filtrer par prix maximum
 * Lien Figma : https://www.figma.com/make/EbKpRlfaRUJ6YpujbluQ5i/TunisFood-Mobile-UI-Kit
 */public Menu() {
    plats.add(new Plat(1, "Couscous Tunisien", "Couscous au poulet et légumes de saison", 18.500, "Plat Principal", 30));
    plats.add(new Plat(2, "Brik à l'oeuf", "Brik croustillant fourré à l'oeuf et thon", 4.500, "Entrée", 10));
    plats.add(new Plat(3, "Lablabi", "Soupe de pois chiches épicée, spécialité de Tunis", 6.000, "Soupe", 15));
    plats.add(new Plat(4, "Tajine Tunisien", "Tajine à base d'oeufs, viande et légumes", 12.000, "Plat Principal", 25));
    plats.add(new Plat(5, "Makrouna Cha3riya", "Pâtes tunisiennes sauce tomate épicée", 9.500, "Plat Principal", 20));
} 
public void filtrerParPrix(double prixMax) {
    System.out.println("\n===== 💰 Plats à moins de " + prixMax + " DT =====");
    boolean trouve = false;
    for (Plat p : plats) {
        if (p.getPrix() <= prixMax) {
            System.out.println("   " + p.afficherDetails());
            trouve = true;
        }
    }
    if (!trouve) {
        System.out.println("Aucun plat trouvé dans ce budget.");
    }
}