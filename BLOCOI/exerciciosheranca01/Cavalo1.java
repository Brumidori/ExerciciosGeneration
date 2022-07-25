package br.com.generation.exerciciosheranca01;

public class Cavalo1 extends Animal1 implements InterfaceAnimal{
	
	public void EmitirSom() {
		System.out.println("Som de cavalo...");
	}
	
	public void Movimento() {
		System.out.println("Cavalo correndo...");
	}
}
