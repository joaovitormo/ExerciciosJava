package com.br.generation.exercicios01;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b, c, r=0, s=0, d;
		
		System.out.println("Digite o valor A: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o valor B: ");
		b = entrada.nextInt();
		
		System.out.println("Digite o valor C: ");
		c = entrada.nextInt();
		
		r = (r * s) * (r * s);
        s = (b * c) * (b * c);
        d = (r + s) / 2;
        
        
        System.out.println("O resultado é: " + d );

	}

}
