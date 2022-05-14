package com.example.antigaspillage.data;

public class Panier {

    private String categorie;

    private String localisation;

    private int Id;

    //private List<String> listeDeProduits;

    private String nomCommercant;

    private boolean isReserved;

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
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

    /*public List<String> getListeDeProduits() {
        return listeDeProduits;
    }

    public void setListeDeProduits(List<String> listeDeProduits) {
        this.listeDeProduits = listeDeProduits;
    }
*/

    public String getNomCommercant(){
        return nomCommercant;
    }

    public void setCommercant(String nomCommercant) {
        this.nomCommercant = nomCommercant;
    }

    public Panier(String categorie, String localisation, int id, String nomCommercant, boolean isReserved){
        this.categorie = categorie;
        this.localisation = localisation;
        this.Id = id;
        this.nomCommercant = nomCommercant;
        this.isReserved = isReserved;
    }

}
