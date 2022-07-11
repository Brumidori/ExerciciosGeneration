package br.com.generation.exerciciosLacos;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		int entrevistados = 1, idade =0, calma = 0, homensA = 0, mulheresN = 0, outrosC = 0 , nervosas40 = 0, calmas18 = 0;
		int comportamento, sexo;
		Scanner entrada = new Scanner(System.in);
		
		while ( entrevistados <= 150) {
		
			entrevistados++;
			System.out.println("Qual sua idade? ");
			idade = entrada.nextInt();
			
			System.out.println("Qual seu sexo? (Digite 1 para feminino, 2 para masculino e 3 para outros) ");
			sexo = entrada.nextInt();
			
			System.out.println("Você se considera uma pessoa 1 - calma, 2 - nervosa ou 3 - agressiva? (Digite o nº correspondente");
			comportamento = entrada.nextInt();
					
				if (comportamento == 1) {
					calma++;
				}
				if (sexo == 1 && comportamento == 2) {
					mulheresN++;
				}
				if (sexo == 2 && comportamento == 3) {
					homensA++;
				}
				if (sexo == 3 && comportamento == 1) {
					outrosC++;
				}
				if (idade > 40  && comportamento == 2) {
					nervosas40++;
				}
				if (idade <18  && comportamento == 1) {
					calmas18++;
				}
		
		}
		entrada.close();
		System.out.println("O número de pessoas calmas é: " + calma);
		System.out.println("O número de mulheres nervosas é: " + mulheresN);
		System.out.println("O número de homens agressivos é: " + homensA);
		System.out.println("O número de outros calmos é: " + outrosC);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + nervosas40);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: " + calmas18);
	}
}
