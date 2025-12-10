package com.proyectospring.api_tienda.Modelo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Product")
@Data
public class Producto {
    int id_producto;
    String nombre;
    String descripcion;
    double precio;
    int stock;
    String categoria;
}
