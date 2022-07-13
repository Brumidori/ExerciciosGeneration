package br.com.generation.exerciciospoo;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Bruna");
		cliente1.setIdade(27);
		cliente1.setTelefone("(11)0000000000");
		
		System.out.println("Nome do cliente: " + cliente1.getNome());
		System.out.println("Idade do cliente: " + cliente1.getIdade());
		System.out.println("Telefone do cliente: " + cliente1.getTelefone());
		
		cliente1.comprar();
		cliente1.ajuda();
	}

}
