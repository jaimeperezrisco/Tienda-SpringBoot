    package com.proyectospring.api_tienda.service;

    import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import com.proyectospring.api_tienda.model.Cliente;
    import com.proyectospring.api_tienda.repository.ClienteRepository;

    @Service
    public class ClienteService {

        @Autowired
        ClienteRepository clienteRepository;

        public List<Cliente> getAllClientes() {
            return clienteRepository.findAll();
        }

        public Cliente getClienteById(Long idCliente ) {
            Optional<Cliente> cliente = clienteRepository.findById(idCliente);
            return cliente.orElseThrow(() -> new RuntimeException("Cliente no encontrado con ID: " + idCliente));
        }

        public Cliente crearCliente(Cliente cliente) {
            return clienteRepository.save(cliente);
        }

        //Para PUT  
        public Cliente actualizarCliente(Long idCliente, Cliente clienteActualizado) {
            Cliente clienteExistente = clienteRepository.findById(idCliente)
                    .orElseThrow(() -> new RuntimeException("Cliente no encontrado con ID: " + idCliente));

            // Actualizamos los campos
            clienteExistente.setNombre(clienteActualizado.getNombre());
            clienteExistente.setApellidos(clienteActualizado.getApellidos());
            clienteExistente.setDireccion(clienteActualizado.getDireccion());
            clienteExistente.setEmail(clienteActualizado.getEmail());
            clienteExistente.setTelefono(clienteActualizado.getTelefono());

            return clienteRepository.save(clienteExistente);
        }

        //DELETE
        public void eliminarCliente(Long idCliente) {
            Cliente cliente = clienteRepository.findById(idCliente)
                    .orElseThrow(() -> new RuntimeException("Cliente no encontrado con ID: " + idCliente));

            clienteRepository.delete(cliente);
        }
    }
