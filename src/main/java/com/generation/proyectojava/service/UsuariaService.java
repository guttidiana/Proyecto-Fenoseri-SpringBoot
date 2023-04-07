package com.generation.proyectojava.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.proyectojava.model.Usuaria;
import com.generation.proyectojava.repository.UsuariaRepository;

@Service
@Transactional
public class UsuariaService {

    private UsuariaRepository usuariaRepository;

    public UsuariaService(UsuariaRepository usuariaRepository){
        this.usuariaRepository = usuariaRepository;
    }
    

    public void saveUsuaria(Usuaria usuaria){
        this.usuariaRepository.save(usuaria);
    }

    public void updateUsuaria(Usuaria usuaria){
        this.usuariaRepository.save(usuaria);
    }

    public void deleteUsuaria(Integer id){
        usuariaRepository.deleteById(id);
    }

    public List<Usuaria> findAll(){
        return usuariaRepository.findAll();
    }

    public List<Usuaria> usuariasconS(){
        return usuariaRepository.findUsuariasWithS();
    }

}
