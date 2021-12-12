package exercicio3;

import java.util.ArrayList;

public class Pedido {
	
	private ArrayList<Produto> pedido;
	
	public Pedido() {
		pedido = new ArrayList<Produto>();
	}
	
	public ArrayList<Produto> getPedido() {
		return pedido;
	}

	public void setPedido(Produto p) {
		this.pedido.add(p);
	}

	public double valorPedido() {
		double valor = 0;
		
		for( Produto prod : pedido  ) {
			valor += prod.getPreco();
		}
		
		return valor;
	}
	
	public void limpaPedido() {
		pedido.removeAll(pedido);
	}
}
