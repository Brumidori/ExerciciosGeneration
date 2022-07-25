package br.com.generation.exerciciosvetoresmatriz;

import java.util.Random;

public class Exercicio02vetor {

	public static void main(String[] args) {
		
		Random numDado = new Random();
		int[] dado = new int [10]; 
		int soma = 0, media = 0, maior = 0, contador = 0 ;
		
		
		for (int lancamento = 0; lancamento <= 9 ; lancamento++) {
			dado[lancamento] = numDado.nextInt(6)+1;
			soma += dado[lancamento];
			media = soma / dado.length;
			
			if(dado[lancamento] > maior) {
				maior = dado[lancamento];
			}
		}
		System.out.print("Os números lançados foram: ");
		for (int lancamento = 0; lancamento <= 9 ; lancamento++) {
			if (dado[lancamento] == maior) {
				contador++;
				}
			System.out.print(dado[lancamento] + " | ");
	
			}
		System.out.println();
		System.out.println("A média dos lançamentos foi: " + media);
		System.out.println("O maior lançamento foi: " + maior + ", que apareceu " + contador + " vezes.");
	}

}
