package com.example.ms_productos.service;

import com.example.ms_productos.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> listarProductos();

    // Obtener un producto por ID
    Optional<Producto> obtenerProductoPorId(Long id);

    // Guardar un nuevo producto
    Producto guardarProducto(Producto producto);

    // Actualizar un producto existente
    Producto actualizarProducto(Long id, Producto producto);

    // Eliminar un producto por ID
    void eliminarProducto(Long id);
}
