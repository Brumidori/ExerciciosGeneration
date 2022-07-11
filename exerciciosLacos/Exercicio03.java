package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
	
		int idade = 0, maior = 0, menor =0;
		Scanner entrada = new Scanner(System.in);
		
		while (idade != -99) {
			System.out.println("Digite a idade: ");
			idade = entrada.nextInt();
			
			if (idade < 21 && idade != -99) {
				menor++;
			} else if (idade > 50) {
				maior++;
			}
			
		}
		
		System.out.println("A quantidade de pessoas com menos de 21 anos é: " + menor);
		System.out.println("A quantidade de pessoas com mais de 50 anos é: " + maior);
		
		entrada.close();
	}
}
