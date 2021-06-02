package com.br.generation.exercicios01;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float segundos, hora, minutos;
		
		System.out.println("Escreva o tempo total em segundos: " );
		segundos = entrada.nextFloat();
		
		hora = segundos / 3600;
		
		minutos = segundos/60;
		
		System.out.printf("A quantidade de horas são: %.2f %n", hora);
		System.out.printf("A quantidade de minutos são: %.2f %n", minutos);
	}

}
