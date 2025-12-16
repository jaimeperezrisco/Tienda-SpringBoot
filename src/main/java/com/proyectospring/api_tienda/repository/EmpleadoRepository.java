package com.proyectospring.api_tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectospring.api_tienda.model.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository <Empleado, Long> {

}
