package com.ifsul.urnagaucha.urnagaucha.services;

import java.util.List;


import com.ifsul.urnagaucha.urnagaucha.model.candidatos;

public interface servicesCandidatos {
    List<candidatos> findAll();
    candidatos findById(Integer id);
    candidatos save(candidatos a);
    void DeleteById(Integer id);
    
}
