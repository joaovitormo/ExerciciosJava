package com.br.generation.poo.ex02;

public class TestaAviao {

	public static void main(String[] args) {
		Aviao aviao01 = new Aviao();
		
		aviao01.setNome("ER55");
		aviao01.setModelo("B737");
		aviao01.setPais("Brasil");
		aviao01.setAno(2006);
		aviao01.setCapacidade(250);
		aviao01.setCompanhia("Gol Linhas Aereas");
		
		System.out.println("O c�digo de indentifica��o �: "+ aviao01.getNome());
		System.out.println("O modelo �: "+ aviao01.getModelo());
		System.out.println("O pais atual �: "+ aviao01.getPais());
		System.out.println("O ano de fabrica��o �: "+ aviao01.getAno());
		System.out.println("A capacidade m�xima �: "+ aviao01.getCapacidade());
		System.out.println("A companhia aerea �: "+ aviao01.getCompanhia());

	}

}
