package com.proyectospring.api_tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectospring.api_tienda.model.Producto;
import com.proyectospring.api_tienda.repository.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

}
