package com.br.generation.exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		int i = 1000;
		double divisao;
		
		for(;i<2000;i++) {
			divisao = i % 11;
			if(divisao==5) {
				System.out.println(i);
			}
			
		}
	}

}
