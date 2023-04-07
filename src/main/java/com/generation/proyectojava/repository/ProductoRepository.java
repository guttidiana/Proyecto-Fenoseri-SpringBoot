package com.generation.proyectojava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.proyectojava.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
    
}
