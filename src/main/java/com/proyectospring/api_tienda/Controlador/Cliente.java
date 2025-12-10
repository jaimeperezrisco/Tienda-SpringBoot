package com.proyectospring.api_tienda.Controlador;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Client")
@Data
public class Cliente {
    int id_cliente;
    String nombre;
    String apellidos;
    String direccion;
    String email;
    String telefono;
}
