package com.proyectospring.api_tienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectospring.api_tienda.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository <Producto, Long> {
    public long countById (Long producto_id);
    public List<Producto> findByPrecioBetween(double min, double max);
}
