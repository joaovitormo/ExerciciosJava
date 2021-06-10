package com.br.generation.poo.ex07;


public class TestaPaciente {

	public static void main(String[] args) {
		Paciente paciente01 = new Paciente();
		
		paciente01.setNome("Pedro");
		paciente01.setCPF("2545564499");
		paciente01.setTelefone("11895685686");
		paciente01.setDoenca("Hipertensão");
		
		paciente01.dados();

	}

}
