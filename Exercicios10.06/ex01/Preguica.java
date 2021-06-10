package com.br.generation.heranca.ex01;

public class Preguica extends Animal implements InterfaceAnimal{

	@Override
	public void EmitirSom() {
		System.out.println("*******zzzzzzzzzzzz******");
		
	}

	@Override
	public void Correr() {
		System.out.println("*******correndo devagar zzzzzz******");
		
	}

}
