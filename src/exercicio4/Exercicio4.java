package exercicio4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exercicio4 {
	public void main(String[] args) {
		try {
			boolean c = false;
			while (!c) {

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Digite o palindrome inicial(fim para terminar): ");
				String entradaTexto = br.readLine();

				if (entradaTexto.length() < 100) {
					if (entradaTexto.equals("fim")) {
						c = true;
					} else {
						System.out.println("Maior palíndrome é: " + a(entradaTexto));
					}
				} else {
					System.out.print("A cadeia de caracteres precisa ter no máximo 100 elementos\n");
				}
			}
		} catch (Exception e) {

		}
	}

	public static String a(String entradaTexto) {

		String maiorPalindromo = "";
		int tamanhoString = entradaTexto.length();
		int z = tamanhoString;

		for (int i = 0; i < tamanhoString; i++) {

			if (z - i > maiorPalindromo.length()) {
				String palindromoTemporario = entradaTexto.substring(i, z);

				if (b(palindromoTemporario)) {
					if (palindromoTemporario.length() > maiorPalindromo.length()) {
						maiorPalindromo = palindromoTemporario;
					}
				}
				z--;
			}

		}
		return maiorPalindromo;
	}

	public static Boolean b(String word) {

		char[] palavraEmArray = word.toCharArray();
		int tamanhoArrayLetras = palavraEmArray.length;
		char[] palavraAoContraria = new char[tamanhoArrayLetras];
		int cont = 0;

		for (int i = tamanhoArrayLetras - 1; i >= 0; i--) {
			palavraAoContraria[cont] = palavraEmArray[i];
			cont++;
		}

		if (Arrays.equals(palavraAoContraria, palavraEmArray)) {
			return true;
		}

		return false;
	}

}
