package br.mackenzie.programacao.bbb1;

import java.util.Scanner;

public class LevantamentoPrecos {
	public static void main(String[] args) {
		double[] precos = new double[10];
		
		
		// Solicitar que o usu�rio forne�a o pre�o do produto em cada uma das 10 lojas
		for (int i = 0; i < precos.length; i++) {
			System.out.print("Digite o preco do produto na loja " + (i+1) + " : ");
			precos[i] = recebeInputDouble();
		}
				
		// Calcular o pre�o m�dio do produto
		double soma = 0.0;
		for (int i = 0; i < precos.length; i++) {
			soma += precos[i]; 
		}
		double media = soma/precos.length;
	
		// Calcular a quantidade de lojas que est�o vendendo o produto acima da m�dia
		int qtdeLojaAcimaPreco = 0;
		for (int i = 0; i < precos.length; i++) {
			if (precos[i] > media) {
				qtdeLojaAcimaPreco++;
			}
		}
		
		// Mostrar os valores valores calculados
		System.out.println("Pre�o m�dio: " + media);
		System.out.println("Quantidade de lojas acima da m�dia: " + qtdeLojaAcimaPreco);
		

	}
	
	private static Double recebeInputDouble() {
		Scanner input = new Scanner(System.in);
		return Double.parseDouble(input.next());
	}
	
}
