package com.Service;

import com.Domain.Envio;
import org.springframework.stereotype.Service;

/**
 * Servicio para la gestión de envíos.
 */
@Service
public class EnvioService {

    /**
     * Crea un nuevo envío a partir de uno existente.
     *
     * @param envio El envío existente.
     * @return Un nuevo objeto de envío.
     */
    public Envio crearEnvio(final Envio envio) {
        Envio envio1 = new Envio(envio);
        envio1.setCiudades(envio.getCiudadorigen(), envio.getCiudaddestino());
        return envio1;
    }
}
