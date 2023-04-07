package com.generation.proyectojava.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.proyectojava.model.Publicacion;
import com.generation.proyectojava.repository.PublicacionRepository;

@Service
@Transactional
public class PublicacionService {

    private PublicacionRepository publicacionRepository;

    public PublicacionService(PublicacionRepository publicacionRepository){
        this.publicacionRepository = publicacionRepository;
    }
    
    public void savePublicacion(Publicacion publicacion){
        this.publicacionRepository.save(publicacion);
    }

    public void updatePublicacion(Publicacion publicacion){
        this.publicacionRepository.save(publicacion);
    }

    public void deletePublicacion(Integer id){
        this.publicacionRepository.deleteById(id);
    }

    public List<Publicacion> findAll(){
        return publicacionRepository.findAll();
    }

    public List<Publicacion> usuariaDos(){
        return publicacionRepository.findUsuariaDos();
    }

    public List<Publicacion> findUsuariaDos() {
        return null;
    }



}
