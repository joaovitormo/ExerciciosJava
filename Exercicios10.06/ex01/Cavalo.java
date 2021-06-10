package com.br.generation.heranca.ex01;

public class Cavalo extends Animal implements InterfaceAnimal{

	@Override
	public void EmitirSom() {
		System.out.println("*******emitindo sons******");
		
	}

	@Override
	public void Correr() {
		System.out.println("*******cavalo galopando******");
		
	}

}
