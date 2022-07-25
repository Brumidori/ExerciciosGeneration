package br.com.generation.exerciciosheranca01;

public class Preguica1 extends Animal1 implements InterfaceAnimal{
	
	public void EmitirSom() {
		System.out.println("Som de preguica...");
	}
	
	public void Movimento() {
		System.out.println("Preguica subindo em uma arvore...");
	}
}
