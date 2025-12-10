package com.proyectospring.api_tienda.Modelo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Employee")
@Data
public class Empleado {
    int id_empleado;
    String nombre;
    String puesto;
    int salario;
    String fecha_contratacion;
}
