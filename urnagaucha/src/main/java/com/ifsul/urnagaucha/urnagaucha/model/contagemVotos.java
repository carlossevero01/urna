package com.ifsul.urnagaucha.urnagaucha.model;



public class contagemVotos {
    private Integer candidatoId;
    private Long votos;
    private String cargo;
    private String nome;
   
    

    public contagemVotos(Integer candidatoId, Long votos, String cargo, String nome) {
        this.candidatoId = candidatoId;
        this.votos = votos;
        this.cargo= cargo;
        this.nome=nome;
    }

    public Integer getCandidatoId() {
        return candidatoId;
    }

    public void setCandidatoId(Integer candidatoId) {
        this.candidatoId = candidatoId;
    }

    public Long getVotos() {
        return votos;
    }

    public void setVotos(Long votos) {
        this.votos = votos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "contagemVotos: "+
        "\n  candidatoId=" + candidatoId +
        "\n nome =" + nome +  
        "\n votos=" + votos + 
        "\n cargo=" + cargo ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public contagemVotos() {
        this.candidatoId = 0;
        this.votos = (long) 0;
        this.cargo= "";
        this.nome="";
    }

    
    
}
