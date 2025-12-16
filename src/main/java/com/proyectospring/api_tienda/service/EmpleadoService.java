package com.proyectospring.api_tienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectospring.api_tienda.model.Empleado;
import com.proyectospring.api_tienda.repository.EmpleadoRepository;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    public Empleado getEmpleadoById(Long idEmpleado ) {
            Optional<Empleado> empleado = empleadoRepository.findById(idEmpleado);
            return empleado.orElseThrow(() -> new RuntimeException("Empleado no encontrado con ID: " + idEmpleado));
        }

        public Empleado crearEmpleado(Empleado empleado) {
            return empleadoRepository.save(empleado);
        }

}
