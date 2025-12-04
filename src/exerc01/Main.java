// Fazer um programa para ler um número inteiro, 
// e depois dizer se este número é negativo ou não.

package exerc01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("Positivo!");
		}
		else {
			System.out.println("Negativo!");
		}
		
		sc.close();
	}

}
