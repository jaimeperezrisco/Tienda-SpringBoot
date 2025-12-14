package com.proyectospring.api_tienda.Modelo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Producto")
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_producto;
    String nombre;
    String descripcion;
    double precio;
    int stock;
    String categoria;
}
