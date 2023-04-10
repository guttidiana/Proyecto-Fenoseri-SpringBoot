package com.generation.proyectojava.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.proyectojava.model.Profesional;
import com.generation.proyectojava.repository.ProfesionalRepository;

@Service
@Transactional
public class ProfesionalService {
    
    private ProfesionalRepository profesionalRepository;
    public ProfesionalService(ProfesionalRepository profesionalRepository){
        this.profesionalRepository = profesionalRepository;
    }

    public void saveProfesional(Profesional profesional){
        this.profesionalRepository.save(profesional);
    }

    public void updateProfesional(Profesional profesional){
        this.profesionalRepository.save(profesional);
    }

    public void deleteProfesional(Integer id){
        profesionalRepository.deleteById(id);
    }

    public List<Profesional> findAll(){
        return profesionalRepository.findAll();
    }

}
