package com.example.antigaspillage.data;

import java.util.List;

public class Comptes {

    private String nomUtilisateur;

    private String motDePasse;

    private boolean isAdmin;

    private List<Panier> panierList;

    public List<Panier> getPanierList() {
        return panierList;
    }

    public void setPanierList(List<Panier> panierList) {
        this.panierList = panierList;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
