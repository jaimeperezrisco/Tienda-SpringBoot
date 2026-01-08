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

    // Modificacion 1 (Busqueda Compuesta):
    public List<Cliente> getClienteByNombreYTelefono(String nombre, String telefono) {
        return clienteRepository.findByNombreAndTelefono(nombre, telefono);

    }

    public Cliente getClienteById(Long idCliente) {
        Optional<Cliente> cliente = clienteRepository.findById(idCliente);
        return cliente.orElseThrow(() -> new RuntimeException("Cliente no encontrado con ID: " + idCliente));
    }

    // POST
    // Modificacion 2 (Anti-Duplicados):
    public Cliente crearCliente(Cliente cliente) {
        if (clienteRepository.existsByEmail(cliente.getEmail())) {
            throw new RuntimeException("Ya existe cliente Con este email: " + cliente.getEmail());
        }
        return clienteRepository.save(cliente);
    }

    // Para PUT
    public Cliente actualizarCliente(Long idCliente, Cliente clienteActualizado) {
        Cliente clienteExistente = clienteRepository.findById(idCliente)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado con ID: " + idCliente));
                
        //Si el email esta cambiado y existe ya en otro cliente error
        if (!clienteExistente.getEmail().equals(clienteActualizado.getEmail()) &&
                clienteRepository.existsByEmail(clienteActualizado.getEmail())) {
            throw new RuntimeException(
                    "Ya existe cliente con este email: " + clienteActualizado.getEmail());
        }

        // Actualizamos los campos
        clienteExistente.setNombre(clienteActualizado.getNombre());
        clienteExistente.setApellidos(clienteActualizado.getApellidos());
        clienteExistente.setDireccion(clienteActualizado.getDireccion());
        clienteExistente.setEmail(clienteActualizado.getEmail());
        clienteExistente.setTelefono(clienteActualizado.getTelefono());

        return clienteRepository.save(clienteExistente);
    }

    // DELETE
    public void eliminarCliente(Long idCliente) {
        Cliente cliente = clienteRepository.findById(idCliente)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado con ID: " + idCliente));

        clienteRepository.delete(cliente);
    }
}
