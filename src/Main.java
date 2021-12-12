import exercicio1.Exercicio1;
import exercicio2.Exercicio2;
import exercicio3.Exercicio3;
import exercicio4.Exercicio4;
import exercicio5.Exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte opcao;
		byte opcao2;

		do {
			System.out.println("--- Menu ---");
			System.out.println("Digite um dos numeros a seguir para acessar os exercicios");
			System.out.println("1 - Exercicio 1");
			System.out.println("2 - Exercicio 2");
			System.out.println("3 - Exercicio 3");
			System.out.println("4 - Exercicio 4");
			System.out.println("5 - Exercicio 5");
			System.out.println("0 - Encerra o programa");
			System.out.println("Escolha uma opção: ");

			opcao = scanner.nextByte();

			switch (opcao) {
			case 1: {
				Exercicio1 ex1 = new Exercicio1();
				ex1.setDolar(5.36);
				System.out.println("Valores proposto no enunciado: ");
				System.out.println(ex1.convertendoParaReais(10));
				System.out.println(ex1.convertendoParaReais(58));
				System.out.println("----------\n");

				do {
					System.out.println("Deseja verificar outro valor ?");
					System.out.println("1 - Sim\n0 - Encerrar o exercicio");
					opcao2 = scanner.nextByte();
					switch (opcao2) {
					case 1: {
						System.out.println("Digite um novo valor em dolares: ");
						double novoValor = scanner.nextDouble();
						System.out.println(ex1.convertendoParaReais(novoValor));

						break;
					}

					case 0: {
						System.out.println("Fim do exercicio.");
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
				break;
			}

			case 2: {
				Exercicio2 ex2 = new Exercicio2();
				System.out.println("Valores proposto no enunciado: ");
				System.out.println(ex2.numeroQueApareceuMaisVezes("245431234"));
				System.out.println(ex2.numeroQueApareceuMaisVezes("123765423754838338788"));
				System.out.println("------------------------------\n");
				do {
					System.out.println("Deseja verificar outro valor ?");
					System.out.println("1 - Sim\n0 - Encerrar o exercicio");
					opcao2 = scanner.nextByte();
					switch (opcao2) {
					case 1: {
						scanner.nextLine();
						System.out.println("Digite um novo valor: ");
						String novo;
						novo = scanner.nextLine();
						System.out.println(ex2.numeroQueApareceuMaisVezes(novo));

						break;
					}

					case 0: {
						System.out.println("Fim do exercicio.");
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
				break;
			}
			case 3: {
				Exercicio3 ex3 = new Exercicio3();
				ex3.menu();
				break;
			}
			case 4: {
				Exercicio4 ex4 = new Exercicio4();
				ex4.main(args);
				break;
			}
			case 5: {
				Exercicio5 ex5 = new Exercicio5();

				System.out.println("Valores proposto no enunciado: ");
				ex5.golomb(3);
				ex5.golomb(10);
				System.out.println("------------------------------\n");
				do {
					System.out.println("Deseja verificar outro valor ?");
					System.out.println("1 - Sim\n0 - Encerrar o exercicio");
					opcao2 = scanner.nextByte();
					switch (opcao2) {
					case 1: {
						System.out.println("Digite um novo valor: ");
						int novoValor;
						novoValor = scanner.nextInt();
						ex5.golomb(novoValor);

						break;
					}

					case 0: {
						System.out.println("Fim do exercicio.");
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

				break;
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

		scanner.close();
	}

}
