package estrutura_condicional;

import java.util.Scanner;

public class exercicio2_condicao {

	public static void main(String[] args) {
		
	// FAZER UM PROGRAMA PARA LER UM NUMERO INTEIRO E DIZER SE ELE É (PAR) OU (IMPAR)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero para sabermos se ele é (PAR) ou (IMPAR): ");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O NUMERO É (PAR)");
		}
		else {
			System.out.println("NUMERO DIGITADO É (IMPAR)");
		}
		
		sc.close();
		
		
	}

}
