package com.Domain;

/**
 * Clase que representa un detalle de un carrito de compras.
 */
public class CarritoDetalle {
    private int cantidad;

    /**
     * Constructor de la clase CarritoDetalle.
     *
     * @param cantidad La cantidad del detalle.
     */
    public CarritoDetalle(int cantidad) {
        this.cantidad = cantidad;
    }

    public CarritoDetalle(CarritoDetalle carritoDetalle){
        this.cantidad = carritoDetalle.getCantidad();
    }

    public CarritoDetalle() {
    }

    /**
     * Incrementa la cantidad del detalle.
     *
     * @param cantidad La cantidad a incrementar.
     */
    public void incrementarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    /**
     * Decrementa la cantidad del detalle.
     *
     * @param cantidad La cantidad a decrementar.
     */
    public void decrementarCantidad(int cantidad) {
        int resultado = this.cantidad - cantidad;

        this.cantidad = resultado < 1 ? 1 : resultado;
    }

    /**
     * Obtiene la cantidad del detalle.
     *
     * @return La cantidad del detalle.
     */
    public int getCantidad() {
        return cantidad;
    }
}
