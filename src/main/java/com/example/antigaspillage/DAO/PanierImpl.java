package com.example.antigaspillage.DAO;

import com.example.antigaspillage.data.Panier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class PanierImpl implements PanierDAO {

    private List<Panier> panierRepository = new ArrayList<>();

    @Bean
    @Override
    public List<Panier> findAll() throws Exception {
        if (!panierRepository.isEmpty()){
            return panierRepository;
        }
        throw new Exception("Il n'y a aucun panier d'enregistré !");
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
        throw new Exception("Il n'éxiste pas de panier pour le commercant : " + commercantNom);
    }

    @Override
    public List<Panier> findByCategorie(String categorie) throws Exception {
        List<Panier> resPanier = null;
        for (Panier panier : panierRepository) {
            if (panier.getCategorie().equals(categorie)) {
                resPanier.add(panier);
            }
        }
        if (!resPanier.isEmpty()){
            return resPanier;
        }
        throw new Exception("Il n'éxiste pas de panier pour la catégorie : " + categorie);
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
        throw new Exception("Il n'éxiste pas de panier pour la localisation : " + localisation);
    }

    @Override
    public Panier findById(int Id) throws Exception {
        for (Panier panier : panierRepository) {
            if (panier.getId() == Id) {
                return panier;
            }
        }
        throw new Exception("Il n'éxiste pas de panier pour l'ID : " + Id);
    }

    @Override
    public boolean isReserved(int Id) throws Exception {
        for (Panier panier : panierRepository) {
            if (panier.getId() == Id){
                return panier.isReserved();
            }
        }
        throw new Exception("Ce panier ayant pour Id : " + Id + " n'éxiste pas.");
    }

    @Override
    public void add(Panier panier) {
        panierRepository.add(panier);
    }

    @Override
    public void init() {
        panierRepository.add(new Panier("legumes", "tours", 1, "Jean Dupont", false));
        panierRepository.add(new Panier("fruits", "monts", 2, "John Doe", false));
        panierRepository.add(new Panier("burgers", "joué-les-tours", 3, "Salt Bay", false));
    }

}
