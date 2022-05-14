package com.example.antigaspillage.metier;

import com.example.antigaspillage.DAO.CompteDAO;
import com.example.antigaspillage.data.Panier;

import java.util.List;

public class CompteMetierImpl implements ICompteMetier{

    private CompteDAO compteDAO;

    @Override
    public List<Panier> listerPanierReserves(String nomUtilisateur) throws Exception {
        return compteDAO.listPaniersReservesUtilisateur(nomUtilisateur);
    }
}
