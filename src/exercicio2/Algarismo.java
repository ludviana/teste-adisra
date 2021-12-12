package exercicio2;

public class Algarismo {
	
	private char numero;
	private int  quantidade;

	public Algarismo(char n, int q ) {
		this.numero = n;
		this.quantidade = q;
	}
	
	
	public char getNumero(){
		return numero;
	}
	
	public void setNumero( char n ){
		this.numero = n;
	}
	
	public int getQuantidade(){
		return quantidade;
	}
	
	public void setQuantidade( int q ){
		this.quantidade = q;
	}
}
