package com.Domain;

import java.util.Date;

/**
 * Clase que representa un envío.
 */
public class Envio {

    private Long codigoEnvio;
    private String courier;
    private String ciudadOrigen;
    private String ciudadDestino;
    private Date fechaEnvio;
    private EstadoEnvio estadoEnvio;
    private Producto producto;
    private double costoEnvio;
    private String observacionesEnvio;

    public Envio() {}

    public Envio(Envio envio){
        this.codigoEnvio = envio.codigoEnvio;
        this.courier = envio.courier;
        this.ciudadOrigen = envio.ciudadOrigen;
        this.ciudadDestino = envio.ciudadDestino;
        this.fechaEnvio = envio.fechaEnvio;
        this.estadoEnvio = envio.estadoEnvio;
        this.producto = envio.producto;
        this.costoEnvio = envio.costoEnvio;
        this.observacionesEnvio = envio.observacionesEnvio;
    }

    /**
     * Constructor para inicializar un envío.
     *
     * @param codigoEnvio        Código del envío.
     * @param courier            Nombre del courier.
     * @param ciudadOrigen       Ciudad de origen.
     * @param ciudadDestino      Ciudad de destino.
     * @param fechaEnvio         Fecha de envío.
     * @param costoEnvio         Costo del envío.
     * @param observacionesEnvio Observaciones del envío.
     */
    public Envio(Long codigoEnvio, String courier, String ciudadOrigen, String ciudadDestino,
                 Date fechaEnvio, double costoEnvio, String observacionesEnvio) {
        this.codigoEnvio = codigoEnvio;
        this.courier = courier;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fechaEnvio = fechaEnvio;
        this.costoEnvio = costoEnvio;
        this.observacionesEnvio = observacionesEnvio;
    }

    /**
     * Obtiene el código del envío.
     *
     * @return El código del envío.
     */
    public Long getCodigoEnvio() {
        return codigoEnvio;
    }

    /**
     * Establece el código del envío.
     *
     * @param codigoEnvio El código del envío.
     */
    public void setCodigoEnvio(Long codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    /**
     * Obtiene el nombre del courier.
     *
     * @return El nombre del courier.
     */
    public String getCourier() {
        return courier;
    }

    /**
     * Establece el nombre del courier.
     *
     * @param courier El nombre del courier.
     */
    public void setCourier(String courier) {
        this.courier = courier;
    }

    /**
     * Obtiene la fecha de envío.
     *
     * @return La fecha de envío.
     */
    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * Establece la fecha de envío.
     *
     * @param fechaEnvio La fecha de envío.
     */
    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    /**
     * Obtiene el estado del envío.
     *
     * @return El estado del envío.
     */
    public EstadoEnvio getEstadoEnvio() {
        return estadoEnvio;
    }

    /**
     * Establece el estado del envío.
     *
     * @param estadoEnvio El estado del envío.
     */
    public void setEstadoEnvio(EstadoEnvio estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    /**
     * Obtiene el producto del envío.
     *
     * @return El producto del envío.
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Establece el producto del envío.
     *
     * @param producto El producto del envío.
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Obtiene el costo del envío.
     *
     * @return El costo del envío.
     */
    public double getCostoEnvio() {
        return costoEnvio;
    }

    /**
     * Establece el costo del envío.
     *
     * @param costoEnvio El costo del envío.
     */
    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    /**
     * Obtiene las observaciones del envío.
     *
     * @return Las observaciones del envío.
     */
    public String getObservacionesEnvio() {
        return observacionesEnvio;
    }

    /**
     * Establece las observaciones del envío.
     *
     * @param observacionesEnvio Las observaciones del envío.
     */
    public void setObservacionesEnvio(String observacionesEnvio) {
        this.observacionesEnvio = observacionesEnvio;
    }

    /**
     * Método para aceptar una solicitud de envío.
     * Cambia el estado del envío a "Activo" si no lo está ya.
     */
    public void aceptarSolicitud() {
        if (!"Activo".equals(this.estadoEnvio.getNombreEnvio())) {
            this.estadoEnvio.setNombreEnvio("Activo");
        }
    }

    /**
     * Método para establecer las ciudades de origen y destino del envío.
     *
     * @param origen  Ciudad de origen.
     * @param destino Ciudad de destino.
     */
    public void setCiudades(String origen, String destino) {
        this.ciudadOrigen = origen;
        this.ciudadDestino = destino;
    }

    /**
     * Obtiene la ciudad de origen.
     *
     * @return La ciudad de origen.
     */
    public String getCiudadorigen() {
        return ciudadOrigen;
    }

    /**
     * Establece la ciudad de origen.
     *
     * @param ciudadOrigen La ciudad de origen.
     */
    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    /**
     * Obtiene la ciudad de destino.
     *
     * @return La ciudad de destino.
     */
    public String getCiudaddestino() {
        return ciudadDestino;
    }

    /**
     * Establece la ciudad de destino.
     *
     * @param ciudadDestino La ciudad de destino.
     */
    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
}
