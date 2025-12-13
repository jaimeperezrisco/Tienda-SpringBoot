package com.proyectospring.api_tienda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectospring.api_tienda.Modelo.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository <Empleado, Integer> {

}
