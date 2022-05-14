package com.example.antigaspillage.DAO;

import com.example.antigaspillage.data.Comptes;
import com.example.antigaspillage.data.Panier;

import java.util.ArrayList;
import java.util.List;

public class CompteImpl implements CompteDAO{

    private List<Comptes> comptesRepository = new ArrayList<>();

    @Override
    public boolean isAdmin(String nom) throws Exception {
        for (Comptes compte : comptesRepository) {
            if(compte.getNomUtilisateur().equals(nom)) {
                return compte.isAdmin();
            }
        }
        throw new Exception("Ce compte n'existe pas !");
    }

    @Override
    public List<Panier> listPaniersReservesUtilisateur(String nomUtilisateur) throws Exception {
        for (Comptes compte : comptesRepository) {
            if (compte.getNomUtilisateur().equals(nomUtilisateur)) {
                return compte.getPanierList();
            }
        }
    throw new Exception("L'utilisateur : " + nomUtilisateur + " n'a pas encore réservé de panier.");
    }

}
