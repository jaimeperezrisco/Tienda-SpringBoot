package com.proyectospring.api_tienda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectospring.api_tienda.Modelo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer> {

}
