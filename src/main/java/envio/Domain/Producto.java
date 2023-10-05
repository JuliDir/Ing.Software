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
 * Clase que representa un producto.
 */
public class Producto {
    /**
     * Nombre del producto.
     */
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
