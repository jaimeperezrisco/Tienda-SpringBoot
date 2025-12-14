package com.proyectospring.api_tienda.Controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectospring.api_tienda.Modelo.Empleado;
import com.proyectospring.api_tienda.Service.EmpleadoService;

@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {
    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping
    public List<Empleado> obtenerClientes() {
        return empleadoService.getAllEmpleados();
    }

}
