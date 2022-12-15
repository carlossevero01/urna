package com.ifsul.urnagaucha.urnagaucha.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Candidatos")
public class candidatos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int candidatoId;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int tipo;

    @Column(nullable = false)
    private String cargo;

    @Column(nullable = false)                       
    private int numElegido;

    public int getCandidatoId() {
        return candidatoId;
    }

    public void setCandidatoId(int candidatoId) {
        this.candidatoId = candidatoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNumElegido() {
        return numElegido;
    }

    public void setNumElegido(int numElegido) {
        this.numElegido = numElegido;
    }

    public candidatos() {
    }

    public candidatos(String nome, int tipo, String cargo, int numElegido) {
        this.nome = nome;
        this.tipo = tipo;
        this.cargo = cargo;
        this.numElegido = numElegido;
    }

    @Override
    public String toString() {
        return "candidatos [candidatoId=" + candidatoId + ", nome=" + nome + ", tipo=" + tipo + ", cargo=" + cargo
                + ", numElegido=" + numElegido + "]";
    }

    
}
