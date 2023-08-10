package ar.edu.unlam.dominio;

public class Cubo {

	private float longitudLado;
	
	
	
	public Cubo(float lado) {
	 this.longitudLado = lado;
	}



	public float getLongitudLado() {
		return longitudLado;
	}



	public void setLongitudLado(float longitudLado) {
		this.longitudLado = longitudLado;
	}
	
	
	public float getSuperficieCara() {
		float superficieCara = 4 * longitudLado * longitudLado;
		
		return superficieCara;
	}
	
	
	//lado al cubo 
	public float getVolumen() {
		float volumen = longitudLado * longitudLado * longitudLado ;
		
		return volumen;
	}
	
	
}
