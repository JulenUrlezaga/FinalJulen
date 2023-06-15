package programas;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


import figuras.Poligono;

public class Principal {
	private static Scanner teclado = new Scanner(System.in);
	
	private static final Logger LOGGER = Logger.getLogger(Principal.class.getName());

	public static void main(String[] args) {
		
		
		Handler fileHandler  = null;

		try{
			
			String seguir = "n";// No seguir por defecto
			
            fileHandler  = new FileHandler("logs/actividad.log", true);
            
            LOGGER.setUseParentHandlers(false);
            
             
            LOGGER.addHandler(fileHandler);
            
            fileHandler.setLevel(Level.WARNING);
            
            LOGGER.setLevel(Level.FINE);
             
            LOGGER.config("Configuración hecha.");
            LOGGER.log(Level.FINE, "Nivel de log FINE");
			
   

		do {
			mostrarMenu();

			int opcion = teclado.nextInt();
			switch (opcion){
			case 1:
				obtenerPerimetroConLadosAltura();
				break;
			case 2:
				obtenerPerimetroConLadosLongitud();
				break;
			default:
				mostrarMensajeOpcionInvalida();
			}

			System.out.println("�Crear nuevo pol�gono? (S/N) ");
			seguir = teclado.next();
		} while (seguir.equalsIgnoreCase("s"));

	}catch(IOException exception){
        LOGGER.log(Level.SEVERE, "Ocurrió un error en FileHandler.", exception);
    }
	}

	private static void mostrarMensajeOpcionInvalida() {
		System.out.println("Introduce una opci�n v�lida.");
	}

	private static void obtenerPerimetroConLadosLongitud() {
		Poligono poligono;
		double longitudLado;
		int lados;
		System.out.println("Introduce el n�mero de lados:");
		lados = teclado.nextInt();
		if (lados==0 || lados==1 || lados ==2) {
			LOGGER.log(Level.WARNING, "El usuario ha intentado meter 0,1 o 2 como valor para los lados"+lados);
		}
		System.out.println("Introduce la longitud de cada lado:");
		longitudLado = teclado.nextDouble();
		poligono = new Poligono("NUEVO POLIGONO");
		poligono.setLados(lados);
		poligono.setLongitudLado(longitudLado);
		System.out.println("Per�metro: " + poligono.getPerimetro());
	}

	private static void obtenerPerimetroConLadosAltura() {
		Poligono poligono;
		double altura;
		int lados;
		System.out.println("Introduce el n�mero de lados:");
		lados = teclado.nextInt();
		if (lados==0 || lados==1 || lados ==2) {
			LOGGER.log(Level.WARNING, "El usuario ha intentado meter 0,1 o 2 como valor para los lados,en este caso: "+lados);
		}
		System.out.println("Introduce la altura al centro:");
		altura = teclado.nextDouble();
		poligono = new Poligono("NUEVO POLIGONO");
		poligono.setLados(lados);
		poligono.setAltura(altura);
		System.out.println("Per�metro: " + poligono.getPerimetro());
	}

	private static void mostrarMenu() {
		System.out.println("");
		System.out.println("Este programa crea un pol�gono con los datos introducidos por el usuario y calcula el per�metro.");
		System.out.println("Selecciona los datos de los que dispones:");
		System.out.println("1. N�mero de lados y Altura.");
		System.out.println("2. N�mero de lados y Longitud de un lado.");
	}

}
