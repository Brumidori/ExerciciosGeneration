package br.com.generation.exercicios;

import java.util.Scanner;

public class ExerciciosLacos01 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		
		int a, b, c, maior;
		
		System.out.println("Digite o primeiro número: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o seegundo número: ");
		b = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		c = entrada.nextInt();
		
		entrada.close();
		
		if (a>b) {
			if (a>c) {
				maior = a;
			} else {
				maior = c;
			}
		} else {
			if(b>c) {
				maior = b;
			} else {
				maior = c;
			}
		}
		System.out.println("O maior número dos três é: " + maior);
		
	}
}
