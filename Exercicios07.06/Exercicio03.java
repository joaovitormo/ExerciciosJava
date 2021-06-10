package br.com.generation.exercicios04;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double[][] matriz = new double[3][3];
		int contMaior = 0;
		
		for(int l = 0; l<3; l++) {
			for(int c = 0; c<3; c++) {
				System.out.print("Digite um valor: ");
				matriz[l][c] = ler.nextDouble();
			}
		}
		for(int l = 0; l<3; l++) {
			for(int c = 0; c<3; c++) {
				if(matriz[l][c] > 10) {
					contMaior++;
				}
				System.out.print("| " +matriz[l][c] + " |");
			}
			System.out.println();
		}
		
		System.out.println("Qntd de números maiores que 10: "+ contMaior);
		
	}

}
