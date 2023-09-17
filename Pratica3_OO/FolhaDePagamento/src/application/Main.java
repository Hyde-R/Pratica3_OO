package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int matricula, producao;
		double salario, valorVenda, percentualVenda, valorProdutividade;
		int tipoFunc;
		
		System.out.println("Digite a matrícula do funcionário: ");
		matricula = sc.nextInt();
		
		System.out.println("Digite o nome do funcionário: ");
		sc.nextLine();
		nome = sc.nextLine();
		
		System.out.println("Digite o salário do funcionário: ");
		salario = sc.nextDouble();
		
		FPadrao padrao = new FPadrao(matricula, nome, salario);
		
		System.out.println("Qual o tipo de funcionário? \n 1: padrão \n 2: produtividade \n 3: comissionado.");
		tipoFunc = sc.nextInt();
		
		if(tipoFunc == 2) {
			System.out.println("Digite o valor da producao: ");
			valorProdutividade = sc.nextDouble();
			System.out.println("Digite a quantidade vendida: ");
			producao = sc.nextInt();
			FProdutividade produtividade = new FProdutividade(matricula, nome, salario, valorProdutividade, producao);
			System.out.println("Os proventos do funcionario " + produtividade.getNome() + " são: " + produtividade.calcularProventos());
		}
		else if(tipoFunc == 3) {		
			System.out.println("Digite o percentual da venda: ");
			percentualVenda = sc.nextDouble();
			System.out.println("Digite o valor da venda: ");
			valorVenda = sc.nextDouble();
			FComissionado comissionado = new FComissionado(matricula, nome, salario, percentualVenda, valorVenda);
			System.out.println("Os proventos do funcionario " + comissionado.getNome() + " são: " + comissionado.calcularProventos());
		}
		else if(tipoFunc == 1) {
			System.out.println("Os proventos do funcionario " + padrao.getNome() + " são: " + padrao.calcularProventos());
		}
		else {
			System.out.println("Opção Inválida!");
		}
		sc.close();
	}

}
