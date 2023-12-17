package com.projet.projetse352.services;

import com.projet.projetse352.entity.Auteur;
import com.projet.projetse352.repository.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AuteurServiceImpl implements AuteurService {

    @Autowired
    public  AuteurRepository auteurRepository;

    @Override
    public Auteur save(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    @Override
    public List<Auteur> getAllAuteurs() {
        return auteurRepository.findAll();
    }

    public Auteur getAuteurByID(Long id) {
        return auteurRepository.findById(id).orElse(null);
    }

    @Override
    public Auteur update(Long id) {
        Auteur auteurToUpdate = auteurRepository.findById(id).orElse(null);
        assert auteurToUpdate != null;
        return auteurRepository.save(auteurToUpdate);

    }

    @Override
    public void delete(Long id) {
        auteurRepository.deleteById(id);
    }
}
