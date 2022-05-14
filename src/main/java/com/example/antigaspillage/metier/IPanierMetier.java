package com.example.antigaspillage.metier;

import com.example.antigaspillage.data.Panier;

import java.util.List;

public interface IPanierMetier {

    public List<Panier> listerPaniers() throws Exception;

    public Panier rechercherPanierId(int id) throws Exception;

    public List<Panier> rechercherPanierCategorie(String categorie) throws Exception;

    public List<Panier> rechercherPanierNomCommercant(String nomCommercant) throws Exception;

    public List<Panier> rechercherPanierLocalisation(String localisation) throws Exception;
}
