package application;

public class Vip extends Ingresso{

	private double valorAdicional;
	
	public Vip(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public void ingressoVip() {
		System.out.println("O valor do ingresso VIP é: " + (getValorAdicional() + getValor()));
	}

}
