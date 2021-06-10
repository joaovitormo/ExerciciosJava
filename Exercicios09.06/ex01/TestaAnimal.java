package co.br.generation.heranca.ex01;

public class TestaAnimal {
	public static void main(String[] args) {
		Cachorro dog01 = new Cachorro();
		Cavalo cavalo01 = new Cavalo();
		Preguica preguica01 = new Preguica();
		
		dog01.setNome("Guinho");
		dog01.setIdade(5);
		
		cavalo01.setNome("Pé de pano");
		cavalo01.setIdade(10);
		
		preguica01.setNome("Preguicinha");
		preguica01.setIdade(2);
		
		
		System.out.println("Informações do animal");
		System.out.println("Nome: " + dog01.getNome());
		System.out.println("Idade: " + dog01.getIdade());
		dog01.Som();
		dog01.Correr();
		
		System.out.println();
		System.out.println("Informações do animal");
		System.out.println("Nome: " + cavalo01.getNome());
		System.out.println("Idade: " + cavalo01.getIdade());
		cavalo01.Som();
		cavalo01.Correr();
		
		System.out.println();
		System.out.println("Informações do animal");
		System.out.println("Nome: " + preguica01.getNome());
		System.out.println("Idade: " + preguica01.getIdade());
		preguica01.Som();
		preguica01.Correr();
	}

}
