package com.br.generation.ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaProdutos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Produtos> produtos = new ArrayList<>();

		int opcao = 0;
		int qntd = 0;
		do {

			System.out.println("Seja bem-vindo ao controle de estoque!");
			System.out.println("O que você deseja? Escolha uma opção pelo número");
			System.out.println("1 - Adicionar um produto ao estoque");
			System.out.println("2 - Remover um produto do estoque");
			System.out.println("3 - Atualizar um produto do estoque");
			System.out.println("4 - Listar todos os produtos do estoque");
			System.out.println("5 - Para sair do programa");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:

				System.out.println();
				System.out.println("Digite a quantidade de produtos que será inserido: ");
				qntd = entrada.nextInt();

				for (int i = 0; i < qntd; i++) {

					System.out.print("Digite a quantidade do produto: ");
					int Quantidade = entrada.nextInt();

					entrada.nextLine();
					entrada.nextLine();
					System.out.print("Digite o nome do produto: ");
					String Nome = entrada.nextLine();

					entrada.nextLine();
					System.out.print("Digite a categoria do produto: ");
					String Categoria = entrada.nextLine();

					produtos.add(new Produtos(Nome, Categoria, Quantidade));
				}
				break;
			case 2:
				for (int i = 0; i < produtos.size(); i++) {
					System.out.println((i) + "º " + "Posição: " + produtos.get(i));
				}
				System.out.println("Qual dessas posições você deseja excluir?");
				int exclui = entrada.nextInt();
				produtos.remove(exclui);
				break;
			case 3:
				for (int i = 0; i < produtos.size(); i++) {
					System.out.println((i) + "º " + "Posição: " + produtos.get(i));
				}
				System.out.println("Qual dessas posições você deseja alterar?");
				exclui = entrada.nextInt();

				System.out.print("Digite a quantidade do produto: ");
				int Quantidade = entrada.nextInt();

				entrada.nextLine();
				entrada.nextLine();
				System.out.print("Digite o nome do produto: ");
				String Nome = entrada.nextLine();

				entrada.nextLine();
				System.out.print("Digite a categoria do produto: ");
				String Categoria = entrada.nextLine();

				produtos.get(exclui).setNome(Nome);
				produtos.get(exclui).setCategoria(Categoria);
				produtos.get(exclui).setQuantidade(Quantidade);
				break;
			case 4:
				for (Produtos pr : produtos) {
					System.out.println(pr);
					System.out.println();
				}
				break;
			}
		} while (opcao != 5);
		entrada.close();
	}

}
