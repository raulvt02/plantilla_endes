package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Comercial.
 */

class ComercialTest {

	Comercial comercial;
	
	@BeforeEach
	void setUp() throws Exception {
		comercial = new Comercial("33333333J", "David", "Arenas", 900.0, 2100.0);
	}
	
	@Test
	@DisplayName("Debería lanzar una excepción con un mensaje si una venta es negativa")
	void testCrearVentaInvalida() {
		Exception exception = assertThrows(IllegalArgumentException.class, ()->{new Comercial("33333333J", "David", "Arenas", 900.0, -500);});
		double ventaEsperada = -500;
		String mensajeEsperado = "Las ventas no pueden ser negativas";
		assertEquals(mensajeEsperado, exception.getMessage(), "No se corresponde el mensaje");
	}
	
	@Test
	@DisplayName("Debería obtener una venta válida")
	void testObtenerVentaValida() {
		double ventaEsperada = 2100;
		
		assertEquals(ventaEsperada, comercial.getVentas());
	}
	
	@Test
	@DisplayName("Deberia establecer una nueva venta")
	void testEstablecerNuevaVenta() {
		double ventaEsperada = 2100;
		comercial.setVentas(2100);
		assertEquals(ventaEsperada, comercial.getVentas(), "La venta no se ha establecido correctamente");
	}
	
	@Test
	@DisplayName("Prueba set venta negativa")
	void testSetVentaNegativa() {
		Exception exception = assertThrows(IllegalArgumentException.class, ()->comercial.setVentas(-500));
		String mensajeEsperado = "Las ventas no pueden ser negativas";
		assertEquals(mensajeEsperado, exception.getMessage());
	}
	
	@Test
	@DisplayName("Debería mostrar el incremento de sueldo tras la venta")
	void pruebaExtraSueldo() {
		double ventaEsperada=2100;
		double sueldoEsperado=0.10 * ventaEsperada;
		assertEquals(sueldoEsperado, comercial.calcularExtra());
		
		
	}
	
	@Test
	@DisplayName("Debería calcular el suelto total tras el incremteno de sueldo")
	void pruebaIncrementoTotal() {
		double ventaEsperada=2100;
		double sueldoEsperado= 900 + (0.10 * ventaEsperada);
		assertEquals(sueldoEsperado, comercial.getSueldo());
		
		
	}
	
}
