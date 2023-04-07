package com.generation.proyectojava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "usuaria")
public class Usuaria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer usuaria_id;
    private String nombre;
    private String apellido;
    private Integer telefono;
    private String correo;
    private String contrasenia;

}
