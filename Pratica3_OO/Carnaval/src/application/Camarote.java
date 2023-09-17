package application;

public class Camarote extends Ingresso {
	
	private double valorAdicionalCamarote;
	private String localicazao;
	
	public Camarote(double valor, double valorAdicionalCamarote, String localicazao) {
		super(valor);
		this.valorAdicionalCamarote = valorAdicionalCamarote;
		this.localicazao = localicazao;
	}

	public double getValorAdicionalCamarote() {
		return valorAdicionalCamarote;
	}

	public void setValorAdicionalCamarote(double valorAdicionalCamarote) {
		this.valorAdicionalCamarote = valorAdicionalCamarote;
	}

	public String getLocalicazao() {
		return localicazao;
	}

	public void setLocalicazao(String localicazao) {
		this.localicazao = localicazao;
	}
	
	public void ingressoCamarote() {
		System.out.println("O valor do ingresso Camarote é " + (getValorAdicionalCamarote() + getValor()) + " e está localizado em " + getLocalicazao());
	}

}
