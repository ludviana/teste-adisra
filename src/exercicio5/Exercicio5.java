package exercicio5;

public class Exercicio5 {

	public int recursividade(int n) {
		if (n == 1) {
			return 1;
		} else {
			return 1 + recursividade(n - recursividade(recursividade(n - 1)));
		}
	}

	public void golomb(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(recursividade(i) + " ");	
		}
		System.out.println("\n");
	}

}
