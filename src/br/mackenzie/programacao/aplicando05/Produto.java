package br.mackenzie.programacao.aplicando05;

public class Produto {
	public int codigo;
	public String descricao;
	private double preco;
	private int quantidade;
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco(){
		return this.preco;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}

	public double calculaValor() {
		return this.preco * this.quantidade;
	}
}
