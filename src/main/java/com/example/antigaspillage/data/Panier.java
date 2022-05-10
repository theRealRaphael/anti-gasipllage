package com.example.antigaspillage.data;

import java.util.List;

public class Panier {

    private String catégorie;

    private String localisation;

    private int Id;

    private List<String> listeDeProduits;

    private String nomCommercant;

    public String getCatégorie() {
        return catégorie;
    }

    public void setCatégorie(String catégorie) {
        this.catégorie = catégorie;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public List<String> getListeDeProduits() {
        return listeDeProduits;
    }

    public void setListeDeProduits(List<String> listeDeProduits) {
        this.listeDeProduits = listeDeProduits;
    }

    public String getNomCommercant(){
        return nomCommercant;
    }

    public void setCommercant(String nomCommercant) {
        this.nomCommercant = nomCommercant;
    }

}
