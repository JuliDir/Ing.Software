package com.Domain;

/**
 * Clase que representa un estado de envío.
 */
public class EstadoEnvio {

    private String nombreEnvio;

    /**
     * Constructor para crear un estado de envío con un nombre.
     *
     * @param nombreEnvio El nombre del estado de envío.
     */
    public EstadoEnvio(final String nombreEnvio) {
        this.nombreEnvio = nombreEnvio;
    }

    /**
     * Obtiene el nombre del estado de envío.
     *
     * @return El nombre del estado de envío.
     */
    public String getNombreEnvio() {
        return nombreEnvio;
    }

    /**
     * Establece el nombre del estado de envío.
     *
     * @param nombreEnvio El nuevo nombre del estado de envío.
     */
    public void setNombreEnvio(final String nombreEnvio) {
        this.nombreEnvio = nombreEnvio;
    }
}
