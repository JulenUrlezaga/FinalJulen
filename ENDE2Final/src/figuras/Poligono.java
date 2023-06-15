package figuras;

import java.util.ArrayList;

import base.FiguraGeometrica;

public class Poligono extends FiguraGeometrica {

	// N�mero de lados del pol�gono:
	private int lados;
	// Longitud de cada lado:
	private double longitudLado;
	// Altura al centro:
	private double altura;
	//Los puntos donde est�n los v�rtices
	private ArrayList<Punto> vertices;


	public Poligono(String nombreAsignado) {
		super(nombreAsignado);
	}
	/**
	 * @author Asier Iza
	 * @param lados--> int
	 * @param altura--> double
	 * @param valorCalculado--> double (2.0*altura*Math.tan(Math.PI / lados)
	 * @return double
	 * @throws ArithmeticException
	 */
	public static double obtenerLongitudLado(int lados, double altura) throws ArithmeticException{
		double valorCalculado = 2.0*altura*Math.tan(Math.PI / lados);
		return valorCalculado;
	}
	public double calcularPerimetro() {
		double perimetro = 0.0;
		if (getLongitudLado() > 0) {
			perimetro = getLados() * getLongitudLado();
		}else if(getAltura() > 0) {
			double longitudLado = obtenerLongitudLado(getLados(), getAltura());
			perimetro = getLados() * longitudLado;
		}
		setPerimetro(perimetro);
		return perimetro;
	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	public double getLongitudLado() {
		return longitudLado;
	}

	public void setLongitudLado(double longitudLado) {
		this.longitudLado = longitudLado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	public ArrayList<Punto> getVertices() {
		return vertices;
	}
	public void setVertices(ArrayList<Punto> vertices) {
		this.vertices = vertices;
	}
	@Override
	public double getPerimetro() {
		return calcularPerimetro();
	}


}
