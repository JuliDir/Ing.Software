package com.ModuloEnvio.Envio.Model;

import java.util.Date;

public class Envio {

    private Long codigoEnvio;
    private String courier;
    private String ciudadorigen;
    private String ciudaddestino;
    private Date fechaEnvio;
    private EstadoEnvio estadoEnvio;
    private Producto producto;
    private double costoEnvio;
    private String observacionesEnvi;

    public Envio(){};

    public Envio(Long codigoEnvio, String courier, String ciudadorigen, String ciudaddestino, Date fechaEnvio, double costoEnvio, String observacionesEnvio) {
        this.codigoEnvio = codigoEnvio;
        this.courier = courier;
        this.ciudadorigen = ciudadorigen;
        this.ciudaddestino = ciudaddestino;
        this.fechaEnvio = fechaEnvio;
        this.costoEnvio = costoEnvio;
        this.observacionesEnvio = observacionesEnvio;
    }

    public Long getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(Long codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public void setCiudadorigen(String ciudadorigen) {
        this.ciudadorigen = ciudadorigen;
    }

    public void setCiudaddestino(String ciudaddestino) {
        this.ciudaddestino = ciudaddestino;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public void setEstadoEnvio(EstadoEnvio estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public void setObservacionesEnvio(String observacionesEnvio) {
        this.observacionesEnvio = observacionesEnvio;
    }

    public String getCourier() {
        return courier;
    }

    public String getCiudadorigen() {
        return ciudadorigen;
    }

    public String getCiudaddestino() {
        return ciudaddestino;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public EstadoEnvio getEstadoEnvio() {
        return estadoEnvio;
    }

    public Producto getProducto() {
        return producto;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public String getObservacionesEnvio() {
        return observacionesEnvio;
    }

    public void aceptarSolicutud(){
        if(this.getEstadoEnvio().getNombreEnvio() != "Activo"){
            this.getEstadoEnvio().setNombreEnvio("Activo");
        }
    }
}
