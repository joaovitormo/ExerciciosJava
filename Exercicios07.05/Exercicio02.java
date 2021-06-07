package br.com.generation.exercicios04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vetor[]= new int[6];
		int par=0, impar=0;
		
		for(int i = 0;i<=5;i++) {
			System.out.print("Digite um número: ");
			vetor[i] = ler.nextInt();
			
			if(vetor[i] % 2 == 0) {
				par += vetor[i];		
			}
			else if (vetor[i] % 2 != 0) {
				impar++;
			}
		}
			System.out.println("==== Números Pares ====");
			
			for(int i = 0;i<6;i++) {
				if(vetor[i]%2==0) {
					System.out.printf("| %d|", vetor[i]);
				}
			}
			
			System.out.println("\n==== Números Impares ====");
			for(int i = 0;i<6;i++) {
				if(vetor[i] % 2 != 0) {
					System.out.printf("| %d|", vetor[i]);
				}
			}
			System.out.println( );
			System.out.println("A soma dos pares é: " + par);
			System.out.println("A qntd  de impares é: " + impar);
		}
		
		
		
		
		
	}


