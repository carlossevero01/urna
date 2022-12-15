package com.ifsul.urnagaucha.urnagaucha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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


        
        @GetMapping (value="/listcandidatos")     //@RequestMapping(value = "/listarCandidatos", method = RequestMethod.GET)
        @ResponseBody                       //@ResponseBody permite retornar um texto
        public List<candidatos> getCandidatos(){
            System.out.println("Entrou aqui Listou candidatos");
            return cRepository.findAll();
        } 
        @GetMapping (value="/listturnos")     //@RequestMapping(value = "/listarCandidatos", method = RequestMethod.GET)
        @ResponseBody                       //@ResponseBody permite retornar um texto
        public List<turnos> getTurnos(){
            System.out.println("Entrou aqui Listou turnos");
            System.out.println(tRepository.findAll().toString());
            return tRepository.findAll();
        } 
        @GetMapping (value="/listvotos")     //@RequestMapping(value = "/listarCandidatos", method = RequestMethod.GET)
        @ResponseBody                       //@ResponseBody permite retornar um texto
        public List<votos> getVotos(){
            System.out.println("Entrou aqui listou vagas");
            return vRepository.findAll();
        } 
        @GetMapping (value="/fimprimeiroturno")
        @ResponseBody
        public String fimPrimeiroTurno (){
            //SELECT MAX(COUNT(CandidatoID)) FROM votos 
            //SELECT CandidatoID ,COUNT(CandidatoID) from votos GROUP BY CandidatoID;  operação que conta votos
            return "Fim do primeiro turno";
        }
}
