package com.proyectospring.api_tienda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectospring.api_tienda.Modelo.Producto;

@Repository
public interface ProductoRepository extends JpaRepository <Producto, Integer> {

}
