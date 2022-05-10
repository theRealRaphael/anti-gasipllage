package com.example.antigaspillage.DAO;

import com.example.antigaspillage.data.Commercant;

import java.util.List;

public interface CommercantDAO {

    public List<Commercant> findAll();

    public Commercant findByNom(String nom) throws Exception;

    public List<Commercant> findByLocalisation(String localisation) throws Exception;

    public List<Commercant> findByCategorie(String categorie) throws Exception;

}
