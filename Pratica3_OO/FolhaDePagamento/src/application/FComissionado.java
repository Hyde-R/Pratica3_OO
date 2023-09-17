package application;

public class FComissionado extends Funcionario{
	
	private double percentual;
	private double venda;
	
	public FComissionado(int matricula, String nome, double salario, double percentual, double venda) {
		super(matricula, nome, salario);
		this.percentual = percentual;
		this.venda = venda;
	}
	
	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}

	public double calcularProventos() {
		return getSalario() + ((getVenda() * getPercentual())/100);
	}

}
