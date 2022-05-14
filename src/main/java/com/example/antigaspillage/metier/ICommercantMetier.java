package com.example.antigaspillage.metier;

import com.example.antigaspillage.data.Commercant;

import java.util.List;

public interface ICommercantMetier {

    public List<Commercant> listerCommercants() throws Exception;

    public Commercant rechercherCommercantNom(String commercantNom) throws Exception;

    public List<Commercant> rechercherCommercantCatégorie(String categorie) throws Exception;

    public List<Commercant> rechercherCommercantLocalisation(String localisation) throws Exception;
}
