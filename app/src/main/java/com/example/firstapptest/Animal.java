package com.example.firstapptest;


import android.graphics.drawable.Drawable;

public class Animal {
    private Drawable image;
    private String name;
    private String description;

    public Animal(Drawable image, String name, String description) {
        this.image = image;
        this.name = name;
        this.description = description;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
