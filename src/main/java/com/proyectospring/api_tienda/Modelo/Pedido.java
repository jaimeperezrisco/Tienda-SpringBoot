package com.proyectospring.api_tienda.Modelo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Order")
@Data
public class Pedido {
    int id_pedido;
    String fecha;
    int total;
    String metodo_pago;
    String estado;
}
