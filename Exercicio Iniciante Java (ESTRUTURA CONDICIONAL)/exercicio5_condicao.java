package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5_condicao {

	public static void main(String[] args) {
		
/* COM BASE NA TABELA ABAIXO, ESCREVA UM PROGRAMA QUE LEIA O CODIGO DE UM ITEM E A QUANTIDADE DESTE
ITEM. A SEGUIR CALCULE E MOSTRE O VALOR DA CONTA A PAGAR.
1 - CACHORRO QUENTE -> VALOR 4.00 REIAS
2 - X-SALADA -> VALOR 4.50 REAIS
3 - X-BACON -> VALOR 5.00 REAIS
4 - TORRADA SIMPLES -> VALOR 2.00 REIAS
5 - REFRIGERANTE -> VALOR 1.50*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe qual o código do produto: ");
		int codigo = sc.nextInt();
		
		System.out.println("Informe a quantidade de produto que voçê deseja: ");
		double quantidade = sc.nextDouble();
		
		double total;
		
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2 ) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3 ) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4 ) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total, " Reais" );
		
		sc.close();

	}

}
