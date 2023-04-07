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

import com.generation.proyectojava.model.Categoria;
import com.generation.proyectojava.service.CategoriaService;

@Controller
@CrossOrigin("*")
@RestController
public class CategoriaController {

    private CategoriaService categoriaService;

    public CategoriaController(@Autowired CategoriaService categoriaService){
        this.categoriaService = categoriaService;
    }

    @PostMapping("/categoria/Save")
    public void guardarCategoria(@RequestBody Categoria categoria){
        categoriaService.saveCategoria(categoria);
    }

    @PutMapping("/categoria/Update")
    public void editarCategoria(@RequestBody Categoria categoria){
        categoriaService.updateCategoria(categoria);
    }

    @DeleteMapping("/categoria/Delete/{id}")
    public void deleteCategoria(@PathVariable Integer id){
        categoriaService.deleteCategoria(id);
    }    

    @GetMapping("/categoria/findAll")
    public List<Categoria> obtenerCategorias(){
        return categoriaService.findAll();
    }
}
