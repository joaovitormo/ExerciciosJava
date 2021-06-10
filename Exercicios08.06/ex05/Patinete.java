package com.br.generation.poo.ex05;

public class Patinete {
	//Atributos
	
	private String Nome;
	private String Marca;
	private String Modelo;
	private String Cor;
	
	//metodos
	void Andar() {
		
	}
	
	void Correr() {
		
	}
	void Parar() {
		
	}
	
	//Getters e Setters

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}
	
	public void dados() {
		System.out.println("***Informações do Patinete***");
		System.out.println("Nome: " + Nome);
		System.out.println("Marca: " + Marca);
		System.out.println("Modelo: " + Modelo);
		System.out.println("Cor: " + Cor);
	}
	
	

}
