package com.proyectospring.api_tienda.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyectospring.api_tienda.Modelo.Producto;
import com.proyectospring.api_tienda.Repository.ProductoRepository;

@Service
public class ProductoService {
    public final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

}
