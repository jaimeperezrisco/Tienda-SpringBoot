package com.proyectospring.api_tienda.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyectospring.api_tienda.Modelo.Empleado;
import com.proyectospring.api_tienda.Repository.EmpleadoRepository;

@Service
public class EmpleadoService {
    public final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

}
