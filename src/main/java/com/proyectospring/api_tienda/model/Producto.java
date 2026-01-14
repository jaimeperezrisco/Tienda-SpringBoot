package com.proyectospring.api_tienda.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Producto")
@Data

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;
    String descripcion;
    double precio;
    int stock;
    String categoria;
    
}
