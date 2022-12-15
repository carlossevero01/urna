package com.ifsul.urnagaucha.urnagaucha.services;

import java.util.List;

import com.ifsul.urnagaucha.urnagaucha.model.turnos;

public interface servicesTurnos {
    List<turnos> findAll();
    turnos findById(Integer id);
    turnos save(turnos a);
    void DeleteById(Integer id);
}
