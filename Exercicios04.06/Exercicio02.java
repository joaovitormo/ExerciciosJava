package com.br.generation.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, i=0, par=0, impar=0;
		

		
		for(;i<10;i++) {
			System.out.println("Digite um n�mero");
			numero = ler.nextInt();
			if(numero%2==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("A quantidade de n�meros pares �: " + par);
		System.out.println("A quantidade de n�meros impares �: " + impar);
	}

}
