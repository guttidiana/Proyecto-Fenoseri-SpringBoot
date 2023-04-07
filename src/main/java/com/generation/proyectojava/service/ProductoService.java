package com.generation.proyectojava.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.proyectojava.model.Producto;
import com.generation.proyectojava.repository.ProductoRepository;

@Service
@Transactional
public class ProductoService {

    private ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }
    
    public void saveProducto(Producto producto){
        this.productoRepository.save(producto);
    }

    public void updateProducto(Producto producto){
        this.productoRepository.save(producto);
    }

    public void deleteProducto(Integer id){
        productoRepository.deleteById(id);
    }

    public List<Producto> findAll(){
        return productoRepository.findAll();
    }



}
