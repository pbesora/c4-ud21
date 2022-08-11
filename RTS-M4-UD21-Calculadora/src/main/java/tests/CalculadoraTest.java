package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import logic.Calculadora;
import model.Moneda;

class CalculadoraTest {

	Calculadora calculator = new Calculadora(0.0, 0, 1);
	Moneda[] currencies = { new Moneda(1.0, "Dollar", "US", "USD", '$'),
						    new Moneda(0.9777, "Euro", "Europe", "EUR", '€')};

	@Test
	public void testGetterMoneda() {
		assertEquals(currencies[0].getValor(), 1.0);
		assertEquals(currencies[0].getNombre(), "Dollar");
		assertEquals(currencies[0].getLugar(), "US");
		assertEquals(currencies[0].getAbrev(), "USD");
		assertEquals(currencies[0].getSimbolo(), '$');
		assertEquals(currencies[0].toString(), ("US - Dollar"));
		
		assertEquals(currencies[1].getValor(), 0.9777);
		assertEquals(currencies[1].getNombre(), "Euro");
		assertEquals(currencies[1].getLugar(), "Europe");
		assertEquals(currencies[1].getAbrev(), "EUR");
		assertEquals(currencies[1].getSimbolo(), '€');
		assertEquals(currencies[1].toString(), ("Europe - Euro"));
	}
	
	@Test
	public void testllenarMonedas() {
		assertEquals(calculator.getMonedas(), "[US - Dollar, Europe - Euro]");
	}

}
