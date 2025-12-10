package com.proyectospring.api_tienda.Controlador;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Product")
@Data
public class Producto {
    int id_producto;
    String nombre;
    String descripcion;
    int precio;
    int stock;
    String categoria;
}
