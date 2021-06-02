package com.br.generation.exercicios01;

import java.util.Scanner;

public class Exercicio01 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int anos, meses, dias, total;
		
		System.out.println("escreva sua idade completa, primeiramente os anos: ");
		anos = entrada.nextInt();
		
		System.out.println("escreva sua idade completa, segundamente os meses: ");
		meses = entrada.nextInt();
		
		System.out.println("escreva sua idade completa, e por ultimo os dias: ");
		dias = entrada.nextInt();
		
		total = dias +(meses*30) + (anos*365);
		
		
		System.out.println("O total de dias é: " + total);
		

	}

}
