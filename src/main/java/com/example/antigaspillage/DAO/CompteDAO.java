package com.example.antigaspillage.DAO;

import com.example.antigaspillage.data.Panier;

import java.util.List;

public interface CompteDAO {

    public boolean isAdmin(String nom) throws Exception;

    public List<Panier> listPaniersReservesUtilisateur(String nomUtilisateur) throws Exception;

}
