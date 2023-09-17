package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String placa;
		int ano, eixo, assento;
		
		System.out.println("Digite a placa do ônibus: ");
		placa = sc.nextLine();
		System.out.println("Digite o ano do ônibus: ");
		ano = sc.nextInt();
		System.out.println("Digite a quantidade de assentos do ônibus: ");
		assento = sc.nextInt();
		
		Onibus onibus = new Onibus(placa, ano, assento);
		
		System.out.println("Digite a placa do caminhão: ");
		sc.nextLine();
		placa = sc.nextLine();
		System.out.println("Digite o ano do caminhão: ");
		ano = sc.nextInt();
		System.out.println("Digite a quantidade de eixos do caminhão: ");
		eixo = sc.nextInt();
		
		Caminhao caminhao = new Caminhao(placa, ano, eixo);
		
		onibus.exibirDados();
		caminhao.exibirDados();
		
		sc.close();

	}

}
