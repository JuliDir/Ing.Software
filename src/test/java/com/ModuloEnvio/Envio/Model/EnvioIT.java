package com.ModuloEnvio.Envio.Model;
import com.Domain.Envio;
import com.Domain.EstadoEnvio;
import com.Domain.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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

    //Compruebo la existencia de la calse producto
    @Test
    public void verificarExistenciaClaseProducto(){
        Producto producto = new Producto("Celular");
        assertNotNull(producto);
    }

    //Compruebo que el tipo de ciudad destino sea un string
    @Test
    public void verificarTipoCiudadDestino(){
        Envio envio = new Envio();
        envio.setCiudaddestino("Bogota");
        assert (envio.getCiudaddestino() instanceof String);
    }

}
