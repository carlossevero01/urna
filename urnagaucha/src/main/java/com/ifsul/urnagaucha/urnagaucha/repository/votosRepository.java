package com.ifsul.urnagaucha.urnagaucha.repository;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ifsul.urnagaucha.urnagaucha.model.contagemVotos;
import com.ifsul.urnagaucha.urnagaucha.model.votos;


public interface votosRepository extends JpaRepository<votos,Integer>{
    
    @Query("SELECT new com.ifsul.urnagaucha.urnagaucha.model.contagemVotos(c.candidatoId, COUNT(c.candidatoId), c.cargo, c.nome)"+
    "FROM votos as v JOIN v.candidato c GROUP BY c.candidatoId ORDER BY COUNT(c.candidatoId) DESC")
    List<contagemVotos> countTotalVotosByCandidatoIdClass();
    void deleteByturno(Integer turno);                     
}
    