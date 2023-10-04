package com.Controller;

import com.Domain.Envio;
import com.Service.EnvioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EnvioController {

    private final EnvioService envioService;

    public EnvioController(EnvioService envioService) {
        this.envioService = envioService;
    }

    @PostMapping("api/envio/create")
    public Envio createEnvio(@RequestBody Envio envio){
        return envioService.crearEnvio(envio);
    }
}
