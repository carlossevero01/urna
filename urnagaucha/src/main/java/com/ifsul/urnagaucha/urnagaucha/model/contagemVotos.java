package com.ifsul.urnagaucha.urnagaucha.model;



public class contagemVotos {
    private Integer candidatoId;
    private Long votos;
    private String cargo;
   
    

    public contagemVotos(Integer candidatoId, Long votos, String cargo) {
        this.candidatoId = candidatoId;
        this.votos = votos;
        this.cargo= cargo;
        
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
      //  "\n Nome candidato="+cRepository.findById(candidatoId).orElseThrow(null).getNome()+  
        "\n votos=" + votos + 
        "\n cargo=" + cargo ;
    }

    // public String getNomeCandidato() {
    //     return nomeCandidato;
    // }

    // public void setNomeCandidato(String nomeCandidato) {
    //     this.nomeCandidato = nomeCandidato;
    // }
    
}
