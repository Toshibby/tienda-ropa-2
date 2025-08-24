package com.example.tienda_ropa.service.impl;

import com.example.tienda_ropa.entity.Categoria;
import com.example.tienda_ropa.repository.CategoriaRepository;
import com.example.tienda_ropa.service.CategoriaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria obtenerCategoria(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria actualizarCategoria(Long id, Categoria categoria) {
        Categoria existente = categoriaRepository.findById(id).orElse(null);
        if (existente != null) {
            existente.setNombreCategoria(categoria.getNombreCategoria());
            existente.setDescripcion(categoria.getDescripcion());
            return categoriaRepository.save(existente);
        }
        return null;
    }

    @Override
    public void eliminarCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
}
