package com.example.antigaspillage.web;

import com.example.antigaspillage.data.Panier;
import com.example.antigaspillage.metier.ICompteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class AffichagePaniersReservesController {

    @Autowired
    private ICompteMetier compteMetier;

    @RequestMapping("/afficherPaniersReserves")
    public String affichagePaniersReserves(Model model, String nomUtilisateur) throws Exception {
        List<Panier> panierList = compteMetier.listerPanierReserves(nomUtilisateur);
        model.addAttribute("panier", panierList);
        return "panier";
    }
}
