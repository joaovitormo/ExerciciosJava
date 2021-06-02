package com.br.generation.exercicios01;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.println("Entre com o custo de fábrica: ");
		custoFabrica = ler.nextDouble();
		
		distribuidor = custoFabrica + (custoFabrica*0.28);
		custoConsumidor = distribuidor + (distribuidor*0.45);
		
		System.out.println("Custo ao consumidor: " + custoConsumidor);
	}

}
