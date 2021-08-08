package br.mackenzie.programacao.aplicando06;

public class Pedido {

	public int numero;
	public Produto item;
	public int quantidade;
	public double valor;
	
	public Pedido(int numero, Produto item, int quantidade) {
		this.numero = numero;
		this.item = item;
		this.quantidade = quantidade;
	}
	
	public void calculaPedido() {
		this.valor = this.item.preco * this.quantidade;		
	}
	
	@Override
	public String toString() {
		return "Numero do pedido: " + numero
				+ "\nC�digo do Produto: " + item.cod
				+ "\nDescri��o: " + item.descricao
				+ "\nPre�o do Produto: " + item.preco
				+ "\nQuantidade: " + quantidade
				+ "\nValor total do pedido: " + valor;
	}
}
