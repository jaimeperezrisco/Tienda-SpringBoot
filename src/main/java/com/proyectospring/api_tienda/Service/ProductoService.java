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

    // Para PUT
    public Producto actualizarProducto(Long idProducto, Producto productoActualizado) {
        Producto productoExistente = productoRepository.findById(idProducto)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con ID: " + idProducto));

        productoExistente.setNombre(productoActualizado.getNombre());
        productoExistente.setDescripcion(productoActualizado.getDescripcion());
        productoExistente.setPrecio(productoActualizado.getPrecio());
        productoExistente.setStock(productoActualizado.getStock());
        productoExistente.setCategoria(productoActualizado.getCategoria());

        return productoRepository.save(productoExistente);
    }

    public void eliminarProducto(Long idProducto) {
        Producto producto = productoRepository.findById(idProducto)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con ID: " + idProducto));
        productoRepository.delete(producto);
    }

}
