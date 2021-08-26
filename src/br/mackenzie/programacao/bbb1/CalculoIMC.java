package br.mackenzie.programacao.bbb1;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		System.out.println("*****Calculadora IMC*****");
		
		System.out.println("Será feito o cálculo para quantas pessoas? ");
		int qtdePessoas = recebeInputInteger();
		
		float[] pesos  = new float[qtdePessoas];
		float[] alturas = new float[qtdePessoas];
		float[] imcs = new float[qtdePessoas];
		
		for (int i = 0; i < qtdePessoas; i++) {
			int pessoa = i + 1;
			System.out.println("Digite o peso (Kg) da " + pessoa + "° pessoa: ");
			pesos[i] = recebeInputFloat();
			System.out.println("Digite a altura (m) da " + pessoa + "° pessoa: ");
			alturas[i] = recebeInputFloat();
		}
		
		for (int i = 0; i < qtdePessoas; i++) {
			int pessoa = i + 1;
			imcs[i] = (float) (pesos[i] / Math.pow(alturas[i], 2));
			System.out.printf("Dados da %d° pessoa: %.2fKg, %.2fm, IMC = %.2f", pessoa, pesos[i], alturas[i], imcs[i]);
			System.out.println("\n*********************************");
		}
	}
	
	
	
	private static Float recebeInputFloat() {
		Scanner input = new Scanner(System.in);
		return Float.parseFloat(input.next());
	}
	
	private static Integer recebeInputInteger() {
		Scanner input = new Scanner(System.in);
		return Integer.parseInt(input.next());
	}

}
