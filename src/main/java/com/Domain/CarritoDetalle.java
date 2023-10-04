package com.Domain;

public class CarritoDetalle {
    private int cantidad;
    public CarritoDetalle(){}

    public CarritoDetalle(int cantidad){
        this.cantidad = cantidad;
    }

    public void incrementarCantidad(int cantidad){
        this.cantidad += cantidad;
    }

    public void decrementarCantidad(int cantidad){
        int resultado = this.cantidad - cantidad;

        this.cantidad = resultado < 1 ?  1 : resultado;
    }
    public int getCantidad(){
        return cantidad;
    }
}
