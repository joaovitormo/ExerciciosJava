package com.br.generation.poo.ex06;

public class ContaBancaria {
	//Atributos
	private String Nome;
	private String CPF;
	private String Telefone;
	private Double ValorConta;
	
	//Metodos
	void Extrato() {
		
	}
	void Sacar() {
		
	}
	void Depositar() {
		
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public Double getValorConta() {
		return ValorConta;
	}
	public void setValorConta(Double valorConta) {
		ValorConta = valorConta;
	}
	
	public void dados() {
		System.out.println("***Informações da Conta***");
		System.out.println("Nome: " + Nome);
		System.out.println("CPF: " + CPF);
		System.out.println("Valor em conta: " + ValorConta);
		System.out.println("Telefone: " + Telefone);
	}

}
