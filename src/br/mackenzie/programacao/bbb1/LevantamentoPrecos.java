package br.mackenzie.programacao.bbb1;

import java.util.Scanner;

public class LevantamentoPrecos {
	public static void main(String[] args) {
		double[] precos = new double[10];
		
		
		// Solicitar que o usuário forneça o preço do produto em cada uma das 10 lojas
		for (int i = 0; i < precos.length; i++) {
			System.out.print("Digite o preco do produto na loja " + (i+1) + " : ");
			precos[i] = recebeInputDouble();
		}
				
		// Calcular o preço médio do produto
		double soma = 0.0;
		for (int i = 0; i < precos.length; i++) {
			soma += precos[i]; 
		}
		double media = soma/precos.length;
	
		// Calcular a quantidade de lojas que estão vendendo o produto acima da média
		int qtdeLojaAcimaPreco = 0;
		for (int i = 0; i < precos.length; i++) {
			if (precos[i] > media) {
				qtdeLojaAcimaPreco++;
			}
		}
		
		// Mostrar os valores valores calculados
		System.out.println("Preço médio: " + media);
		System.out.println("Quantidade de lojas acima da média: " + qtdeLojaAcimaPreco);
		

	}
	
	private static Double recebeInputDouble() {
		Scanner input = new Scanner(System.in);
		return Double.parseDouble(input.next());
	}
	
}
