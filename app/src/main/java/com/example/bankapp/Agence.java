package com.example.bankapp;

import com.google.android.gms.maps.model.LatLng;

public class Agence {
    String nom;
    String adresse;
    String responsable;
    String telephone;
    LatLng position;

    public Agence(String nom, String adresse, String responsable, String telephone, LatLng position) {
        this.nom = nom;
        this.adresse = adresse;
        this.responsable = responsable;
        this.telephone = telephone;
        this.position = position;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getResponsable() {
        return responsable;
    }

    public String getTelephone() {
        return telephone;
    }

    public LatLng getPosition() {
        return position;
    }
}

