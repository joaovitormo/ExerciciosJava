package com.br.generation.poo.ex04;

import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		Funcionario fun01 = new Funcionario();
		System.out.print("Digite o nome: ");
		fun01.setNome("Digite o nome: " + ler.nextLine());
		fun01.setSexo("Digite o sexo: " + ler.nextLine());
		fun01.setCargo("Digite o cargo: " + ler.nextLine());
		fun01.setMatricula(ler.nextInt());
		fun01.setTelefone(ler.nextDouble());
		
		fun01.dados();

	}

}
