package com.IneappPersonaservice.IneappPersonaservice.Persona.infraestructura.repository;

import com.IneappPersonaservice.IneappPersonaservice.Persona.domain.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
