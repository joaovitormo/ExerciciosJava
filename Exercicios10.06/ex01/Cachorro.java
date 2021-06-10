package com.br.generation.heranca.ex01;

public class Cachorro extends Animal implements InterfaceAnimal{

	@Override
	public void EmitirSom() {
		System.out.println("auauauauaua");
		
	}

	@Override
	public void Correr() {
		System.out.println("Cachorro correndo...");

		
	}

}
