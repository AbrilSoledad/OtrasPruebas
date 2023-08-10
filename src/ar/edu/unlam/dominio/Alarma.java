package ar.edu.unlam.dominio;

public class Alarma {
	
	//atributos

	//private boolean sensorDeMovimiento;
	//private boolean sensorDeContacto;
	//private boolean sensorDeSonido;
	private boolean encendida;
	private int codigoDeSeguridad;
	
	
	//Constructores
	
	public Alarma(int codigoDeSeguridad) {
		this.codigoDeSeguridad = 1234;

		
	}
	
	
	//Metodos
	
	public void encender() {
		
		if(encendida == true) {
		this.encender();
		} 
	}
	
	
	
	public void apagar() {
		
	}
	
	
	public boolean activada(int codigo) {
			
	boolean	activada = false;
	

	if(this.codigoDeSeguridad == codigo) {
		activada = true;
	} else {
		activada = false;
	}
	
		return activada;
	}
	
	
	
}
