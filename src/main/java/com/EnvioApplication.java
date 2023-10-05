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
