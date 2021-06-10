package com.br.generation.poo.ex07;

public class Paciente {
	private String Nome;
	private String CPF;
	private String Telefone;
	private String Doenca;
	
	
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
	public String getDoenca() {
		return Doenca;
	}
	public void setDoenca(String doenca) {
		Doenca = doenca;
	}
	
	public void dados() {
		System.out.println("***Informações do Paciente***");
		System.out.println("Nome: " + Nome);
		System.out.println("CPF: " + CPF);
		System.out.println("Telefone: " + Telefone);
		System.out.println("Doença: " + Doenca);
	}
	
}
