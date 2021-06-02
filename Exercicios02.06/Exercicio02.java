package com.br.generation.exercicios01;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int anos, meses, dias, diasTotais, resto1;
		
		System.out.println("Escreva sua idade em dias: ");
		diasTotais = entrada.nextInt();
		
		anos = diasTotais /365;
		resto1 = diasTotais % 365;
        meses = resto1 / 30;
        dias = resto1 % 30;
        
        System.out.println("A quantidade de anos é: " + anos);
        System.out.println("A quantidade de meses é: " + meses);
        System.out.println("A quantidade de dias é: " + dias);
	}

}
