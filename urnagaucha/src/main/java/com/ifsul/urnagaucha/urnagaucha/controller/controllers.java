package com.ifsul.urnagaucha.urnagaucha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ifsul.urnagaucha.urnagaucha.model.candidatos;
import com.ifsul.urnagaucha.urnagaucha.model.turnos;
import com.ifsul.urnagaucha.urnagaucha.model.votos;
import com.ifsul.urnagaucha.urnagaucha.repository.candidatosRepository;
import com.ifsul.urnagaucha.urnagaucha.repository.turnosRepository;
import com.ifsul.urnagaucha.urnagaucha.repository.votosRepository;

@Controller
public class controllers {
    @Autowired
    candidatosRepository cRepository;
    @Autowired
    turnosRepository tRepository;
    @Autowired
    votosRepository vRepository;

    @GetMapping (value="/listarCandidatos")     //@RequestMapping(value = "/listarCandidatos", method = RequestMethod.GET)
    public List<candidatos> getCandidatos(){
        return cRepository.findAll();
    } 
        @GetMapping (value="/listarTurnos")     //@RequestMapping(value = "/listarCandidatos", method = RequestMethod.GET)
        public List<turnos> getTurnos(){
            return tRepository.findAll();
        } 
        @GetMapping (value="/listarVotos")     //@RequestMapping(value = "/listarCandidatos", method = RequestMethod.GET)
        public List<votos> getVotos(){
            return vRepository.findAll();
        } 
   
}
