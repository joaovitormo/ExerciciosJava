package com.br.generation.exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, soma=0; 
		
		
		do {
			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();
			soma += numero;
			
		}
		while(numero != 0);
		System.out.println("A soma desses n�meros �: " + soma);
	}

}
