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
package com.Controller;

import com.Domain.Envio;
import com.Service.EnvioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Controlador para la gestión de envíos.
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EnvioController {

    /**
     * Servicio de envío.
     */
    private final EnvioService envioService;

    /**
     * Constructor del controlador.
     * @javadoc
     * @param envioService Servicio de envío
     */
    public EnvioController(final EnvioService envioService) {
        this.envioService = envioService;
    }

    /**
     * Crea un nuevo envío.
     *
     * @param envio Objeto de envío
     * @return Objeto de envío creado
     */
    @PostMapping("/api/envio/create")
    public Envio createEnvio(@RequestBody final Envio envio) {
        return envioService.crearEnvio(envio);
    }
}
