package com.ModuloCarrito.Carrito.Model;

import java.util.List;

public class Carrito {
    private List<CarritoDetalle> carritoDetalles;
    public Carrito(List<CarritoDetalle> carritoDetalles){
        this.carritoDetalles = carritoDetalles;
    }
    public void añadirCarritoDetalle(CarritoDetalle carritoDetalle){
        carritoDetalles.add(carritoDetalle);
    }
    public void eliminarCarritoDetalle(CarritoDetalle carritoDetalle){
        carritoDetalles.remove(carritoDetalle);
    }
    public List<CarritoDetalle> getCarritoDetalles(){
        return carritoDetalles;
    }
}
