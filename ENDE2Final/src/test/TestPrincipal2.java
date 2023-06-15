package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import figuras.Poligono;

class TestPrincipal2 {

	@Test
	void testCalcularPerimetro1() {
		Poligono p1=new Poligono("yow");
		p1.setLados(5);
		p1.setLongitudLado(6);
		double resultado=p1.calcularPerimetro();
		assertEquals(30.0,resultado);
	}
	
	@Test
	void testCalcularPerimetro2() {
		Poligono p2=new Poligono("yow");
		p2.setLados(-2);
		p2.setLongitudLado(7);
		double resultado=p2.calcularPerimetro();
		assertEquals(14.0,resultado);
	}
	
	@Test
	void testCalcularPerimetro3() {
		Poligono p3=new Poligono("yow");
		p3.setLados(4);
		p3.setLongitudLado(-8);
		double resultado=p3.calcularPerimetro();
		assertEquals(0.0,resultado);
	}

}
