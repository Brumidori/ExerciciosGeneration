package br.com.generation.exerciciosvetoresmatriz;

import java.util.Scanner;

public class Exercicio04matriz {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int soma = 0;
		int somaDiagonal = 0;
		
		for(int l = 0; l < matriz.length ; l++) {
			for (int c =0; c< matriz[l].length; c++) {
				System.out.print("Insira um número: " );
				matriz[l][c] = input.nextInt();
				soma += matriz[l][c];
			
			}
		}
		somaDiagonal = matriz[0][0] + matriz[1][1] + matriz [2][2];
		System.out.println("A soma dos valores da matriz é: "+ soma);
		System.out.println("A soma da diagnonal principal é: " + somaDiagonal);
		input.close();
	}

}
