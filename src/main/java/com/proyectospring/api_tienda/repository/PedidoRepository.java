package com.proyectospring.api_tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectospring.api_tienda.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Long> {

}
