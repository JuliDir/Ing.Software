package com.Service;

import com.Domain.Envio;
import org.springframework.stereotype.Service;


//solo quiero que se ejecute cuando se llame a la claseddd
@Service
public class EnvioService {
    public Envio crearEnvio(Envio envio) {
        Envio envio1= new Envio(envio);
        envio1.setCiudades(envio.getCiudadorigen(),envio.getCiudaddestino());
        return envio1;
    }
}
