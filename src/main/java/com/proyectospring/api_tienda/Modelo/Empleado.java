package com.proyectospring.api_tienda.Modelo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Empleado")
@Data
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_empleado;
    String nombre;
    String puesto;
    int salario;
    String fecha_contratacion;
}
