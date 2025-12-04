// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" 
// ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: 
// os números devem poder ser digitados em ordem crescente ou decrescente.

package exerc03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro numero inteiro: ");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo numero inteiro: ");
		num2 = sc.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("São Múltiplos!");
		}
		else {
			System.out.println("Não São Múltiplos");
		}
		
		sc.close();
	}

}
