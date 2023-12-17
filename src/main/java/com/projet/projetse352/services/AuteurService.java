package com.projet.projetse352.services;

import com.projet.projetse352.entity.Auteur;

import java.util.List;

public interface AuteurService {

    Auteur save(Auteur auteur);

    List<Auteur> getAllAuteurs();

    Auteur getAuteurByID(Long id);

    Auteur update(Long id);

    void delete(Long id);
}
