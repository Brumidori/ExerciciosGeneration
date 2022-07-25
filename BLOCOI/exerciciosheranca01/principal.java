package br.com.generation.exerciciosheranca01;

public class principal {

	public static void main(String[] args) {
		Cachorro1 cachorro = new Cachorro1();
		cachorro.setNome("Jullie");
		cachorro.setIdade(14);
		
		Cavalo1 cavalo = new Cavalo1();
		cavalo.setNome("Pegasus");
		cavalo.setIdade(7);
		
		Preguica1 preguica = new Preguica1();
		preguica.setNome("Sid");
		preguica.setIdade(1000);
		
		System.out.println("O cachorro " + cachorro.getNome() + " de idade: " + cachorro.getIdade());
		cachorro.EmitirSom();
		cachorro.Movimento();
		System.out.println();
		
		System.out.println("O cavalo " + cavalo.getNome() + " de idade: " + cavalo.getIdade());
		cavalo.EmitirSom();
		cavalo.Movimento();
		System.out.println();
		
		System.out.println("A preguiça " + preguica.getNome() + " de idade: " + preguica.getIdade());
		preguica.EmitirSom();
		preguica.Movimento();

	}

}
