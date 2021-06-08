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
		
		System.out.println("O código de indentificação é: "+ aviao01.getNome());
		System.out.println("O modelo é: "+ aviao01.getModelo());
		System.out.println("O pais atual é: "+ aviao01.getPais());
		System.out.println("O ano de fabricação é: "+ aviao01.getAno());
		System.out.println("A capacidade máxima é: "+ aviao01.getCapacidade());
		System.out.println("A companhia aerea é: "+ aviao01.getCompanhia());

	}

}
