package com.br.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.println("Insira sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("10-14 infantil");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("15-17 juvenil");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("18-25 adulto");
		}
		else {
			System.out.println("Sua idade n�o est� classificada em nenhuma categoria!");
		}
		
	}

}
