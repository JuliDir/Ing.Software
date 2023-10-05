package envio.ModuloEnvio.Envio.Model;

import envio.Domain.Carrito;
import envio.Domain.CarritoDetalle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CarritoComprasIT {

    @Test
    public void verificarAñadirCarritoDetalle(){
        Carrito carrito = new Carrito(new ArrayList<CarritoDetalle>());
        CarritoDetalle carritoDetalle = new CarritoDetalle();

        carrito.agregarCarridoDetalle(carritoDetalle);

        assert (carrito.getCarritoDetalles().contains(carritoDetalle));
    }

    @Test
    public void verificarEliminarCarritoDetalle(){
        Carrito carrito = new Carrito(new ArrayList<CarritoDetalle>());
        CarritoDetalle carritoDetalle = new CarritoDetalle();
        carrito.agregarCarridoDetalle(carritoDetalle);

        carrito.eliminarCarritoDetalle(carritoDetalle);

        assert (!carrito.getCarritoDetalles().contains(carritoDetalle));
    }

    @Test
    public void verificarIncrementoCarritoDetalle(){
        CarritoDetalle carritoDetalle = new CarritoDetalle(5);
        int incremento = 5;
        int cantidadEsperada = incremento + carritoDetalle.getCantidad();

        carritoDetalle.incrementarCantidad(incremento);

        assert (carritoDetalle.getCantidad() == cantidadEsperada);
    }

    @Test
    public void verificarMinimaCantidadCarritoDetalle(){
        CarritoDetalle carritoDetalle = new CarritoDetalle(3);
        int decremento = 5;

        carritoDetalle.decrementarCantidad(decremento);

        assert (carritoDetalle.getCantidad() >= 1);
    }
}
