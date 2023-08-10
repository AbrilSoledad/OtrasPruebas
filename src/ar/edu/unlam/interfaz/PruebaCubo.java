package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Cubo;

public class PruebaCubo {
	
public static void main(String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese el valor del lado del cubo: ");
		float ladoIngresado = teclado.nextFloat();
		
		Cubo cubo = new Cubo(ladoIngresado);
		
		System.out.println("El volumen del cubo es: " + cubo.getVolumen());
		
		System.out.println("El area lateral del cubo es " + cubo.getSuperficieCara());
		
		
		
		teclado.close();
  }	
}
