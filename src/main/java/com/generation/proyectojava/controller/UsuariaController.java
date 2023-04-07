package com.generation.proyectojava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.generation.proyectojava.model.Usuaria;
import com.generation.proyectojava.service.UsuariaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@CrossOrigin("*")
@RestController
public class UsuariaController {

    private UsuariaService usuariaService;

    public UsuariaController(@Autowired UsuariaService usuariaService){
        this.usuariaService = usuariaService;
    }

    @PostMapping(value="/usuaria/Save")
    public void guardarUsuaria(@RequestBody Usuaria usuaria) {
        usuariaService.saveUsuaria(usuaria);
    }
    
    @PutMapping("/usuaria/Update")
    public void editarUsuaria(@RequestBody Usuaria usuaria){
        usuariaService.updateUsuaria(usuaria);
    }
    
    @DeleteMapping("/usuaria/Delete/{id}")
    public void eleiminarUsuaria(@PathVariable Integer id){
        usuariaService.deleteUsuaria((id));
    }

    @GetMapping("/usuaria/findAll")
    public List<Usuaria> obtenerUsuarias(){
        return usuariaService.findAll();
    }

    @GetMapping("/usuaria/conS")
    public List<Usuaria> usuariasConS(){
        return usuariaService.usuariasconS();
    }


}
