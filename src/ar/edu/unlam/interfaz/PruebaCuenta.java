package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Cuenta;

public class PruebaCuenta {

	public static void main(String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		Cuenta cuentaInicial = new Cuenta("Riquel Ivan");
		
		
		mostrarPorConsola("El titular de la cuenta es: " + cuentaInicial.getTitular());
		
		mostrarPorConsola("Su saldo actual es de: " + cuentaInicial.getSaldo());
		
		
		Cuenta cuenta = new Cuenta("Riquel Ivan", 0);
		
		mostrarPorConsola("Cuanto dinero desea depositar? Ingrese la cantidad: ");
		double deposito = teclado.nextDouble();

		cuenta.depositar(deposito);
		
		mostrarPorConsola("Su saldo actual es de: " + cuenta.getSaldo());
		
		mostrarPorConsola("Cunato dinero desea retirar? Ingrese la cantidad: ");
		double retirar = teclado.nextDouble();
		
		cuenta.retirar(retirar);
		
		
		System.out.println(cuenta.toString());
		
		
		
		teclado.close();
	}	
	
	 private static void mostrarPorConsola(String mensaje) {
		  System.out.println(mensaje);
	  }
}

