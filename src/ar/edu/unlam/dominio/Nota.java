package ar.edu.unlam.dominio;

public class Nota {

	private float valor;
	
	
	
	public Nota(float valor) {
		this.valor = valor;
	}



	public float getValor() {
		return valor;
	}



	public boolean aprobado() {
		boolean aprobado = false;
		
		if(valor >= 7) {
			aprobado = true;
		} else {
			aprobado = false;
		}
		
	return aprobado;
    }
	
	
	
	public void recuperar(float nuevoValor) {
		
	}
	
	
	
}
