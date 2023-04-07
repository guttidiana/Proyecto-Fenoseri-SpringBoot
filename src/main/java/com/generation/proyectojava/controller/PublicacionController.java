package com.generation.proyectojava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.proyectojava.model.Publicacion;
import com.generation.proyectojava.service.PublicacionService;

@Controller
@CrossOrigin("*")
@RestController
public class PublicacionController {

    private PublicacionService publicacionService;

    public PublicacionController(@Autowired PublicacionService publicacionService){
        this.publicacionService = publicacionService;
    }

    @PostMapping("/publicacion/Save")
    public void guardarPublicacion(@RequestBody Publicacion publicacion){
        publicacionService.savePublicacion(publicacion);
    }

    @PutMapping("/publicacion/Update")
    public void editarPublicacionn(@RequestBody Publicacion publicacion){
        publicacionService.updatePublicacion(publicacion);
    }

    @DeleteMapping("/publicacion/Delete/{id}")
    public void eliminarPublicacion(@PathVariable Integer id){
        publicacionService.deletePublicacion(id);
    }

    @GetMapping("/publicacion/findAll")
    public List<Publicacion> obtenerPublicaciones(){
        return publicacionService.findAll();
    }

    @GetMapping("/publicacion/usuariaDos")
    public List<Publicacion> usuariaDos(){
        return publicacionService.usuariaDos();
    }

    
}
