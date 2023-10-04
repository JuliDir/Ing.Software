package com.ModuloEnvio.Envio;

import com.Domain.Carrito;
import com.Domain.CarritoDetalle;
import com.Domain.Envio;
import com.Domain.EstadoEnvio;
import com.Domain.Producto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class EnvioApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void verificarAñadirCarritoDetalle(){
		Carrito carrito = new Carrito(new ArrayList<CarritoDetalle>());
		CarritoDetalle carritoDetalle = new CarritoDetalle();

		carrito.añadirCarritoDetalle(carritoDetalle);

		assert (carrito.getCarritoDetalles().contains(carritoDetalle));
	}

	@Test
	public void verificarEliminarCarritoDetalle(){
		Carrito carrito = new Carrito(new ArrayList<CarritoDetalle>());
		CarritoDetalle carritoDetalle = new CarritoDetalle();
		carrito.añadirCarritoDetalle(carritoDetalle);

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
