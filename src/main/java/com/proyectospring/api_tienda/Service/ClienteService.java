package com.proyectospring.api_tienda.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyectospring.api_tienda.Modelo.Cliente;
import com.proyectospring.api_tienda.Repository.ClienteRepository;

@Service
public class ClienteService {
    public final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }
}
