package com.example.pidzastor.beans;

public class cathegorie {
    private String name;
  static int compt;
    public cathegorie(String name, int image) {
        this.name = name;
        this.image = image;
        compt++;
        this.id=compt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private  int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
