package br.mackenzie.programacao.bbb1;

import java.util.Scanner;

public class CalculoIMCv2 {
	
	
	public static void main(String[] args) {
		
		System.out.println("*****Calculadora IMC*****");
		
		System.out.print("Será feito o cálculo para quantas pessoas? ");
		int qtdePessoas = recebeInputInteger();
		
		float[] pesos  = new float[qtdePessoas];
		float[] alturas = new float[qtdePessoas];
		double[] imcs = new double[qtdePessoas];
		
		
		solicitarDados(qtdePessoas, pesos, alturas);
		calcularVariosImcs(qtdePessoas, pesos, alturas, imcs);
		imprimirResultados(qtdePessoas, pesos, alturas, imcs);
		
	}
	
	
	static void solicitarDados(int qtdePessoas, float[] pesos, float[] alturas) {
		for (int i = 0; i < qtdePessoas; i++) {
			int pessoa = i + 1;
			System.out.print("Digite o peso (Kg) da " + pessoa + "° pessoa: ");
			pesos[i] = recebeInputFloat();
			System.out.print("Digite a altura (m) da " + pessoa + "° pessoa: ");
			alturas[i] = recebeInputFloat();
		}
	}
	
	
	static void calcularVariosImcs(int qtdePessoas, float[] pesos, float[] alturas, double[] imcs) {
		for (int i = 0; i < qtdePessoas; i++) {
			imcs[i] = calcularIMC(pesos[i], alturas[i]);
		}
	}
	
	static void imprimirResultados(int qtdePessoas, float[] pesos, float[] alturas, double[] imcs) {
		for (int i = 0; i < qtdePessoas; i++) {
			System.out.printf("Dados da %d° pessoa: %.2fKg, %.2fm, IMC = %.2f \n", (i+1), pesos[i], alturas[i], imcs[i]);
		}
	}
	
	static double calcularIMC(float peso, float altura) {
		double imc = peso / Math.pow(altura, 2);
		return imc;
	}
	
	
	static Float recebeInputFloat() {
		Scanner input = new Scanner(System.in);
		return Float.parseFloat(input.next());
	}
	
	static Integer recebeInputInteger() {
		Scanner input = new Scanner(System.in);
		return Integer.parseInt(input.next());
	}
	
	
	
	

}
