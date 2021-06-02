package com.br.generation.exercicios01;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = entrada.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = entrada.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = entrada.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = entrada.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		e = entrada.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		f = entrada.nextDouble();
		
		x =((c * e)-(b * f)) / ((a * e)-(b * d));
		y =((a * f)-(c * d)) / ((a * e)-(b * d));
		
		System.out.printf("O valor de X é: %.2f %n", x);
		System.out.printf("O valor de Y é: %.2f %n ", y);
		
	}

}
