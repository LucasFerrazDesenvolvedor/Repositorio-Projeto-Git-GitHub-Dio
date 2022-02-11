package estrutura_condicional;

import java.util.Scanner;

public class exercicio4_condicao {

	public static void main(String[] args) {
		
	/* LEIA A HORA INICIAL E A HORA FINAL DE UM JOGO. A SEGUIR CALCULE A DURAÇÃO DO JOGO, SABENDO
QUE O MESMO PODE COMEÇAR EM UM DIA E TERMINAR NO OUTRO, TENDO DURAÇÃO MINIMA DE 1 HORA E MAXIMA DE
 24 HORAS. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a hora inicial da partida: ");
		int horaInicial = sc.nextInt();
		System.out.println("Informe a hora final da partida: ");
		int horaFinal = sc.hashCode();
		
		int duracao;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORAS(S)");
				
		sc.close();
	}

}
