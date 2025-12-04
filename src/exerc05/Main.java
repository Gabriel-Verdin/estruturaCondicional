// Com base na tabela abaixo, escreva um programa que leia o código de um item e a 
// quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

package exerc05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, qnt;
		double total = 0;
		
		System.out.println("[1]     Cachorro Quente     R$ 4,00");
		System.out.println("[2]     X Salada            R$ 4,50");
		System.out.println("[3]     X Beacon            R$ 5,00");
		System.out.println("[4]     Torrada Simples     R$ 2,00");
		System.out.println("[5]     Refrigerante        R$ 1,50");
		
		System.out.println("\nDigite o código do produto: ");
		cod = sc.nextInt();
		System.out.println("Digite a quantidade desejada: ");
		qnt = sc.nextInt();
		
		switch(cod) {
		case 1:
			total = qnt * 4.0;
			break;
		case 2:
			total = qnt * 4.5;
			break;
		case 3:
			total = qnt * 5.0;
			break;
		case 4:
			total = qnt * 2.0;
			break;
		case 5:
			total = qnt * 1.5;
			break;
		}
		
		System.out.printf("\nValor total a pagar: R$ %.2f", total);
		
		sc.close();
	}

}
