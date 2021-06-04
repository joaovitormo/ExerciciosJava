package com.br.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade=0, menor21=0, mais50=0;
		
		while(idade != -99) {
			System.out.println("Informe uma idade: ");
			idade = ler.nextInt();
			if(idade<21 && idade>0) {
				menor21++;
			}
			else if (idade>50){
				mais50++;
			}
			System.out.println("Menores de 21 anos: " + menor21);
			System.out.println("Maiores de 50 anos: " + mais50);

		}

	}

}
