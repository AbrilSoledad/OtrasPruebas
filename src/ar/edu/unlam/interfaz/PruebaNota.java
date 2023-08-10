package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Nota;

public class PruebaNota {
	
 public static void main(String [] args) {
	
	Scanner teclado = new Scanner (System.in);
	
	Nota nota = new Nota(3);
	
	mostrarPorConsola("La nota es " + nota.getValor());
	
	System.out.println("");
	
	if (nota.aprobado()== true) {
		mostrarPorConsola("El alumno esta aprobado");
	} else {
		mostrarPorConsola("El alumno esta desaprobado");
	}
	
	
	
	
	
	
	
	
	teclado.close();
  }

  private static void mostrarPorConsola(String mensaje) {
	  System.out.println(mensaje);
  }

}
