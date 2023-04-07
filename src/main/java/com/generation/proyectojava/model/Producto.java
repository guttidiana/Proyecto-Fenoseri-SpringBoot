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
@Entity(name = "producto")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer producto_id;
    private Integer sku;
    private String nombreProducto;
    private String talla;
    private Integer stock;
    private String tipoCuerpo;
    private Integer precio;
    private Integer cantMinima;
    private Integer categoria_id;

}
