package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8_condicao {

	public static void main(String[] args) {
/* EM UM PAIS IMAGINARIO DENOMINADO LISARB, TODOS OS HABITANTES FICAM FELIZES EM PAGAR SEUS IMPOSTOS, 
POIS SABEM QUE NELE NÃO EXISTEM POLITICOS CORRUPTOS E OS RECURSOS ARRECADADOS SÃO UTILIZADOS EM 
BENEFECIOS PARA A POPULAÇÃO, SEM QUALQUER DESVIO. A MOEDA DESTE PAIS É O "ROMBUS" CUJO SIMBOLO É R$.

LEIA UM NUMERO COM DUAS CASAS DECIMAIS, EQUIVALENTE AO SALARIO DE UMA PESSOA DE LISARB. EM SEGUIDA,
CALCULE E MOSTRE O VALOR QUE ESTA PESSOA DEVE PAGAR DE IMPOSTO DE RENDA, A TABELA ABAIXO.

LEMBRE QUE, SE O SALARIO FOR R$ 30002.00, A TAXA DE INDICE É DE 8% APENAS SOBRE 1000.00, POIS A FAIXA
DE SALARIO QUE FICA DE R$ 0.0 ATÉ R$ 2000.00 É ISENTA DE IMPOSTO DE RENDA. NO EXEMPLO FORNECIDO (ABAIXO
A TAXA É DE 8% SOBRE R$ 1000.00 + 18% SOBRE R$ 2.00, O QUE RESULTA EM R$ 80.36 NO TOTAL. O VALOR DEVE 
SER IMPRESSO COM DUAS CASAS DECIMAIS.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Me informe o seu salario por favor!: ");
		double salario = sc.nextDouble();
		
		double imposto;
		
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario < 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario < 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		if (imposto == 0.0) {
			System.out.println("Isento de imposto");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}

}
