package com.tunisfood.models;

public abstract class Utilisateur {
    private String nom;
    private String email;
    private String motDePasseHash;
    private String role;

    public Utilisateur() {}
    public Utilisateur(String nom, String email, String motDePasseHash, String role) {
        this.nom = nom;
        this.email = email;
        this.motDePasseHash = motDePasseHash;
        this.role = role;
    }

    // Getters / Setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getMotDePasseHash() { return motDePasseHash; }
    public void setMotDePasseHash(String motDePasseHash) { this.motDePasseHash = motDePasseHash; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    // Méthodes métier (provisoires Sprint 1)
    public boolean seConnecter(String email, String mdp) {
        System.out.println("Connexion tentée pour " + email);
        return true; // provisoire
    }

    public void seDeconnecter() {
        System.out.println("Déconnexion");
    }

    public void mettreAJourProfil(String nom, String email) {
        this.nom = nom;
        this.email = email;
        System.out.println("Profil mis à jour");
    }

    @Override
    public String toString() {
        return role + " : " + nom + " (" + email + ")";
    }
}