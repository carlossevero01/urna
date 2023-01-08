package com.ifsul.urnagaucha.urnagaucha.services.servicesImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ifsul.urnagaucha.urnagaucha.model.turnos;
import com.ifsul.urnagaucha.urnagaucha.repository.turnosRepository;
import com.ifsul.urnagaucha.urnagaucha.services.servicesTurnos;

public class servicesImplementTurnos implements servicesTurnos{
    @Autowired
    turnosRepository tRepository;
    @Override
    public List<turnos> findAll() {
        return tRepository.findAll();
    }

    @Override
    public turnos findById(Integer id) {
        return tRepository.findById(id).get();
    }

    @Override
    public turnos save(turnos a) {
        return tRepository.save(a);
    }

    @Override
    public void deleteById(Integer id) {
        tRepository.deleteById(id);
    }

    

    @Override
    public void deleteBynomeTurno(String turno) {
        tRepository.deleteBynomeTurno(turno);
        
    }
    
}
