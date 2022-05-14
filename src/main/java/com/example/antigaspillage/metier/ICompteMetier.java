package com.example.antigaspillage.metier;

import com.example.antigaspillage.data.Panier;

import java.util.List;

public interface ICompteMetier {

    public List<Panier> listerPanierReserves(String nomUtilisateur) throws Exception;

}
