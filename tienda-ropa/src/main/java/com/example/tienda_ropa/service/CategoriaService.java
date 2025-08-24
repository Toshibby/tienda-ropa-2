package com.example.tienda_ropa.service;

import com.example.tienda_ropa.entity.Categoria;

import java.util.List;

public interface CategoriaService {
    List<Categoria> listarCategorias();
    Categoria obtenerCategoria(Long id);
    Categoria guardarCategoria(Categoria categoria);
    Categoria actualizarCategoria(Long id, Categoria categoria);
    void eliminarCategoria(Long id);
}
