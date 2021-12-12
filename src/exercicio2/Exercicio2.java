package exercicio2;

public class Exercicio2 {
	private Algarismo[] sequencia;
	private Algarismo maiorNumero;

	public char numeroQueApareceuMaisVezes(String seq) {

		sequencia = new Algarismo[seq.length()];

		for (char num : seq.toCharArray()) {
			for (int i = 0; i < sequencia.length; i++) {
				if (sequencia[i] != null) {
					if (sequencia[i].getNumero() == num) {
						sequencia[i].setQuantidade(sequencia[i].getQuantidade() + 1);
						break;
					}
				} else {
					sequencia[i] = new Algarismo(num, 1);
					break;
				}
			}
		}

		for (int i = 0; i < sequencia.length; i++) {
			if (sequencia[i] != null) {
				if (maiorNumero != null) {
					if (sequencia[i].getQuantidade() > maiorNumero.getQuantidade()) {
						maiorNumero = sequencia[i];
					}

				} else {
					maiorNumero = sequencia[i];
				}
			}
		}

		return maiorNumero.getNumero();

	}

}
