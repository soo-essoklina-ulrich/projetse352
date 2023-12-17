package com.projet.projetse352.controller;


import com.projet.projetse352.entity.Auteur;
import com.projet.projetse352.services.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuteurController {

    @Autowired
    private AuteurService auteurService;


    @RequestMapping(method = RequestMethod.GET, value = "/auteur/list")
    public String getAll() {
        List<Auteur> auteurs = auteurService.getAllAuteurs();
        return auteurs != null ? auteurs.toString() : "Error";
    }


    @RequestMapping(method = RequestMethod.POST, value = "/auteur/add")
    public String add(@RequestBody Auteur auteur) {

        if (auteur!=null) {
            auteurService.save(auteur);
            return auteurService.save(auteur) != null ? String.valueOf(new ResponseEntity<>("Auteur added successfully", HttpStatus.OK)) : "Error";
        } else
            return String.valueOf(new ResponseEntity<>("Auteur not added", HttpStatus.BAD_REQUEST));

    }


    @RequestMapping(method = RequestMethod.GET, value = "/auteur/getById/{id}")
    public String getById(@PathVariable("id") Long id) {
        Auteur auteur = auteurService.getAuteurByID(id);
        return auteur != null ? auteur.toString() : "Error";

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/auteur/update/{id}")
    public String update(@RequestBody @PathVariable Long id ) {
        return auteurService.update(id) != null ? "Main" : "Error";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/auteur/delete/{id}")
    public String deleter(@PathVariable Long id) {
        auteurService.delete(id);
        return String.valueOf(new ResponseEntity<>("Auteur delete", HttpStatus.OK));
    }
}
