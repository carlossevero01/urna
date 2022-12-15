package com.ifsul.urnagaucha.urnagaucha.services.servicesImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ifsul.urnagaucha.urnagaucha.model.candidatos;
import com.ifsul.urnagaucha.urnagaucha.repository.candidatosRepository;
import com.ifsul.urnagaucha.urnagaucha.services.servicesCandidatos;

public class servicesImplementCandidatos implements servicesCandidatos{
    @Autowired
    candidatosRepository rCandidatos;
    @Override
    public List<candidatos> findAll() {
        return rCandidatos.findAll();
    }

    @Override
    public candidatos findById(Integer id) {
        return rCandidatos.findById(id).get();
    }

    @Override
    public candidatos save(candidatos a) {
        return rCandidatos.save(a);
    }

    @Override
    public void DeleteById(Integer id) {
        rCandidatos.deleteById(id);
    }
    
}
