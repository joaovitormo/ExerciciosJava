package br.com.generation.exercicios04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double m1[][] = new double[2][2];
		double m2[][] = new double[2][2];
		double m3[][] = new double[2][2];
		int opcao=0, l=0, c=0;
		double constante;
		
		System.out.println("**** 1ª Matriz ****");		
		for(l = 0; l < m1.length; l++) {
			for(c = 0; c < m1[l].length; c++) {
				System.out.printf("Digite os valores da 1ª matriz: [%d] [%d] ", l, c);
				m1[l][c] = ler.nextDouble();	
			}
		}
		System.out.println("**** 2ª Matriz ****");	
		for(l = 0; l < m2.length; l++) {
			for(c = 0; c < m2[l].length; c++) {
				System.out.printf("Digite os valores da 2ª matriz: [%d] [%d] ", l, c);
				m2[l][c] = ler.nextDouble();	
			}
		}
		System.out.println("**** Menu de opções ****");	
		System.out.println("**** Escolha uma duas opções a seguir para continuar ****");
		System.out.println("1 - somar as duas matrizes ");	
		System.out.println("2 - subtrair a primeira matriz da segunda  ");	
		System.out.println("3 - adicionar uma constante as duas matrizes ");	
		System.out.println("4 - imprimir as matrizes  ");
		opcao = ler.nextInt();
		switch(opcao){
			case 1:
				System.out.println("**** Resultado da soma é ****");
				for(l = 0; l < m3.length; l++) {
					for(c = 0; c < m3[l].length; c++) {
						m3[l][c] = m1[l][c] + m2[l][c];
							System.out.print(" | " + m3[l][c]+ " | ");
						}	
					System.out.println();
					break;
				}
		
			case 2:
				System.out.println("**** Resultado da subtração é ****");
				for(l = 0; l < m3.length; l++) {
					for(c = 0; c < m3[l].length; c++) {
						m3[l][c] = m1[l][c] - m2[l][c];
						System.out.print(" | " + m3[l][c]+ " | ");
					}	
				System.out.println();
				break;
			}
			case 3:
				System.out.println("**** Adcionando uma constante as matrizes ****");
				System.out.print("Digite o valor da constante: ");
				constante = ler.nextInt();
				System.out.println("**** Matriz 1 ****");
				for(l = 0; l < m1.length; l++) {
					for(c = 0; c < m1[l].length; c++) {
						m1[l][c] = m1[l][c] + constante;
						
						System.out.print(" | " + m1[l][c]+ " | ");
					}	
				System.out.println();	
				}
				
				System.out.println("**** Matriz 2 ****");
				for(l = 0; l < m2.length; l++) {
					for(c = 0; c < m2[l].length; c++) {
						m2[l][c] = m2[l][c] + constante;
						
						System.out.print(" | " + m2[l][c]+ " | ");
					}	
				System.out.println();
				
				
				}
				break;
			
			case 4:
				System.out.println("**** Matriz 1 ****");
				for(l = 0; l < m1.length; l++) {
					for(c = 0; c < m1[l].length; c++) {
						System.out.print(" | " + m1[l][c]+ " | ");
					}	
				System.out.println();
			}
				
				System.out.println("**** Matriz 2 ****");
				for(l = 0; l < m2.length; l++) {
					for(c = 0; c < m2[l].length; c++) {
						System.out.print(" | " + m2[l][c]+ " | ");
					}	
				
				System.out.println();
				break;
			}
				
				
	}
}
}