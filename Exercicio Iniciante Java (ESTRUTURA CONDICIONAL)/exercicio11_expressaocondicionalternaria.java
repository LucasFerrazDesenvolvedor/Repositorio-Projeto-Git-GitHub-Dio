package estrutura_condicional;

import java.util.Locale;

public class exercicio11_expressaocondicionalternaria {

	public static void main(String[] args) {
	
/* NESSE EXERCICIO VAMOS UTILIZAR A EXPRESSÃO CONDICIONAL TERNARIA NO INTUITO DE SEMPLIFICAR AINDA
 MAIS O NOSSO CODIGO DE PROGRAMAÇÃO.*/
		
		Locale.setDefault(Locale.US);
		
	// ESSE É O MODELO NORMAL DE CONDIÇÃO USANDO O A ESTRUTURA (IF, ELSE IF, ELSE).
		double preco = 34.5;
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.5;
		}
		
		System.out.println(desconto);
		
	// E NESSE MODELO NÓS ESTAMOS UTILIZANDO A EXPRESSÃO CONDICIONAL TERNARIA PARA SIMPLIFICAR O CODIGO
		
		double preco2 = 34.5;
		double desconto2 = (preco2 < 20.0)? preco2 * 0.1 : preco2 * 0.5;
		
		System.out.println(desconto2);
		
		
	}

}
