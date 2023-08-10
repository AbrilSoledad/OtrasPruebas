package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Usuario;

public class PruebaUsuario {

	public static void main(String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		Usuario usuario = new Usuario("usuarioUno","tortuga","Abril","Recabal",45752147, 18);
		
		
		mostrarPorConsola("Nombre: " + usuario.getNombre());
		mostrarPorConsola("Apellido: " + usuario.getApellido());
		mostrarPorConsola("Numero de documento: " + usuario.getDni());
		mostrarPorConsola("Edad: " + usuario.getEdad());
	
		
		
		
		
		teclado.close();
	
   }
private static void mostrarPorConsola(String mensaje) {
	System.out.println(mensaje);
   }
}
