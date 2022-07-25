package br.com.generation.exerciciosvetoresmatriz;

import java.util.Scanner;

public class Exercicio01vetor {

	public static void main(String[] args) {

		int[] vetor = new int [5]; 
		int maior = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira as pontuações das atividades: ");
		
		for(int i=0; i <= 4 ; i++) {
			
			vetor[i] = input.nextInt();
			if ( vetor [i]> maior) {
				maior = vetor [i];
			}
		}
		
		System.out.print("As pontuações das atividades foram: " );
		for(int i=0; i <= 4 ; i++) {
			System.out.print(vetor [i] + " ");
		}
		
		System.out.println();
		System.out.println("A maior pontuação foi: " + maior);
		input.close();

	}

}
