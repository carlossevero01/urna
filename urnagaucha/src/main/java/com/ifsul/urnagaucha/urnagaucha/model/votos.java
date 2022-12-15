package com.ifsul.urnagaucha.urnagaucha.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Votos")
public class votos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int votoId;

    @Column(nullable = false)
    private int turno;

    //VER SE AQUI VAI A FORENG KEY CANDIDATOS

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

    
}
