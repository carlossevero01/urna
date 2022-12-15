package com.ifsul.urnagaucha.urnagaucha.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Turnos")
public class turnos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int turnoId;

    @Column(nullable = false)
    private int turno;

    @Column(nullable = false)
    private String nomeTurno;

    //VER SE AQUI VAI A FORENG KEY CANDIDATOS

    public int getTurnoId() {
        return turnoId;
    }

    public void setTurnoId(int turnoId) {
        this.turnoId = turnoId;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public String getNomeTurno() {
        return nomeTurno;
    }

    public void setNomeTurno(String nomeTurno) {
        this.nomeTurno = nomeTurno;
    }

    public turnos() {
    }

    public turnos(int turno, String nomeTurno) {
        this.turno = turno;
        this.nomeTurno = nomeTurno;
    }

    @Override
    public String toString() {
        return "turnos [turnoId=" + turnoId + ", turno=" + turno + ", nomeTurno=" + nomeTurno + "]";
    }

    
    
}
