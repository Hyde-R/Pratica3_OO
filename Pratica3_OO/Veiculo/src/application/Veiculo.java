package application;

import javax.swing.JOptionPane;

public abstract class Veiculo {

	private String placa = "";
	private int ano = 0;
	
	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Dados do ônibus: \n \nPlaca: " + getPlaca() + "\nAno: " + getAno());
	}
}
