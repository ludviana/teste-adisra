package exercicio3;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio3 {
	Produto prod1 = new Produto("Hamburguer de carne", 20.00);
	Produto prod2 = new Produto("Hamburguer de frango", 16.00);
	Produto prod3 = new Produto("Batata frita", 6.00);
	Produto prod4 = new Produto("Refrigerante", 4.00);
	Produto prod5 = new Produto("Salada", 2.00);
	Produto prod6 = new Produto("Maionese", 1.00);

	Pedido pedido = new Pedido();

	Locale local = new Locale("pt", "BR");
	NumberFormat dinheiro = NumberFormat.getCurrencyInstance(local);

	Scanner scanner = new Scanner(System.in);
	byte opcao;
	byte opcao2;
	byte sn;

	public void desejaSalada() {
		do {
			System.out.println("Gostaria de adicionar " + prod5.getNome() + " por mais "
					+ dinheiro.format(prod5.getPreco()) + " ?");
			System.out.println("1 - sim \n2 - não");
			sn = scanner.nextByte();
			if (sn == 1) {
				pedido.setPedido(prod5);
			}
			if (sn != 1 && sn != 2) {
				System.out.println("\n------------------------------");
				System.out.println("Opção inválida");
				System.out.println("------------------------------\n");
			}
		} while (sn != 1 && sn != 2);
	}

	public void desejaMaionese() {
		do {
			System.out.println("Gostaria de adicionar " + prod6.getNome() + " por mais "
					+ dinheiro.format(prod6.getPreco()) + " ?");
			System.out.println("1 - sim \n2 - não");
			sn = scanner.nextByte();
			if (sn == 1) {
				pedido.setPedido(prod6);
			}
			if (sn != 1 && sn != 2) {
				System.out.println("\n------------------------------");
				System.out.println("Opção inválida");
				System.out.println("------------------------------\n");
			}
		} while (sn != 1 && sn != 2);

	}

	public void menu() {

		Produto[] produtos = new Produto[4];
		produtos[0] = prod1;
		produtos[1] = prod2;
		produtos[2] = prod3;
		produtos[3] = prod4;

		do {

			System.out.println("--- Menu ---");
			System.out.println("Digite um dos numeros a seguir");
			System.out.println("1 - Fazer Pedido");
			System.out.println("0 - Encerra o exercicio");

			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextByte();

			switch (opcao) {
			case 1: {

				do {
					System.out.println("\n------------------------------");

					System.out.println((pedido.getPedido().size() == 0) ? "O que gostaria de pedir?\n"
							: "Gostaria de mais alguma coisa ?\n");

					for (int i = 0; i < produtos.length; i++) {
						System.out.println(i + 1 + " - " + produtos[i].getNome() + " ("
								+ dinheiro.format(produtos[i].getPreco()) + ")");
					}

					System.out.println("5 - Verificar pedido");
					System.out.println("0 - Fechar pedido");

					opcao2 = scanner.nextByte();

					switch (opcao2) {
					case 1: {
						pedido.setPedido(prod1);
						desejaSalada();
						desejaMaionese();
						break;
					}
					case 2: {
						pedido.setPedido(prod2);
						desejaSalada();
						desejaMaionese();
						break;
					}
					case 3: {
						pedido.setPedido(prod3);
						desejaMaionese();
						break;
					}
					case 4: {
						pedido.setPedido(prod4);
						break;
					}
					case 5: {
						System.out.println("\n------------------------------");
						for (int i = 0; i < pedido.getPedido().size(); i++) {
							System.out.println(pedido.getPedido().get(i).getNome() + " "
									+ dinheiro.format(pedido.getPedido().get(i).getPreco()));
						}
						System.out.println("\n");
						System.out.println("Valor Total: " + dinheiro.format(pedido.valorPedido()));
						System.out.println("------------------------------\n");
						break;
					}
					case 0: {
						System.out.println("\n\n------------------------------");
						System.out.println("Valor Total: " + dinheiro.format(pedido.valorPedido()));
						System.out.println("Volte Sempre!");
						System.out.println("------------------------------\n");
						pedido.limpaPedido();
						break;
					}
					default: {
						System.out.println("\n------------------------------");
						System.out.println("Opção inválida");
						System.out.println("------------------------------\n");
						break;
					}
					}

				} while (opcao2 != 0);

			}
			case 0: {
				System.out.println("Fim do programa.");
				break;
			}
			default: {
				System.out.println("\n------------------------------");
				System.out.println("Opção inválida");
				System.out.println("------------------------------\n");
				break;
			}
			}

		} while (opcao != 0);

	}

}
