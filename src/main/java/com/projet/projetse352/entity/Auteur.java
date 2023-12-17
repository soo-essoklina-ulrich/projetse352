package com.projet.projetse352.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Auteur implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String password;

    public Auteur() {
    }


    @Override
    public String toString() {
        return String.format(
                "Auteur[id=%d, nom='%s', prenom='%s', email='%s', password='%s']",
                id, nom, prenom, email, password
        );
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


}
