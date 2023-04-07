package com.generation.proyectojava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.proyectojava.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    
    
}
