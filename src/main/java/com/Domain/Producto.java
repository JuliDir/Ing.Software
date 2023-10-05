package com.Domain;

/**
 * Clase que representa un producto.
 */
public class Producto {

    private String nombreProducto;

    /**
     * Constructor para crear un producto con un nombre.
     *
     * @param nombreProducto El nombre del producto.
     */
    public Producto(final String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombreProducto El nuevo nombre del producto.
     */
    public void setNombreProducto(final String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
}
