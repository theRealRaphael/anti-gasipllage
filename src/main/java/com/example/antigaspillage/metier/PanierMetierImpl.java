package com.example.antigaspillage.metier;

import com.example.antigaspillage.DAO.PanierDAO;
import com.example.antigaspillage.data.Panier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class PanierMetierImpl implements IPanierMetier{

    @Autowired
    private PanierDAO panierDAO;

//    private List<Panier>

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

    @Override
    public void setDao(PanierDAO dao) {
        this.panierDAO = dao;
    }

    @PostConstruct
    @Override
    public void init() {
        this.panierDAO.init();
    }

    @Override
    public void ajouterPanier(Panier panier) {
        panierDAO.add(panier);
    }
}
