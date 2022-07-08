package br.com.generation.exercicios;

import java.util.Scanner;


public class ExerciciosLacos04 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int numero;
	double raiz, potencia;
	
	System.out.println("Insira um número inteiro: ");
	numero = entrada.nextInt();
	
	if(numero % 2 == 0) {
		System.out.println("O número " + numero + " é par.");
		raiz = Math.sqrt(numero);
		System.out.println("\nA raiz quadrada do número " + numero + " é: " + raiz);
	} else {
		System.out.println("O número " + numero + " é ímpar.");
		potencia = Math.pow(numero, 2);
		System.out.println("\nO número " + numero + " elevado ao quadrado é: " + potencia);
	}
	
	entrada.close();
}
}

