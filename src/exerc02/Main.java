// Fazer um programa para ler um número inteiro
// e dizer se este número é par ou ímpar.

package exerc02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Par!");
		}
		else {
			System.out.println("Impar!");
		}
		
		sc.close();
	}

}
