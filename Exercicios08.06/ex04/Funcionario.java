package com.br.generation.poo.ex04;

public class Funcionario {
	//Atributos - vari�veis
	private String Nome;
	private String Sexo;
	private String Cargo;
	private int Matricula;
	private double Telefone;
	
	//M�todos - Funcionalidades
	void ChegarNoHorario() {
		
	};
	
	void Trabalhar() {
		
	}
	
	//Getters e Setters

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		Matricula = matricula;
	}

	public double getTelefone() {
		return Telefone;
	}

	public void setTelefone(double telefone) {
		Telefone = telefone;
	}

	public void dados() {
		System.out.println("***Informa��es do Funcion�rio***");
		System.out.println("Nome: " + Nome);
		System.out.println("Sexo: " + Sexo);
		System.out.println("Cargo: " + Cargo);
		System.out.println("Matricula: " + Matricula);
		System.out.println("Telefone: " + Telefone);
	}
	
	
	

	
}
