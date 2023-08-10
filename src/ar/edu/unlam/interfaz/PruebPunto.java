package ar.edu.unlam.interfaz;

import ar.edu.unlam.dominio.Punto;

import java.util.Scanner;

public class PruebPunto {

	public static void main(String []args) {
		
	Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de X: ");
		int valorX = teclado.nextInt();
		
		System.out.println("Ingrese el valor de Y: ");
		int valorY = teclado.nextInt();
		
		Punto punto = new Punto(valorX,valorY);
		
		
		if(punto.puntoSobreX()== true) {
			System.out.println("El punto esta sobre el eje X");
			
		} else if(punto.puntoSobreY()== true) {
			System.out.println("El punto esta sobre el eje Y");
			
		} else if(punto.origenDeCoordenadas()== true) {
			System.out.println("El punto esta en el origen de coordenadas");
			
		} else {
			System.out.println("El punto no se encuentra sobre alguno de los ejes");
		}
		
		
			
		
		
	   teclado.close();
	}
}
