package br.com.generation.exerciciosvetoresmatriz;

import java.util.Random;

public class Exercicio03VetorA {

public static void main(String[] args) {
		
		int[][] n1 = new int [4][6];
		int[][] n2 = new int [4][6];
		int[][] m1 = new int [4][6];

		
		Random numero = new Random();

		
		for(int l = 0; l < n1.length ; l++) {
			for (int c =0; c< n1[l].length; c++) {
				n1[l][c] = numero.nextInt(10)+1;
			}
		}
		
		System.out.println("A Matriz N1 é: ");
		System.out.println();
		for (int l = 0; l < n1.length ; l++) {
			 for (int c = 0; c < n1[l].length; c++) {
				System.out.print(n1[l][c] + " | ");
			 } System.out.println();
		}
		
		System.out.println();
			
		for(int l = 0; l < n2.length ; l++) {
			for (int c =0; c< n1[l].length; c++) {
			n2[l][c] = numero.nextInt(10)+1;
			}
		}
		
		System.out.println("A Matriz N2 é: ");
		System.out.println();
		for (int l = 0; l < n2.length ; l++) {
			 for (int c = 0; c < n2[l].length; c++) {
				System.out.print(n2[l][c] + " | ");
			 } System.out.println();
			}
		
		System.out.println();
		
		for (int l = 0; l < m1.length ; l++) {
			for (int c = 0; c < m1[l].length; c++) {
			 m1[l][c] = (n1[l][c] + n2[l][c]);
		 }
		}
		
		System.out.println("A matriz M1 é: ");
		for (int l = 0; l < m1.length ; l++) {
			 for (int c = 0; c < m1[l].length; c++) {
				System.out.print(m1[l][c] + " | ");
			 } System.out.println();
			}
			System.out.println();
			
		
	}

}

