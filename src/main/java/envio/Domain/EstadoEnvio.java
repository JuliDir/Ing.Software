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
 * Clase que representa un estado de envío.
 */
public class EstadoEnvio {
    /**
     * Nombre del estado de envío.
     */
    private String nombreEnvio;

    /**
     * Constructor para crear un estado de envío con un nombre.
     *
     * @param nombreEnvio El nombre del estado de envío.
     */
    public EstadoEnvio(final String nombreEnvio) {
        this.nombreEnvio = nombreEnvio;
    }

    /**
     * Obtiene el nombre del estado de envío.
     *
     * @return El nombre del estado de envío.
     */
    public String getNombreEnvio() {
        return nombreEnvio;
    }

    /**
     * Establece el nombre del estado de envío.
     *
     * @param nombreEnvio El nuevo nombre del estado de envío.
     */
    public void setNombreEnvio(final String nombreEnvio) {
        this.nombreEnvio = nombreEnvio;
    }
}
