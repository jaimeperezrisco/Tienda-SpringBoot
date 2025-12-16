package com.proyectospring.api_tienda.service;

import java.util.List;
import java.util.Optional;

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

    public Producto getProductoyById(Long idProducto) {
        Optional<Producto> producto = productoRepository.findById(idProducto);
        return producto.orElseThrow(() -> new RuntimeException("Producto no encontrado con ID: " + idProducto));
    }

    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

}
