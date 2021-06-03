package com.br.generation.exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Insira um valor: ");
		n1 = ler.nextInt();
		
		System.out.println("Insira um valor: ");
		n2 = ler.nextInt();
		
		System.out.println("Insira um valor: ");
		n3 = ler.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("O maior valor é: " + n1);
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("O maior valor é: " + n2);
		}
		else if(n3>n1 && n3>n2) {
			System.out.println("O maior valor é: " + n3);
		}
	}

}
