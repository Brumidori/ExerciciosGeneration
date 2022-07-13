package br.com.generation.exerciciospoo;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Cliente {
	//caracteristicas ... variaveis ... atributos de classes... 
		private int idade;
		private String nome;
		private String telefone;
		
		//getters and setters -- serviços que me auxilia noa cesso e na modificação dos dados
		
		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefome) {
			this.telefone = telefome;
		}

			//Ações - métodos
	
		
			void comprar () {
				System.out.println("Cliente está comprando");
			}
			
			void ajuda() {
				System.out.println("Cliente precisa de ajuda");
			}

	}

