package com.br.generation.poo.ex03;

public class TestaProduto {

	public static void main(String[] args) {
		Produto produto01 = new Produto();
		
		produto01.setNome("Iphone 12");
		produto01.setModelo("Iphone 12 128gb roxo");
		produto01.setMarca("Apple");
		produto01.setAno(2020);
		produto01.setVoltagem(220);
		
		
		System.out.println("O nome �: " + produto01.getNome());
		System.out.println("O modelo �: " + produto01.getModelo());
		System.out.println("A marca �: " + produto01.getMarca());
		System.out.println("O ano de fabrica��o �: " + produto01.getAno());
		System.out.println("A voltagem �: " + produto01.getVoltagem());
	}

}
