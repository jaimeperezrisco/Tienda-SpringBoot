package com.proyectospring.api_tienda.Modelo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Pedido")
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_pedido;
    String fecha;
    int total;
    String metodo_pago;
    String estado;
}
