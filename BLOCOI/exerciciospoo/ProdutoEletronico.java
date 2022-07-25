package br.com.generation.exerciciospoo;

public class ProdutoEletronico {
	/* 3) Crie uma classe produto eletrônico e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto produto eletrônico,
	defina as instancias deste objeto e apresente as informações deste objeto
	no console. */

		//caracteristicas
		private String produto;
		private String marca;
		private double preco;
		
		//getters and setters 


		public String getProduto() {
			return produto;
		}

		public void setProduto(String produto) {
			this.produto = produto;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		void comprar() {
			System.out.println("Comprou o(a) " + produto);
		}
		
	}