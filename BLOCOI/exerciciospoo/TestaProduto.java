package br.com.generation.exerciciospoo;

public class TestaProduto {

	public static void main(String[] args) {
		ProdutoEletronico produto1 = new ProdutoEletronico ();
		ProdutoEletronico produto2 = new ProdutoEletronico ();

		
		produto1.setProduto("Celular");
		produto1.setMarca("Samsumg");
		produto1.setPreco(1200.99);
		
		produto1.comprar();
		System.out.println("Produto adquirido: " + produto1.getProduto());
		System.out.println("Marca do produto: " + produto1.getMarca());
		System.out.println("Preço: " + produto1.getPreco() + " reais.\n");
		
		produto2.setProduto("AirFryer");
		produto2.setMarca("Mondial");
		produto2.setPreco(729.99);
		
		produto2.comprar();
		System.out.println("Produto adquirido: " + produto2.getProduto());
		System.out.println("Marca do Produto: " + produto2.getMarca());
		System.out.println("Preço " + produto2.getPreco() + " reais.");
		
	}

}
