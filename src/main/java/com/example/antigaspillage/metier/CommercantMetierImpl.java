package com.example.antigaspillage.metier;

import com.example.antigaspillage.DAO.CommercantDAO;
import com.example.antigaspillage.data.Commercant;

import java.util.List;

public class CommercantMetierImpl implements ICommercantMetier{

    private CommercantDAO commercantDAO;

    @Override
    public List<Commercant> listerCommercants() throws Exception {
        return commercantDAO.findAll();
    }

    @Override
    public Commercant rechercherCommercantNom(String commercantNom) throws Exception {
        return commercantDAO.findByNom(commercantNom);
    }

    @Override
    public List<Commercant> rechercherCommercantCatégorie(String categorie) throws Exception {
        return commercantDAO.findByCategorie(categorie);
    }

    @Override
    public List<Commercant> rechercherCommercantLocalisation(String localisation) throws Exception {
        return commercantDAO.findByLocalisation(localisation);
    }
}
