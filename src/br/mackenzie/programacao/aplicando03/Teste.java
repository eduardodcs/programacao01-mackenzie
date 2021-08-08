package br.mackenzie.programacao.aplicando03;

public class Teste {

	public static void main(String[] args) {
		Motocicleta m1 = new Motocicleta();
		m1.nroPlaca = "DWE5891";
		m1.nroChassi = 45689;
		
		int nro = 456789;
		
		
		System.out.println(m1.licenciar());
		System.out.println(m1.checaChassi(nro));
	}
}
