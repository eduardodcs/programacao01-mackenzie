package br.mackenzie.programacao.aplicando07;

public class ProdutoPerecivel extends Produto {
	
	int validade;
	
	public ProdutoPerecivel(String nome, int quantidade, double preco, int validade) {
		super(nome, quantidade, preco);
		this.validade = validade;
	}

	@Override
	public void retiraEstoque(int qtde) {
		if (validade > 2) {
			quantidade = 0;
		}
		super.retiraEstoque(qtde);
	}
	
	@Override
	public void entraEstoque(int qtde) {
		if(quantidade > 0) {
			System.out.println("Não pode misturar o produto com datas diferentes de validade.");
		} else {
			quantidade = qtde;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + validade;
	}
}
