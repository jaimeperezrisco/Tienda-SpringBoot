package com.proyectospring.api_tienda.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectospring.api_tienda.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {
    //Modificacion 1 (Busqueda Compuesta):
    public List<Cliente>  findByNombreAndTelefono(String nombre, String telefono);
    //Modificacion 2 Anti-Duplicados:
    public boolean existsByEmail(String email);
}
