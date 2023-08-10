package ar.edu.unlam.dominio;

public class DiscoRigido {

	private static double DVD = 4.5;
	private static double BLUE_RAY = 15;
	private static double equivaleDvd;
	private static double equivaleBlueRay;
	
	//1 TB = 1024 GB

	public double cuantosDvd(int valor) {
		equivaleDvd = valor * DVD;
	
		return equivaleDvd;
	}

	public double cuantosBlueRay(int valor) {
		equivaleBlueRay = valor * BLUE_RAY;
		
		return equivaleBlueRay;
	}
	
	
	
	
	
}
