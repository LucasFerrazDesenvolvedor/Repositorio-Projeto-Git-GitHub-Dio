package estrutura_condicional;

import java.util.Scanner;

public class exercicio_condicao {

	public static void main(String[] args) {
		
	// FAZER UM PROGRAMA PARA LER UM NUMERO INTEIRO, E DEPOIS DIZER SE ELE É NEGATIVO OU NÃO.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero para sabermos se ele é (Positivo) ou (Negativo): ");
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();

	}

}
