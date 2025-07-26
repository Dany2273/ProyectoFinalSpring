package com.TechLab.Spring.service;

import com.TechLab.Spring.model.Producto;

import java.util.List;

public interface IProductoService {
    String crearProducto(Producto producto);
    List<Producto> listarProductos();
    Producto buscarPorId(Long id);
    String editarProducto(Long id, Producto producto);
    String eliminarProducto(Long id);
}
