package com.CRUDSPRING.crud.repository;

import com.CRUDSPRING.crud.modells.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
