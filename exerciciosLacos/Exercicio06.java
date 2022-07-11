package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		int numero, divisiveis = 0, media= 0, contador = 0, soma = 0;
	
		do {
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		
		
		if (numero % 3 == 0 && numero != 0) {
			divisiveis = numero;
			soma += divisiveis;
			contador++; 
			media = soma/contador;
		}
		
		
		
		} while(numero != 0);
		
		System.out.println("Fim do programa.");
		System.out.println("A média dos números digitados multiplos de 3 é: " + media);
		entrada.close();
	}

}
