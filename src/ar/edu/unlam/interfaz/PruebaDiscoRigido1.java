package ar.edu.unlam.interfaz;

import ar.edu.unlam.dominio.DiscoRigido;

import java.util.Scanner;

public class PruebaDiscoRigido1 {

	public static void main(String []args) {
		
		DiscoRigido disco = new DiscoRigido();
		
		Scanner teclado = new Scanner (System.in);
		
		int valor = 0;
		
		System.out.println("Ingrese la cantidad de TB del Seagate:");
		valor = teclado.nextInt();
		System.out.println("Es igual a " + disco.cuantosDvd(valor) + " DVDs");
		System.out.println("Es igual a " + disco.cuantosBlueRay(valor) + " Blue Rays");
		
		System.out.println("");
		
		System.out.println("Ingrese la cantidad de TB del Hitachi: ");
		valor = teclado.nextInt();
		System.out.println("Es igual a " + disco.cuantosDvd(valor) + " DVDs");
		System.out.println("Es igual a " + disco.cuantosBlueRay(valor) + " Blue Rays");
		
		System.out.println("");
		
		System.out.println("Ingrese la cantidad de TB del WesternDigital: ");
		valor = teclado.nextInt();
		System.out.println("Es igual a " + disco.cuantosDvd(valor) + " DVDs");
		System.out.println("Es igual a " + disco.cuantosBlueRay(valor) + " Blue Rays");
		
		System.out.println("");
		
		System.out.println("Ingrese la cantidad de TB del Toshiba: ");
		valor = teclado.nextInt();
		System.out.println("Es igual a " + disco.cuantosDvd(valor) + " DVDs");
		System.out.println("Es igual a " + disco.cuantosBlueRay(valor) + " Blue Rays");
		
		
		teclado.close();
	}
}
