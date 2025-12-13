package com.proyectospring.api_tienda.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyectospring.api_tienda.Modelo.Pedido;
import com.proyectospring.api_tienda.Repository.PedidoRepository;

@Service
public class PedidoService {
    public final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

   public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }

}
