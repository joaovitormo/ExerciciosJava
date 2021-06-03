package com.br.generation.exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double par, resultado, numero;
		
		System.out.println("Digite um valor: ");
		numero = ler.nextInt();
		
		par = numero % 2;
		
		if (par==0) {
			numero = Math.sqrt(numero);
			System.out.printf("Esse valor é par, a raiz quadrada dele é: %.2f %n" , numero);
		}
		else {
			numero = Math.pow(numero, 2);
			System.out.printf("Esse valor é impar, a potencia dele é: %.2f %n", numero);
		}
	}
	


}
