package com.generation.proyectojava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.proyectojava.model.Publicacion;

public interface PublicacionRepository extends JpaRepository<Publicacion, Integer>{
    
    @Query(value = "SELECT * FROM publicacion WHERE usuaria_id = 2", nativeQuery = true)
    List <Publicacion> findUsuariaDos();

}
