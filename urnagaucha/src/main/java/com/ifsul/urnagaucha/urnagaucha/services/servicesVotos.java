package com.ifsul.urnagaucha.urnagaucha.services;


import java.util.List;

import com.ifsul.urnagaucha.urnagaucha.model.votos;

public interface servicesVotos {
    List<votos> findAll();
    votos findById(Integer id);
    votos save(votos a);
    void deleteById(Integer id);
    void deleteAll();
    List<Object[]> countTotalVotosByCandidatoIdClass();
    void deleteByturno(Integer turno); 
}
