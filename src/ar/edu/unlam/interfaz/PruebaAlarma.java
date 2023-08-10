package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Alarma;

public class PruebaAlarma {

	public static void main(String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Inserte el codigo de seguridad: ");
		int codigo = teclado.nextInt();
		
		Alarma alarma = new Alarma(codigo);
		
		 alarma.encender(); 
		
		 System.out.println("Alarma encendida");
		 
		if(alarma.activada(codigo)== true) {
		System.out.println("La alarma esta activa");
		} else {
			System.out.println("Clave incorrecta");
		}
		
		
		
		
		
		
		teclado.close();
	}	
}
