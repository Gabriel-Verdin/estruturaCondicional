// ========================= NÃO TERMINADO ========================= 

package exerc06;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num;
		
		System.out.println("Digite um número qualquer: ");
		num = sc.nextDouble();
		
		if(num >= 0 && num <= 25) {
			System.out.println("O intervalo é: [0, 25]");
		}
		
		sc.close();
	}

}
