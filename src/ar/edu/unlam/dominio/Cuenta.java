package ar.edu.unlam.dominio;

public class Cuenta {

	private String titular;
	private double saldo;
	
	
	public Cuenta(String titular) {
		this.titular = titular;
	}
	
	
	public Cuenta(String titular,double saldoInicial) {
		this.titular = titular;
		
	}


	
	public String getTitular() {
		return titular;
	}

	
	public void setTitular(String titular) {
		this.titular = titular;
	}


	
	public double getSaldo() {
		return saldo;
	}


	
	
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", saldo=" + saldo + "]";
	}


	public void depositar(double deposito) {
		
		this.saldo = saldo + deposito;
		
	}
	
	
	public void retirar(double retirar) {
		this.saldo = saldo - retirar;
	}
	
	
	
}

