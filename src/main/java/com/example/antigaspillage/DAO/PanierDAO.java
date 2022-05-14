package com.example.antigaspillage.DAO;

import com.example.antigaspillage.data.Panier;

import java.util.List;

public interface PanierDAO {

    public List<Panier> findAll() throws Exception;

    public List<Panier> findByCommercantNom(String commercant) throws Exception;

    public List<Panier> findByCategorie(String categorie) throws Exception;

    public List<Panier> findBylocalisation(String localisation) throws Exception;

    public Panier findById(int Id) throws Exception;

    public boolean isReserved(int Id) throws Exception;
}
