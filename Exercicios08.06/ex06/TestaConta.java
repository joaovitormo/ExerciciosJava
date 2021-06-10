package com.br.generation.poo.ex06;

public class TestaConta {

	public static void main(String[] args) {
		ContaBancaria conta01 = new ContaBancaria();
		
			conta01.setNome("João Vitor");
			conta01.setCPF("2545564499");
			conta01.setTelefone("11895685686");
			conta01.setValorConta(980.00);
			
			conta01.dados();
	}

	
}


