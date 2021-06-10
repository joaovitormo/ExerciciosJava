package com.br.generation.heranca.ex01;


public class Testa {

	public static void main(String[] args) {
		Cachorro meuCachorro = new Cachorro();
		meuCachorro.setNome("Bob");
		meuCachorro.setIdade(3);
		
		Cavalo cavalo01 = new Cavalo();
		cavalo01.setNome("Nino");
		cavalo01.setIdade(9);
		
		
		meuCachorro.EmitirSom();
		meuCachorro.Correr();
		System.out.println("O nome dele é: " + meuCachorro.getNome());
		System.out.println("A idade dele é: " + meuCachorro.getIdade());
		
		cavalo01.EmitirSom();
		cavalo01.Correr();
		System.out.println("O nome dele é: " + cavalo01.getNome());
		System.out.println("A idade dele é: " + cavalo01.getIdade());


	}

}
