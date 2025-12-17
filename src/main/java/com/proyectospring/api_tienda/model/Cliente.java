package com.proyectospring.api_tienda.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Cliente")
@Data

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_cliente;
    String nombre;
    String apellidos;
    String direccion;
    String email;
    String telefono;   
}
