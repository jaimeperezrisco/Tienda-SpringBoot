package com.proyectospring.api_tienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectospring.api_tienda.model.Pedido;
import com.proyectospring.api_tienda.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido getPedidoById(Long idPedido ) {
            Optional<Pedido> pedido = pedidoRepository.findById(idPedido);
            return pedido.orElseThrow(() -> new RuntimeException("Pedido no encontrado con ID: " + idPedido));
        }

        public Pedido crearPedido(Pedido pedido) {
            return pedidoRepository.save(pedido);
        }
}
