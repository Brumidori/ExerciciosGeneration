package br.com.generation.exerciciospoo;

public class TestaAviao {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao ();
		Aviao aviao2 = new Aviao ();

		
		aviao1.setTipo("Jato");
		aviao1.setCor("branco");
		aviao1.setVelocidade(600);
		
		aviao1.partir();
		System.out.println("Modelo avião: " + aviao1.getTipo());
		System.out.println("Idade do cliente: " + aviao1.getCor());
		System.out.println("Telefone do cliente: " + aviao1.getVelocidade() + "KM/h.\n");
		
		aviao2.setTipo("Helicoptero");
		aviao2.setCor("vermelho");
		aviao2.setVelocidade(400);
		
		aviao2.pousar();
		System.out.println("Modelo avião: " + aviao2.getTipo());
		System.out.println("Idade do cliente: " + aviao2.getCor());
		System.out.println("Telefone do cliente: " + aviao2.getVelocidade() + "KM/h.");
		
		
	}

}
