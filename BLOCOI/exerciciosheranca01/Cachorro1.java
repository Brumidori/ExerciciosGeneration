package br.com.generation.exerciciosheranca01;

public class Cachorro1 extends Animal1 implements InterfaceAnimal{
	
	public void EmitirSom() {
		System.out.println("Som de Cachorro...");
	}
	
	public void Movimento() {
		System.out.println("Cachorro correndo...");
	}
}
