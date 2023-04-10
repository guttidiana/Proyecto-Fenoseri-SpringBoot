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

import com.generation.proyectojava.model.Profesional;
import com.generation.proyectojava.service.ProfesionalService;

@Controller
@CrossOrigin("*")
@RestController
public class ProfesionalController {

    private ProfesionalService profesionalService;

    public ProfesionalController(@Autowired ProfesionalService profesionalService){
        this.profesionalService = profesionalService;
    }

    @PostMapping("/profesional/Save")
    public void guardarProfesional(@RequestBody Profesional profesional){
        profesionalService.saveProfesional(profesional);
    }

    @PutMapping("/profesional/Update")
    public void editarProfesional(@RequestBody Profesional profesional){
        profesionalService.updateProfesional(profesional);
    }

    @DeleteMapping("/profesional/Delete/{id}")
    public void eliminarProfesional(@PathVariable Integer id){
        profesionalService.deleteProfesional(id);
    }

    @GetMapping("/profesional/findAll")
    public List<Profesional> obtenerProfesionales(){
        return profesionalService.findAll();
    }
    
}
