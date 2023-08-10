package ar.edu.unlam.dominio;

public class Punto {

	private int valorDeX;
	private int valorDeY;
	
	public Punto(int valorX, int valorY ) {
		this.valorDeX = valorX;
		this.valorDeY = valorY;
	}
	
	
	public boolean puntoSobreX() {
		boolean resultado = false;
	
		if(this.valorDeY == 0) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
	
	
	
	public boolean puntoSobreY() {
		boolean resultado = false;
	
		if(this.valorDeX == 0) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
	
	
	public boolean origenDeCoordenadas() {
		boolean resultado = false;
	
		if(this.valorDeX == 0 && this.valorDeY == 0) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
	
	
	
	
	
}
