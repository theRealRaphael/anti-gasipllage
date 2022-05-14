package com.example.antigaspillage.metier;

import com.example.antigaspillage.DAO.PanierDAO;
import com.example.antigaspillage.data.Panier;

import java.util.List;

public class PanierMetierImpl implements IPanierMetier{

    private PanierDAO panierDAO;

    @Override
    public List<Panier> listerPaniers() throws Exception {
        return panierDAO.findAll();
    }

    @Override
    public Panier rechercherPanierId(int id) throws Exception {
        return panierDAO.findById(id);
    }

    @Override
    public List<Panier> rechercherPanierCategorie(String categorie) throws Exception {
        return panierDAO.findByCategorie(categorie);
    }

    @Override
    public List<Panier> rechercherPanierNomCommercant(String nomCommercant) throws Exception {
        return panierDAO.findByCommercantNom(nomCommercant);
    }

    @Override
    public List<Panier> rechercherPanierLocalisation(String localisation) throws Exception {
        return panierDAO.findBylocalisation(localisation);
    }
}
