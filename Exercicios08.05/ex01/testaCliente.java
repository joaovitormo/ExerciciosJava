package com.br.generation.poo.ex01;

public class testaCliente {

	public static void main(String[] args) {
		cliente cliente01 = new cliente();
		
		cliente01.setNome("Jo�o");
		cliente01.setIdade(20);
		cliente01.setRg(23564946);
		cliente01.setCpf(56545464);
		cliente01.setTelefone(1195654544);
		cliente01.setConta(200.00);
		
		System.out.println("O nome �: " + cliente01.getNome());
		System.out.println("A idade �: " + cliente01.getIdade());
		System.out.println("O RG �: " + cliente01.getRg());
		System.out.println("O CPF �: " + cliente01.getCpf());
		System.out.println("O telefone �: " + cliente01.getTelefone());
		System.out.println("O valor da conta �: R$" + cliente01.getConta());

	}

}
