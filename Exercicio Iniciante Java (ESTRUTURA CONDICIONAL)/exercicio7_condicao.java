package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7_condicao {

	public static void main(String[] args) {
		
/* LEIA 2 VALORES COM UMA CASA DECIMAL (X,Y), QUE DEVEM REPRESENTAR AS COORDENADAS DE UM PONTO EM UM
PLANO. A SEGUIR, DETERMINE QUAL O QUADRANTE AO QUAL PERTENCE O PONTO, OU SE JÁ ESTÁ SOBRE UM DOS EIXOS
CARTESIANOS OU NA ORIGEM (X=Y=0).

SE O PONTO ESTIVER NA ORIGEM ESCREVA "ORIGEM"
SE O PONTO ESTIVER SOBRE UM DOS EIXOS ESCREVA "EIXO X" OU "EIXO Y", CONFORME FOR A SITUAÇÃO.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		double x = sc.nextDouble();
		System.out.println("Entre com o segundo valor: ");
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Está na Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
	}

}
