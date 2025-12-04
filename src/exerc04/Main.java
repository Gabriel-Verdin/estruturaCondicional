// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
// sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração 
// mínima de 1 hora e máxima de 24 horas.

package exerc04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaInicio, horaFinal, duracao;
	
		System.out.println("Digite a hora inicial do Jogo; ");
		horaInicio = sc.nextInt();
		System.out.println("Digite a hora final do Jogo: ");
		horaFinal = sc.nextInt();
		
		if(horaInicio < horaFinal) {
			duracao = horaFinal - horaInicio;
		}
		else {
			duracao = 24 - horaInicio + horaFinal;
		}
		
		System.out.printf("\nO jogo durou %d horas", duracao);
		
		sc.close();
	}

}
