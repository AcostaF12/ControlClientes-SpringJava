package ar.com.gm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.gm.domain.Persona;

public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}
