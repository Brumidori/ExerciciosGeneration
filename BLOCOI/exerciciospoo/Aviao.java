package br.com.generation.exerciciospoo;

public class Aviao {
	/* 2) Crie uma classe avião e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto avião, defina as instancias deste
	objeto e apresente as informações deste objeto no console. */
	
	//caracteristicas - atributos
	private String tipo;
	private String cor;
	private double velocidade;
	
	// getters and setters
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	//ação método
	void partir() {
		System.out.println("Avião partindo..." + tipo);
	}
	void pousar() {
		System.out.println("Avião pousando..." + tipo);
	}
	
	
}
