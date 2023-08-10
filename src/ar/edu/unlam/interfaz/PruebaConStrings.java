package ar.edu.unlam.interfaz;

public class PruebaConStrings {

	public static void main(String[]args) {
		
		
		String minuscula = "java es case sensitive";
		String mayuscula = "HOY VA A SER UN BUEN DIA";
		
		System.out.println(minuscula);
		System.out.println("cantidad de caracteres: " + minuscula.length());
		
		System.out.println("");
		
		System.out.println(mayuscula + ".");
		
		System.out.println("");
		
		System.out.println(mayuscula);
		System.out.println("cantidad de caracteres: " + mayuscula.length());
		
		System.out.println("");
		
		System.out.println(mayuscula.toLowerCase());
		System.out.println(minuscula.toUpperCase());
	}
}
