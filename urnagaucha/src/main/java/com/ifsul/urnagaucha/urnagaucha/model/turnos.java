package com.ifsul.urnagaucha.urnagaucha.model;



import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name="turnos")
public class turnos implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int turnoId;

    @Column(nullable = false)
    private String nomeTurno;

    // @ManyToOne(fetch = FetchType.EAGER, optional = false)
    // @JoinColumn(name = "CandidatoID", nullable = false)
    // @OnDelete(action = OnDeleteAction.CASCADE)
    // @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "CandidatoID") // Esta coluna está na tabela "evento".
    private candidatos candidato;
    

    


    public turnos(String nomeTurno, candidatos candidato) {
        this.nomeTurno = nomeTurno;
        this.candidato = candidato;
    }

    public int getTurnoId() {
        return turnoId;
    }

    public void setTurnoId(int turnoId) {
        this.turnoId = turnoId;
    }

   
    public String getNomeTurno() {
        return nomeTurno;
    }

    public void setNomeTurno(String nomeTurno) {
        this.nomeTurno = nomeTurno;
    }

    public turnos() {
        this.nomeTurno="";
        this.candidato= new candidatos();
    }

    

    @Override
    public String toString() {
        return "turnos:\n turnoId=" + turnoId + "\n nomeTurno=" + nomeTurno + "\n candidato="+ candidato.getCandidatoId();
    }

    public candidatos getCandidato() {
        return candidato;
    }

    public void setCandidato(candidatos candidato) {
        this.candidato = candidato;
    }

    

   

    
    
}
