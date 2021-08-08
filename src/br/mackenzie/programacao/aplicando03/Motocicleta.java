package br.mackenzie.programacao.aplicando03;

public class Motocicleta {
	
	public String modelo;
	public String marca;
	public int nroChassi;
	public String nroPlaca;
	public String cor;
	public int nroCilindradas;
	
	public String licenciar() {
		int nroFinal = Integer.parseInt(nroPlaca.substring(nroPlaca.length()-1));
		String[] meses = {"dezembro", "abril", "maio", "junho", "julho", "agosto"
				, "agosto", "setembro", "outubro", "novembro", "dezembro"};
		return meses[nroFinal];
	}
	
	public boolean checaChassi(int nro) {
		if (nro == nroChassi) {
			return true;
		}
		return false;
	}
}
