package com.example.antigaspillage.DAO;

import com.example.antigaspillage.data.Commercant;

import java.util.ArrayList;
import java.util.List;

public class CommercantImpl implements CommercantDAO {

private List<Commercant> commercantRepository = new ArrayList<>();

    @Override
    public List<Commercant> findAll() {
        return commercantRepository;
    }

    @Override
    public Commercant findByNom(String nom) throws Exception {
        for (Commercant commercant : commercantRepository) {
            if (commercant.getNom().equals(nom)) {
                return commercant;
            }
        }
        throw new Exception("Aucun commercant ne correspond a ce nom");
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
        throw new Exception("Aucun commercant ne correspond a cet emplacement");
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
        throw new Exception("Aucun commercant ne correspond a cette catégorie");
    }
}
