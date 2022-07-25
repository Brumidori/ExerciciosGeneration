package br.com.generation.exercicios;

import java.util.Scanner;

public class ExerciciosLacos02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int valor1, valor2, valor3,a= 0, b = 0, c = 0;
		
		System.out.println("Digite o primeiro número: ");
		valor1 = entrada.nextInt();
		
		System.out.println("Digite o seegundo número: ");
		valor2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		valor3 = entrada.nextInt();
		
		
		
	
		if (valor1 < valor2 && valor1 < valor3) {
			a = valor1;
		} else if (valor2 < valor1 && valor2 < valor3 ) {
			a = valor2;
		} else if (valor3 < valor1 && valor3 < valor2) {
			a = valor3;
		}
				

		if(valor1 > valor2 && valor1 > valor3) {
			c = valor1;
		} else if (valor2 > valor1 && valor2 > valor3) {
			c = valor2;
		} else if (valor3 > valor1 && valor3> valor2) {
			c = valor3;
		}
				
				
		if (valor1 != a && valor1 != c) {
			b = valor1;
		} else if (valor2 != a && valor2 != c) {
			b = valor2;
		} else if (valor3 != a && valor3 != c) {
			b = valor3;
		}
		
		
		System.out.println("A ordem crescente é: " + a + " " + b + " " + c);
	
		
	}

}
