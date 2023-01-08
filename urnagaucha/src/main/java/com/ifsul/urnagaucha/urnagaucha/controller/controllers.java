package com.ifsul.urnagaucha.urnagaucha.controller;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import com.ifsul.urnagaucha.urnagaucha.model.candidatos;
import com.ifsul.urnagaucha.urnagaucha.model.contagemVotos;
import com.ifsul.urnagaucha.urnagaucha.model.turnos;
import com.ifsul.urnagaucha.urnagaucha.model.votos;
import com.ifsul.urnagaucha.urnagaucha.repository.candidatosRepository;
import com.ifsul.urnagaucha.urnagaucha.repository.turnosRepository;
import com.ifsul.urnagaucha.urnagaucha.repository.votosRepository;

import jakarta.transaction.Transactional;

@Controller
public class controllers {
    @Autowired
    candidatosRepository cRepository;
    @Autowired
    turnosRepository tRepository;
    @Autowired
    votosRepository vRepository;
    private String pTurno= "Não ocorreu";
    private String sTurnoP= "Não vai ocorrer";
    
    private List<contagemVotos> listaVotos = new ArrayList<>();
    private List<contagemVotos> resultadoEmPrimeiroturno = new ArrayList<>();
    private List<contagemVotos> resultadoSegundoTurno = new ArrayList<>();
    private List<contagemVotos> candPres= new ArrayList<>(); 
    private List<contagemVotos> candSen= new ArrayList<>(); 
    private List<contagemVotos> candGov= new ArrayList<>();
    private List<contagemVotos> candDepFed= new ArrayList<>(); 
    private List<contagemVotos> candDepEst= new ArrayList<>(); 
    private long totalVotosPturno=0;
    
        
        @GetMapping (value="/listarCandidatos")     //@RequestMapping(value = "/listarCandidatos", method = RequestMethod.GET)
        @ResponseBody                               //@ResponseBody permite retornar um texto
        public List<candidatos> getCandidatos(){
            System.out.println("Entrou aqui Listou candidatos");
            return cRepository.findAll();
        } 
        @GetMapping (value="/listarTurnos")     //@RequestMapping(value = "/listarCandidatos", method = RequestMethod.GET)
        @ResponseBody                               //@ResponseBody permite retornar um texto
        public List<turnos> getTurnos(){
            System.out.println("Entrou aqui Listou turnos");
            System.out.println(tRepository.findAll().toString());
            return tRepository.findAll();
        } 
        @GetMapping (value="/listarVotos")     //@RequestMapping(value = "/listarCandidatos", method = RequestMethod.GET)
        @ResponseBody                               //@ResponseBody permite retornar um texto
        public List<votos> getVotos(){
            System.out.println("Entrou aqui listou votos");
            return vRepository.findAll();
        } 
        @GetMapping (value="/deletarVotos")     //@RequestMapping(value = "/listarCandidatos", method = RequestMethod.GET)
        @ResponseBody                               //@ResponseBody permite retornar um texto
        public String deletarVotos(){
            System.out.println("Entrou aqui deletou votos");
             vRepository.deleteAll();
             return "Todos os Votos foram deletados";
        } 
        @GetMapping (value="/listarVotosPrimeiroTurno")     //@RequestMapping(value = "/listarCandidatos", method = RequestMethod.GET)
        @ResponseBody                                       //@ResponseBody permite retornar um texto
        public List<contagemVotos> getVotosPrimeiroTurno(){
            if(pTurno.equalsIgnoreCase("Ocorreu")){
                System.out.println("Entrou aqui listou votos do primeiro turno");
                return  resultadoEmPrimeiroturno;
            }else{
                resultadoEmPrimeiroturno.clear();
                return  resultadoEmPrimeiroturno;
            } 
        } 
        @GetMapping (value="/listarVotosSegundoTurno")     //@RequestMapping(value = "/listarCandidatos", method = RequestMethod.GET)
        @ResponseBody                                       //@ResponseBody permite retornar um texto
        public List<contagemVotos> getVotosSegundoTurno(){
            if(sTurnoP.equalsIgnoreCase("Vai ocorrer")){
                System.out.println("Entrou aqui listou votos do segundo turno");
                return  resultadoSegundoTurno;
            }else{
                resultadoSegundoTurno.clear();
                return  resultadoSegundoTurno;
            } 
            
        } 

       
            
          
    @Transactional      // Colocar caso de Cannot Remove em deleteByturnoNome(String)
     @GetMapping(value="/iniciarVotacao")
     @ResponseBody
     public List<contagemVotos> votarTurno(){
        System.out.println("Iniciou votação");
        tRepository.deleteBynomeTurno("Segundo Turno");
        vRepository.deleteAll();
        pTurno="Não ocorreu";
        sTurnoP="Não vai ocorrer";
        totalVotosPturno=0;
        listaVotos.clear(); resultadoEmPrimeiroturno.clear(); resultadoSegundoTurno.clear();
        candPres.clear(); candSen.clear(); candGov.clear(); candDepFed.clear(); candDepEst.clear();
             int k = 0;
             for(int i = 0 ; i< 3500; i++){
             votos v = new votos();
                 if(k==0){
                     int random = (int)(Math.random() * 7) + 0; // 0-6
                     v.setTurno(1);
                     candidatos c = cRepository.findById(random).orElseThrow(null);
                     v.setCandidato(c);
                    
                     
                 } 
                  if(k==1){
                    int random = (int)(Math.random() * 7) + 7;  // 7-13
                      v.setTurno(1);
                      candidatos c = cRepository.findById(random).orElseThrow(null);
                      v.setCandidato(c);
                     
                     
                  } 
                  if(k==2){
                    int random = (int)(Math.random() * 7) + 14; // 14-20
                     v.setTurno(1);
                     candidatos c = cRepository.findById(random).orElseThrow(null);
                     v.setCandidato(c);                    
  
                   }
                 if(k==3){
                    int random = (int)(Math.random() * 7) + 21;// 21-27
                     v.setTurno(1);
                     candidatos c = cRepository.findById(random).orElseThrow(null);
                     v.setCandidato(c);
    
                 }
                 if(k==4){
                    int random = (int)(Math.random() * 7) + 28; // 28-34
                     v.setTurno(1);
                     candidatos c = cRepository.findById(random).orElseThrow(null);
                     v.setCandidato(c);
                    
                      k=-1;
                  }
                 
                vRepository.save(v);
                k++;
                 
        }          //Fim do For
        pTurno="Ocorreu";
        totalVotosPturno = vRepository.count();
        listaVotos = vRepository.countTotalVotosByCandidatoIdClass();
        
        for (contagemVotos voto : listaVotos) {
            
            contagemVotos cand = new contagemVotos(voto.getCandidatoId(), voto.getVotos(), voto.getCargo(), voto.getNome());
            if(voto.getCargo().equalsIgnoreCase("Presidente")){ candPres.add(cand); }
            if(voto.getCargo().equalsIgnoreCase("Senador")){ candSen.add(cand); }
            if(voto.getCargo().equalsIgnoreCase("Governador")){ candGov.add(cand); }
            if(voto.getCargo().equalsIgnoreCase("Dep Federal")){ candDepFed.add(cand); }
            if(voto.getCargo().equalsIgnoreCase("Dep Estadual")){  candDepEst.add(cand); }
            
        } //FIM FOR Contagem de votos
        long nTotalVotosPres=500;
        System.out.println("Total de votos:"+totalVotosPturno);
        System.out.println("Presidente"+candPres);
        System.out.println("SEN"+candSen);
        System.out.println("Gov"+candGov);
        System.out.println("DEP FED"+candDepFed);
        System.out.println("DEP EST"+candDepEst);
       
        if(candPres.get(0).getVotos()>=(nTotalVotosPres/2)+1){ sTurnoP="Não vai ocorrer"; } else {sTurnoP="Vai ocorrer";}
        
        System.out.println("Vai ocorrer segundo turno? "+sTurnoP);
        
        //fimturno 1
        resultadoEmPrimeiroturno.add(candPres.get(0));
        resultadoEmPrimeiroturno.add(candSen.get(0));
        resultadoEmPrimeiroturno.add(candGov.get(0));
        resultadoEmPrimeiroturno.add(candDepFed.get(0));
        resultadoEmPrimeiroturno.add(candDepEst.get(0));
        System.out.println("Resultado "+resultadoEmPrimeiroturno);
    if(sTurnoP.equalsIgnoreCase("Não vai ocorrer")){
        return resultadoEmPrimeiroturno;
    }else{
            System.out.println("Entrou no if do sTurnoP");
            vRepository.deleteAll();
            
            candidatos c1 = cRepository.findById(candPres.get(0).getCandidatoId()).orElseThrow(null);
            candidatos c2 = cRepository.findById(candPres.get(1).getCandidatoId()).orElseThrow(null);
            
           turnos t1 = new turnos("Segundo Turno",c1);
           tRepository.save(t1);
           turnos t2 = new turnos("Segundo Turno",c2);
           tRepository.save(t2);
           
           
           for(int i=0;i<3500;i++){
           votos v = new votos();
           int random =  (int)(Math.random() * 50) + 50; //50-100
           
           v.setTurno(2);
                if(random>50){ 
                    v.setCandidato(c1);
                vRepository.save(v);
                    }
                else{
                    v.setCandidato(c2);
                    vRepository.save(v);
                }
            }
    resultadoSegundoTurno.add(vRepository.countTotalVotosByCandidatoIdClass().get(0));
    resultadoSegundoTurno.add(candSen.get(0));
    resultadoSegundoTurno.add(candGov.get(0));
    resultadoSegundoTurno.add(candDepFed.get(0));
    resultadoSegundoTurno.add(candDepEst.get(0));
    return resultadoSegundoTurno;
     //Fim 2 turno
    }   //Fim método 
     }

}
