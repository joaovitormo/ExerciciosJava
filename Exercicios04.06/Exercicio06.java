package com.br.generation.exercicios;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, soma=0, i=0;
		
		do {
			
			System.out.println("Insira um número: ");
			numero = ler.nextInt();
			if(numero % 3==0) {
				i++;
				soma += numero; 
			}
		}while(numero != 0);
		soma = soma / i;
		System.out.println("A media dos multiplos é: " + soma);
		
	}

}
