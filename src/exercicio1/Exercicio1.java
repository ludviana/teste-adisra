package exercicio1;

import java.text.NumberFormat;

public class Exercicio1 {
	private double dolar;

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

	public String convertendoParaReais(double d) {
		double reais = d * dolar;
		String valorFormatado = NumberFormat.getCurrencyInstance().format(reais);

		return valorFormatado;
	}
	
}
