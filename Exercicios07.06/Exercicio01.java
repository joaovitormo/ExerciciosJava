package br.com.generation.exercicios04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] A = new int[6];
		int soma=0;
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		
		/*for(int i=0;i<6;i++) {
			System.out.println("Digite um valor: ");
			A[i] = ler.nextInt();
		}*/
		for(int i=0;i<6;i++) {
			System.out.println("|" + A[i] + "|");
			soma = A[0] + A[1] + A[5];
			A[4] = 100;
			
		}
		System.out.println();
		System.out.println("Resultado da soma das posições A[0], A[1] e A[5]  é: " +soma);
	}

}
