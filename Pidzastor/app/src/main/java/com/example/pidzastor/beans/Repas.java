package com.example.pidzastor.beans;

public class Repas {
          private int id;
          static  int comp;
          private  String nom;
          private int nbrImgredients ;
          private  int photo;
          private  int icone;
          private  int icone1;

    public int getIcone2() {
        return icone2;
    }

    public void setIcone2(int icone2) {
        this.icone2 = icone2;
    }

    private  int icone2;

          private float duree;
          private String detaisIngred;
          private  String description;
          private String preparation;

    public Repas(String nom, int nbrImgredients, int photo, int icone, int icone1,int icone2, float duree, String detaisIngred, String description, String preparation) {


        this.comp++;
        this.id=comp;
        this.nom = nom;
        this.nbrImgredients = nbrImgredients;
        this.photo = photo;
        this.icone = icone;
        this.icone1 = icone1;
        this.icone2=icone2;
        this.duree = duree;
        this.detaisIngred = detaisIngred;
        this.description = description;
        this.preparation = preparation;
    }

    public int getNbrImgredients() {
        return nbrImgredients;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDetaisIngred(String detaisIngred) {
        this.detaisIngred = detaisIngred;
    }

    public String getDetaisIngred() {
        return detaisIngred;
    }

    public float getDuree() {
        return duree;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setNbrImgredients(int nbrImgredients) {
        this.nbrImgredients = nbrImgredients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }



    public int getIcone() {
        return icone;
    }

    public void setIcone(int icone) {
        this.icone = icone;
    }

    public int getIcone1() {
        return icone1;
    }

    public void setIcone1(int icone1) {
        this.icone1 = icone1;
    }
}
