package com.ifsul.urnagaucha.urnagaucha.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name="Votos")
public class votos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int votoId;

    @Column(nullable = false)
    private int turno;

    
    @ManyToOne
    @JoinColumn(name = "CandidatoID") // Esta coluna está na tabela "evento".
    private candidatos candidato;



    public int getVotoId() {
        return votoId;
    }

    public void setVotoId(int votoId) {
        this.votoId = votoId;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public votos() {
    }

    public votos(int turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "votos [votoId=" + votoId + ", turno=" + turno + "]";
    }

    public candidatos getCandidato() {
        return candidato;
    }

    public void setCandidato(candidatos candidato) {
        this.candidato = candidato;
    }

    

    
}
