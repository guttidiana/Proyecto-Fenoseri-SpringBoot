package com.generation.proyectojava.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.proyectojava.model.Categoria;
import com.generation.proyectojava.repository.CategoriaRepository;

@Service
@Transactional
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }
    
    public void saveCategoria(Categoria categoria){
        this.categoriaRepository.save(categoria);
    }

    public void updateCategoria(Categoria categoria){
        this.categoriaRepository.save(categoria);
    }

    public void deleteCategoria(Integer id){
        categoriaRepository.deleteById(id);
    }

    public List <Categoria> findAll(){
        return categoriaRepository.findAll();
    }

}
