/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kd.electronics;

/**
 *
 * @author JHON ROSAS
 */
    
import java.util.ArrayList;
import java.util.List;

public class ControladorProducto {
    private static List<Producto> inventario = new ArrayList<>();

    // Método para agregar un nuevo producto al inventario
    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    // Método para buscar un producto por su código
    public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto producto : inventario) {
            if (producto.getCodigoProducto().equals(codigo)) {
                return producto;
            }
        }
        return null; // Devuelve null si el producto no se encuentra
    }

    // Método para actualizar un producto en el inventario
    public void actualizarProducto(Producto productoActualizado) {
        for (Producto producto : inventario) {
            if (producto.getCodigoProducto().equals(productoActualizado.getCodigoProducto())) {
                producto.setNombre(productoActualizado.getNombre());
                producto.setDescripcion(productoActualizado.getDescripcion());
                producto.setPrecioBase(productoActualizado.getPrecioBase());
                producto.setPrecioVenta(productoActualizado.getPrecioVenta());
                producto.setCategoria(productoActualizado.getCategoria());
                producto.setCantidadDisponible(productoActualizado.getCantidadDisponible());
                return; // Termina la búsqueda después de actualizar el producto
            }
        }
    }

    // Método para eliminar un producto del inventario
    public void eliminarProducto(String codigo) {
        Producto productoAEliminar = null;
        for (Producto producto : inventario) {
            if (producto.getCodigoProducto().equals(codigo)) {
                productoAEliminar = producto;
                break; // Termina la búsqueda una vez que se encuentra el producto
            }
        }
        if (productoAEliminar != null) {
            inventario.remove(productoAEliminar);
        }
    }

    // Método para obtener todos los productos del inventario
    public List<Producto> obtenerTodosLosProductos() {
        return inventario;
    }
}

