package com.proyectospring.api_tienda.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Pedido")
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String fecha;
    int total;
    String metodo_pago;
    String estado;
    @ManyToOne
    @JoinColumn(name = "producto_id")
    Producto producto;
}
