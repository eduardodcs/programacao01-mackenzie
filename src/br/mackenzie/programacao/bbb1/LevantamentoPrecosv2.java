package br.mackenzie.programacao.bbb1;

import java.util.Scanner;

public class LevantamentoPrecosv2 {

	public static void main(String[] args) {
		double[] precos = new double[10];
		
		solicitarDados(precos);
		double media = calcularMedia(precos);
		int lojasComPrecoMaior = verificaLojasAcimaPreco(precos, media);
		
		
		// Mostrar os valores valores calculados
		System.out.println("Preço médio: " + media);
		System.out.println("Quantidade de lojas acima da média: " + lojasComPrecoMaior);

	}
	
	static void solicitarDados(double[] precos) {
		// Solicitar que o usuário forneça o preço do produto em cada uma das 10 lojas
		for (int i = 0; i < precos.length; i++) {
			System.out.print("Digite o preco do produto na loja " + (i+1) + " : ");
			precos[i] = recebeInputDouble();
		}
	}
	
	static double calcularMedia(double[] precos) {
		// Calcular o preço médio do produto
		double soma = 0.0;
		for (int i = 0; i < precos.length; i++) {
			soma += precos[i]; 
		}
		double media = soma/precos.length;
		return media;
	}
	
	static int verificaLojasAcimaPreco(double[] precos, double media) {
		// Calcular a quantidade de lojas que estão vendendo o produto acima da média
		int qtdeLojaAcimaPreco = 0;
		for (double preco : precos) {
			if (preco > media) {
				qtdeLojaAcimaPreco++;
			}
		}
		return qtdeLojaAcimaPreco;
	}
	
	private static Double recebeInputDouble() {
		Scanner input = new Scanner(System.in);
		return Double.parseDouble(input.next());
	}
	

}
