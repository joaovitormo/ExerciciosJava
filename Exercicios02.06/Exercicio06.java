package com.br.generation.exercicios01;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double x1, x2, y1, y2, d, raiz;
		
		System.out.println("Valor de X no 1º ponto: " );
		x1 = entrada.nextFloat();
		
		System.out.println("Valor de Y no 1º ponto: " );
		y1 = entrada.nextFloat();
		
		System.out.println("Valor de X no 2º ponto: " );
		x2 = entrada.nextFloat();
		
		System.out.println("Valor de Y no 2º ponto: " );
		y2 = entrada.nextFloat();
		
		d = ((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1));
		//função para pegar a raiz
		raiz = Math.sqrt(d);
		
		System.out.printf("A distância entre os pontos é: %.2f %n", raiz );
	
	
	}

}
