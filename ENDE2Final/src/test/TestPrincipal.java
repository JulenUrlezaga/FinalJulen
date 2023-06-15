package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import figuras.Poligono;

class TestPrincipal {
	
	@ParameterizedTest
	@CsvSource({
		"5,6,30.0",
		"-2,7,14.0",
		"4,-8,0.0"
	})

	void testCalcularPerimetro(int lados,int longitud,double perimetro) {
		Poligono pol1 = new Poligono("Test");
		pol1.setLados(lados);
		pol1.setLongitudLado(longitud);
		double result = pol1.calcularPerimetro();
		
		assertEquals(perimetro, result);
	}

}
