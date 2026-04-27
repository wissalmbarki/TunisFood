import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utilisateur {

    private String email;
    private String motDePasseHash;
    private int tentativesEchouees = 0;
    private long bloqueJusqua = 0; // timestamp en millisecondes

    public Utilisateur(String email, String motDePasseHash) {
        this.email = email;
        this.motDePasseHash = motDePasseHash;
    }

    public boolean seConnecter(String email, String motDePasse) {

        long maintenant = System.currentTimeMillis();

        // Vérifier si le compte est bloqué
        if (maintenant < bloqueJusqua) {
            System.out.println("Compte bloqué 5 minutes");
            return false;
        }

        // Vérifier l'email
        if (!this.email.equals(email)) {
            System.out.println("Email incorrect");
            return false;
        }

        // Hasher le mot de passe fourni
        String hashEntre = hashSHA256(motDePasse);

        // Vérifier le mot de passe
        if (this.motDePasseHash.equals(hashEntre)) {
            System.out.println("Connexion réussie !");
            tentativesEchouees = 0; // reset
            return true;
        } else {
            tentativesEchouees++;
            System.out.println("Mot de passe incorrect");

            if (tentativesEchouees >= 3) {
                bloqueJusqua = maintenant + (5 * 60 * 1000); // 5 minutes
                System.out.println("Compte bloqué 5 minutes");
            }

            return false;
        }
    }

    // Méthode pour hasher avec SHA-256
    private String hashSHA256(String motDePasse) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(motDePasse.getBytes());

            StringBuilder hexString = new StringBuilder();

            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erreur lors du hashage SHA-256", e);
        }
    }
}