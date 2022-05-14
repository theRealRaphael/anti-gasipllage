package com.example.antigaspillage.DAO;

import com.example.antigaspillage.data.Commercant;

import java.util.ArrayList;
import java.util.List;

public class CommercantImpl implements CommercantDAO {

private List<Commercant> commercantRepository = new ArrayList<>();

    @Override
    public List<Commercant> findAll() throws Exception {
        if (!commercantRepository.isEmpty()) {
            return commercantRepository;
        }
        throw new Exception("Il n'y a aucun commerdant d'enregistré !");
    }

    @Override
    public Commercant findByNom(String nom) throws Exception {
        for (Commercant commercant : commercantRepository) {
            if (commercant.getNom().equals(nom)) {
                return commercant;
            }
        }
        throw new Exception("Aucun commercant ne correspond au nom : " + nom);
    }

    @Override
    public List<Commercant> findByLocalisation(String localisation) throws Exception {
        List<Commercant> resCommercant = null;
        for (Commercant commercant : commercantRepository) {
            if (commercant.getLocalisation().equals(localisation)){
                resCommercant.add(commercant);
            }
        }
        if (!resCommercant.isEmpty()) {
            return resCommercant;
        }
        throw new Exception("Aucun commercant ne correspond a l'emplacement : " + localisation);
    }

    @Override
    public List<Commercant> findByCategorie(String categorie) throws Exception {
        List<Commercant> resCommercant = null;
        for (Commercant commercant : commercantRepository) {
            if (commercant.getCatégorie().equals(categorie)) {
                resCommercant.add(commercant);
            }
        }
        if (!resCommercant.isEmpty()){
            return resCommercant;
        }
        throw new Exception("Aucun commercant ne correspond a la catégorie : " + categorie);
    }
}
