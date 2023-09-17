package application;

public class Normal extends Ingresso{

	public Normal(double valor) {
		super(valor);
		
	}

	public void ingressoNormal() {
		System.out.println("O valor do ingresso normal é: " + getValor());
	}
}
