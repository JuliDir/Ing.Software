/**
 * Clase que representa un carrito de compras.
 * <p>
 * Esta clase es la encargada de representar un carrito de compras, el cual
 * contiene una lista de detalles de carrito.
 * </p>
 * <p>
 * Esta clase es utilizada por la clase Usuario, la cual contiene un carrito de
 * compras.
 * </p>
 *
 * @since 1.0
 * @version 1.0 - 20/10/2020
 */
package com.Domain;

import java.util.List;

/**
 * Clase que representa un carrito de compras.
 */
public class Carrito {
    /**
     * Lista de detalles del carrito.
     */
    private final List<CarritoDetalle> carritoDetalles;

    /**
     * Constructor de la clase Carrito.
     *
     * @param carritoDetalles La lista de detalles del carrito.
     */
    public Carrito(final List<CarritoDetalle> carritoDetalles) {
        this.carritoDetalles = carritoDetalles;
    }

    /**
     * Añade un detalle al carrito.
     *
     * @param carritoDetalle El detalle a añadir.
     */
    public void agregarCarridoDetalle(final CarritoDetalle carritoDetalle) {
        carritoDetalles.add(carritoDetalle);
    }

    /**
     * Elimina un detalle del carrito.
     *
     * @param carritoDetalle El detalle a eliminar.
     */
    public void eliminarCarritoDetalle(final CarritoDetalle carritoDetalle) {
        carritoDetalles.remove(carritoDetalle);
    }

    /**
     * Obtiene la lista de detalles del carrito.
     *
     * @return La lista de detalles del carrito.
     */
    public List<CarritoDetalle> getCarritoDetalles() {
        return carritoDetalles;
    }
}
