package com.generation.proyectojava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.proyectojava.model.Usuaria;

public interface UsuariaRepository extends JpaRepository<Usuaria, Integer>{

    @Query(value = "SELECT * FROM usuaria WHERE nombre like ('s%')", nativeQuery = true)
    List <Usuaria> findUsuariasWithS();
    
}
