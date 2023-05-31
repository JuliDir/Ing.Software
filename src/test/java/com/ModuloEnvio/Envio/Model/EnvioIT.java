package com.ModuloEnvio.Envio.Model;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


class EnvioIT {

    @Test
    public void verificarAceptarSolicitud(){
        EstadoEnvio estadoEnvio= new EstadoEnvio("Solicitud");
        Envio envio = new Envio();
        envio.setEstadoEnvio(estadoEnvio);
        envio.aceptarSolicutud();
        assert envio.getEstadoEnvio().getNombreEnvio()=="Activo";
    }

    @Test
    public void verificarGetProducto(){
        Producto producto = new Producto("Celular");
        Envio envio = new Envio();
        envio.setProducto(producto);
        assert (envio.getProducto()== producto);
    }
}
