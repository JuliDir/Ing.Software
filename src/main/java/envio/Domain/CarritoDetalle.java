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
package envio.Domain;

/**
 * Clase que representa un detalle de un carrito de compras.
 */
public class CarritoDetalle {
    /**
     * La cantidad del detalle.
     */
    private int cantidad;

    /**
     * Constructor de la clase CarritoDetalle.
     *
     * @param cantidad La cantidad del detalle.
     */
    public CarritoDetalle(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Constructor de la clase CarritoDetalle.
     *
     * @param carritoDetalle El detalle del carrito.
     */
    public CarritoDetalle(CarritoDetalle carritoDetalle) {
        this.cantidad = carritoDetalle.getCantidad();
    }

    /**
     * Constructor por defecto.
     */
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
