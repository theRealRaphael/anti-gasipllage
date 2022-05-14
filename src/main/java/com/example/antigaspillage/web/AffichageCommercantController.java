package com.example.antigaspillage.web;

import com.example.antigaspillage.data.Commercant;
import com.example.antigaspillage.metier.ICommercantMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class AffichageCommercantController {

    @Autowired
    private ICommercantMetier commercantMetier;

    @RequestMapping("/afficherCommercants")
    public String affichageCommercant(Model model) throws Exception {
        List<Commercant> commercantList = commercantMetier.listerCommercants();
        model.addAttribute("commercant", commercantList);
        return "commercant";
    }

    @RequestMapping("/rechercherCommercantNom")
    public String rechercheCommercantNom(Model model, String nom) throws Exception {
        model.addAttribute("commercant", commercantMetier.rechercherCommercantNom(nom));
        return "commercant";
    }

    @RequestMapping("/rechercherCommercantNom")
    public String rechercheCategorie(Model model, String categorie) throws Exception {
        model.addAttribute("commercant", commercantMetier.rechercherCommercantCatégorie(categorie));
        return "commercant";
    }

    @RequestMapping("/rechercherCommercantNom")
    public String rechercheLocalisation(Model model, String localisation) throws Exception {
        model.addAttribute("commercant", commercantMetier.rechercherCommercantLocalisation(localisation));
        return "commercant";
    }

}
