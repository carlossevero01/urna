package com.ifsul.urnagaucha.urnagaucha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifsul.urnagaucha.urnagaucha.model.turnos;

public interface turnosRepository extends JpaRepository<turnos,Integer>{
     public void deleteBynomeTurno(String turno); 
}
