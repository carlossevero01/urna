package com.ifsul.urnagaucha.urnagaucha.services.servicesImplement;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ifsul.urnagaucha.urnagaucha.model.votos;
import com.ifsul.urnagaucha.urnagaucha.repository.votosRepository;
import com.ifsul.urnagaucha.urnagaucha.services.servicesVotos;

public class servicesImplementVotos implements servicesVotos{
    @Autowired
    votosRepository vRepository;
    @Override
    public List<votos> findAll() {
        return vRepository.findAll();
    }

    @Override
    public votos findById(Integer id) {
        return vRepository.findById(id).get();
    }

    @Override
    public votos save(votos a) {
        return vRepository.save(a);
    }

    @Override
    public void deleteById(Integer id) {
        vRepository.deleteById(id);
    }

   
    @Override
    public List<Object[]> countTotalVotosByCandidatoIdClass() {
        
        return  countTotalVotosByCandidatoIdClass();
    }

    @Override
    public void deleteAll() {
        vRepository.deleteAll();
        
    }

    @Override
    public void deleteByturno(Integer turno) {
        deleteByturno( turno); 
        
    }



   

    
    
}
