package com.example.antigaspillage.DAO;

import com.example.antigaspillage.data.Panier;

import java.util.ArrayList;
import java.util.List;

public class ProduitImpl implements ProduitDAO {

    private List<Panier> panierRepository = new ArrayList<>();

    @Override
    public List<Panier> findAll() {
        return panierRepository;
    }

    @Override
    public List<Panier> findByCommercantNom(String commercantNom) throws Exception {
        List<Panier> resPanier = null;
        for (Panier panier : panierRepository) {
            if (panier.getNomCommercant().equals(commercantNom)){
                resPanier.add(panier);
            }
        }
        if (!resPanier.isEmpty()){
            return resPanier;
        }
        throw new Exception("Il n'éxiste pas de panier pour ce commercant");
    }

    @Override
    public List<Panier> findByCategorie(String categorie) throws Exception {
        List<Panier> resPanier = null;
        for (Panier panier : panierRepository) {
            if (panier.getCatégorie().equals(categorie)) {
                resPanier.add(panier);
            }
        }
        if (!resPanier.isEmpty()){
            return resPanier;
        }
        throw new Exception("Il n'éxiste pas de panier pour cette catégorie");
    }

    @Override
    public List<Panier> findBylocalisation(String localisation) throws Exception {
        List<Panier> resPanier = null;
        for (Panier panier : panierRepository) {
            if (panier.getLocalisation().equals(localisation)){
                resPanier.add(panier);
            }
        }
        if (!resPanier.isEmpty()){
            return resPanier;
        }
        throw new Exception("Il n'éxiste pas de panier pour cette localisation");
    }

    @Override
    public Panier findById(int Id) throws Exception {
        for (Panier panier : panierRepository) {
            if (panier.getId() == Id) {
                return panier;
            }
        }
        throw new Exception("Il n'éxiste pas de panier pour cet ID");
    }

}
