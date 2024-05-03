/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kd.electronics;

/**
 *
 * @author JHON ROSAS
 */
import com.kd.electronics.Producto;
import com.kd.electronics.ControladorProducto;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia del controlador de productos
        ControladorProducto controlador = new ControladorProducto();

        // Crear productos de ejemplo
        Producto producto1 = new Producto("001", "Laptop", "Laptop HP", 500.0, 700.0, "Electrónicos", 10);
        Producto producto2 = new Producto("002", "Teléfono", "Teléfono Samsung", 300.0, 400.0, "Electrónicos", 20);
        Producto producto3 = new Producto("003", "Tablet", "Tablet Lenovo", 200.0, 250.0, "Electrónicos", 15);
        Producto producto4 = new Producto("004", "Smartwatch", "Smartwatch Apple", 150.0, 200.0, "Electrónicos", 30);

        // Agregar productos al inventario
        controlador.agregarProducto(producto1);
        controlador.agregarProducto(producto2);
        controlador.agregarProducto(producto3);
        controlador.agregarProducto(producto4);

        // Buscar un producto por su código
        Producto productoEncontrado = controlador.buscarProductoPorCodigo("002");
        if (productoEncontrado != null) {
            System.out.println("Producto encontrado: " + productoEncontrado.getNombre());
        } else {
            System.out.println("Producto no encontrado.");
        }

        // Actualizar un producto existente
        Producto productoActualizar = new Producto("003", "Tablet", "Tablet Lenovo (Nuevo Modelo)", 250.0, 300.0, "Electrónicos", 20);
        controlador.actualizarProducto(productoActualizar);

        // Eliminar un producto del inventario
        controlador.eliminarProducto("004");

        // Imprimir todos los productos en el inventario
        System.out.println("Productos en el inventario:");
        for (Producto producto : controlador.obtenerTodosLosProductos()) {
            System.out.println(producto.getNombre() + " - Cantidad: " + producto.getCantidadDisponible());
        }
    }
}
