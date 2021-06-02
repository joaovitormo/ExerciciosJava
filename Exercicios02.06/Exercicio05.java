package com.br.generation.exercicios01;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double n1, n2, n3, media;
		double p1=2.0, p2=3.0, p3=5.0;
		
		System.out.println("Insira a primeira nota: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		n2 = entrada.nextDouble();
		
		System.out.println("Insira a terceira nota: ");
		n3 = entrada.nextDouble();
		
		media = (n1*p1 + n2*p2 + n3*p3) / 10;
		
			
		System.out.println("A média final do aluno é: " + media);
	}

}
