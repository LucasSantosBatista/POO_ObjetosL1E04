/**
 * 
 */
package model;

import javax.swing.JOptionPane;

/**
 * @author Lucas Batista 23 de mar. de 2024
 */
public class ProdutoObj {
	private String nome;
	private float preco;
	private int qtdEstoque;

	public ProdutoObj(String nome, float preco, int qtdEstoque) {
		this.nome = nome;
		if (preco < 0) {
			this.preco = 0;
		} else {
			this.preco = preco;
		}
		
		if (qtdEstoque < 0){
			this.qtdEstoque = 0;
		} else {
			this.qtdEstoque = qtdEstoque;
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		if (preco < 0) {
			this.preco = 0;
		} else {
			this.preco = preco;
		}
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		if (qtdEstoque < 0){
			this.qtdEstoque = 0;
		} else {
			this.qtdEstoque = qtdEstoque;
		}
	}

	public boolean verificaProdutoDisponivel(String nomeProcurado) {
		String nomeProduto = getNome();
		int quantidadeProduto = getQtdEstoque();
		
		if (nomeProduto == nomeProcurado && quantidadeProduto > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public float totalValorEstoque() {
		float preco = getPreco();
		int estoque = getQtdEstoque();
		
		return preco * estoque;
	}
}
