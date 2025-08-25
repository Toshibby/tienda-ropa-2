package com.example.ms_cliente.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name="clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(nullable = false, name="nombre_cliente")
    private String nombre;

    @Column(nullable = false, name="apellido_cliente")
    private String apellido;

    @Column(nullable = false, unique = true, name="email_cliente")
    private String email;

    @Column(nullable = false, unique = true, name="telefono_cliente")
    private String telefono;

}
