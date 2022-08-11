package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.Calculadora;
import model.Moneda;

class CalculadoraTest {

	Calculadora calculator = new Calculadora(0.0, 0, 1);
	Moneda[] currencies = {new Moneda(1.0, "Dollar", "US", "USD", '$'), new Moneda(0.9777, "Euro", "Europe", "EUR", '€')};
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
