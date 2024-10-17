package com.pablomonteserin.prueba.repositories;

import com.pablomonteserin.prueba.Entities.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {
List<Persona> findAll();
}