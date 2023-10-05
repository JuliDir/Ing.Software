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
package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación de envío.
 */
@SpringBootApplication
public class EnvioApplication {
	/**
	 * Método principal que inicia la aplicación de envío.
	 *
	 * @param args Argumentos de línea de comandos.
	 */
	public static void main(final String[] args) {
		SpringApplication.run(EnvioApplication.class, args);
	}
}
