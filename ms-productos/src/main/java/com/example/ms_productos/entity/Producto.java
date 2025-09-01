package com.example.ms_productos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @Column(nullable = false, name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(nullable = false, name = "precio")
    private Double precio;

    @Column(nullable = false, name = "stock")
    private Integer stock;

    @Column(nullable = false, name = "id_categoria")
    private Long idCategoria;  // Si tienes entidad Categoria, puedes hacer @ManyToOne aquí
}