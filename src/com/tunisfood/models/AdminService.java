import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Client {

    private List<Commande> historiqueCommandes;

    public void consulterHistorique(String periode) {

        if (historiqueCommandes == null || historiqueCommandes.isEmpty()) {
            System.out.println("Aucune commande dans l'historique.");
            return;
        }

        LocalDate aujourdHui = LocalDate.now();

        // Filtrage selon la période
        List<Commande> commandesFiltrees = historiqueCommandes.stream()
                .filter(c -> {
                    LocalDate dateCommande = c.getDate().toLocalDate();
                    long jours = ChronoUnit.DAYS.between(dateCommande, aujourdHui);

                    if (periode.equalsIgnoreCase("semaine")) {
                        return jours <= 7;
                    } else if (periode.equalsIgnoreCase("mois")) {
                        return jours <= 30;
                    } else {
                        System.out.println("Période invalide (utilise 'semaine' ou 'mois')");
                        return false;
                    }
                })
                // Tri du plus récent au plus ancien
                .sorted(Comparator.comparing(Commande::getDate).reversed())
                .collect(Collectors.toList());

        // Affichage
        System.out.println("===== 🧾 HISTORIQUE (" + periode.toUpperCase() + ") =====");

        if (commandesFiltrees.isEmpty()) {
            System.out.println("Aucune commande pour cette période.");
        } else {
            commandesFiltrees.forEach(c -> {
                String reference = "CMD-" + String.format("%04d", c.getId());
                System.out.printf("%s | %.2f DT | %s%n",
                        reference,
                        c.getMontant(),
                        c.getStatut());
            });
        }

        System.out.println("=================================");
    }
}