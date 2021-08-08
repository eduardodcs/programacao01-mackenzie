package br.mackenzie.programacao;

import java.util.Scanner;

public class AplicandoConhecimento01 {
	
	public static void main(String[] args) {
		
		System.out.println("***** BEM VINDO *****");
		Scanner input = new Scanner(System.in);
		int opcao;
		double n1, n2;
		while(true) {
			System.out.println("Seleciona a opção desejada: "
					+ "\n1 - Média entre os dois números."
					+ "\n2 - Diferença entre do maior pelo menor."
					+ "\n3 - Multiplicação dos números digitados."
					+ "\n4 - Divisão do primeiro pelo segundo"
					+ "\n5 - Sair");
			opcao = input.nextInt();
			if(opcao == 5) {
				System.out.println("Saindo do programa.....");
				System.out.println("FIM");
				break;
			}
			
			if(opcao < 1 || opcao > 5) {
				System.out.println("OPÇÃO INVÁLIDA");
				continue;
			}
			
			System.out.println("Digite o valor de n1: ");
			n1 = input.nextDouble();
			System.out.println("Digite o valor de n2: ");
			n2 = input.nextDouble();
			
			switch (opcao) {
				case 1: {
					System.out.println((n1+n2)/2);
					break;
				} case 2:{
					if(n1>n2)
						System.out.println(n1-n2);
					else
						if(n2>n1)
							System.out.println(n2-n1);
						else
							System.out.println(0);
					break;
				} case 3:{
					System.out.println(n1*n2);
					break;
				} case 4:{
					if(n2==0) {
						System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO.");
						break;
					}
					System.out.println(n1/n2);
					break;
				}
				default:
					System.out.println("OPÇÃO INVÁLIDA");
			}
				
		}
	}
}
