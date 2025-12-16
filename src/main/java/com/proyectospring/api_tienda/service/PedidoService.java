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

    public Pedido getPedidoById(Long idPedido) {
        Optional<Pedido> pedido = pedidoRepository.findById(idPedido);
        return pedido.orElseThrow(() -> new RuntimeException("Pedido no encontrado con ID: " + idPedido));
    }

    public Pedido crearPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // Para PUT
    public Pedido actualizarPedido(Long idPedido, Pedido pedidoActualizado) {
        Pedido pedidoExistente = pedidoRepository.findById(idPedido)
                .orElseThrow(() -> new RuntimeException("Pedido no encontrado con ID: " + idPedido));

        pedidoExistente.setFecha(pedidoActualizado.getFecha());
        pedidoExistente.setTotal(pedidoActualizado.getTotal());
        pedidoExistente.setMetodo_pago(pedidoActualizado.getMetodo_pago());
        pedidoExistente.setEstado(pedidoActualizado.getEstado());

        return pedidoRepository.save(pedidoExistente);
    }

    public void eliminarPedido(Long idPedido) {
        Pedido pedido = pedidoRepository.findById(idPedido)
                .orElseThrow(() -> new RuntimeException("Pedido no encontrado con ID: " + idPedido));
        pedidoRepository.delete(pedido);
    }
}
