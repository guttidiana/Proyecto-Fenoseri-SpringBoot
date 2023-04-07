package com.generation.proyectojava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.generation.proyectojava.model.Producto;
import com.generation.proyectojava.service.ProductoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@CrossOrigin("*")
@RestController
public class ProductoController {

    private ProductoService productoService;

    public ProductoController(@Autowired ProductoService productoService){
        this.productoService = productoService;
    }
    
    @PostMapping(value="/producto/Save")
    public void guardarProducto(@RequestBody Producto producto){
        productoService.saveProducto(producto);
    }

    @PutMapping("/producto/Update")
    public void editarProducto(@RequestBody Producto producto){
        productoService.updateProducto(producto);
    }

    @DeleteMapping("/producto/Delete/{id}")
    public void eliminarProducto(@PathVariable Integer id){
        productoService.deleteProducto(id);
    }

    @GetMapping("/producto/findAll")
    public List<Producto> obtenerProductos(){
        return productoService.findAll();
    }

}
