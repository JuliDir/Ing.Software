package com.Controller;

import com.Domain.Envio;
import com.Service.EnvioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador para la gestión de envíos.
 */
@RestController
public class EnvioController {

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
