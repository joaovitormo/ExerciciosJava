package com.br.generation.ex01;

public class Produtos {
	private String Nome;
	private String Categoria;
	private int Quantidade;
	
	public Produtos(String nome, String categoria, int quantidade) {
		super();
		Nome = nome;
		Categoria = categoria;
		Quantidade = quantidade;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "Produto=" + Nome + ", Categoria=" + Categoria + ", Quantidade=" + Quantidade ;
	}
	
	
	
	

}
