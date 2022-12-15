package com.ifsul.urnagaucha.urnagaucha.model;



import java.util.List;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Turnos")
public class turnos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int turnoId;

    @Column(nullable = false)
    private String nomeTurno;

    // @ManyToOne(fetch = FetchType.EAGER, optional = false)
    // @JoinColumn(name = "CandidatoID", nullable = false)
    // @OnDelete(action = OnDeleteAction.CASCADE)
    // @JsonIgnore
    @OneToMany
    @JoinColumn(name = "CandidatoID") // Esta coluna está na tabela "evento".
    private List<candidatos> candidato;
    

    


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
    }

    

    @Override
    public String toString() {
        return "turnos [turnoId=" + turnoId + ", nomeTurno=" + nomeTurno + "]";
    }

    public List<candidatos> getCandidato() {
        return candidato;
    }

    public void setCandidato(List<candidatos> candidato) {
        this.candidato = candidato;
    }

    

   

    
    
}
