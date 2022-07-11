package br.com.generation.exerciciosLacos;

import java.util.Scanner;

public class Exercico02 {
	
	public static void main(String[] args) {
	
	int pares = 1, impares = 0, numero = 0;
	
	Scanner entrada = new Scanner(System.in);
	
	for (int i = 0; i<=10 ; i++) {
		System.out.println("Digite um númenro: ");
		numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			pares++;
		} else {
			impares++;
		}
	} 
	 System.out.println("A quantidade de pares é: " + pares + ". A quantidade de impares é: " + impares);
	 entrada.close();
	}

}
	


