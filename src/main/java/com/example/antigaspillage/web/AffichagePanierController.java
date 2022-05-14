package com.example.antigaspillage.web;

import com.example.antigaspillage.data.Panier;
import com.example.antigaspillage.metier.IPanierMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class AffichagePanierController {

    @Autowired
    private IPanierMetier panierMetier;

    @RequestMapping("/afficherPaniers")
    public String affichagePaniers(Model model) throws Exception {
        List<Panier> panierList = panierMetier.listerPaniers();
        model.addAttribute("panier", panierList);
        return "panier";
    }

    @RequestMapping("/rechercherPaniersId")
    public String recherchePanierId(Model model, int id) throws Exception {
        model.addAttribute("panier", panierMetier.rechercherPanierId(id));
        return "panier";
    }

    @RequestMapping("/rechercherPanierCommercantNom")
    public String rechercherPanierCommercantNom(Model model, String commercantNom) throws Exception {
        model.addAttribute("panier", panierMetier.rechercherPanierNomCommercant(commercantNom));
        return "panier";
    }

    @RequestMapping("/rechercherPanierCategorie")
    public String rechercherPanierCategorie(Model model, String commercantNom) throws Exception {
        model.addAttribute("panier", panierMetier.rechercherPanierCategorie(commercantNom));
        return "panier";
    }

    @RequestMapping("/rechercherPanierLocalisation")
    public String rechercherPanierlocalisation(Model model, String commercantNom) throws Exception {
        model.addAttribute("panier", panierMetier.rechercherPanierLocalisation(commercantNom));
        return "panier";
    }

}
