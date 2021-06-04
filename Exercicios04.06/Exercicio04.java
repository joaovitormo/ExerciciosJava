package com.br.generation.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, sexo, opcoes, i=0, calma=0, nervosa=0, agressivo=0;
		int outroCalmo=0, nervosa40=0, calma18=0;
		
		
		while(i < 5) {
			i++;
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite a seu sexo (1-feminino / 2-masculino / 3-Outros): ");
			sexo = ler.nextInt();
			
			System.out.println("Opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva): ");
			opcoes = ler.nextInt();	
			
			if(opcoes == 1) {
				calma = calma + 1;
			}
			else if(opcoes == 2 && sexo==1) {
				nervosa = nervosa + 1;
			}
			else if(opcoes == 3 && sexo==2) {
				agressivo = agressivo + 1;
			}
			if(opcoes==1 && sexo ==3) {
				outroCalmo = outroCalmo + 1;
			}
			if(opcoes==2 && idade >40) {
				nervosa40 = nervosa40 + 1;
			}
			if(opcoes==1 && idade <18) {
				calma18 = calma18 + 1;
			}
				
		}
		System.out.println("*****Dados extraidos*****");
		System.out.println("Número de pessoas calmas: " + calma);
		System.out.println("Número de mulheres nervosas: " + nervosa);
		System.out.println("Número de homens agressivos: " + agressivo);
		System.out.println("Número de outros calmos: " + outroCalmo);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: " + nervosa40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: " + calma18);

	}

}
