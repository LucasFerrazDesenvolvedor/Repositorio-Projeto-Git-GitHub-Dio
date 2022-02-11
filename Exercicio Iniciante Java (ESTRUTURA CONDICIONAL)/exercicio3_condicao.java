package estrutura_condicional;

import java.util.Scanner;

public class exercicio3_condicao {

	public static void main(String[] args) {
	
	/* LEIA 2 VALORES INTEIROS (A,B). APÓS, O PROGRAMA DEVE MOSTRAR UMA MENSAGEM "SÃO MULTIPLOS" OU
	"NÃO SÃO MULTIPLOS", INDICANTO SE OS VALORES LIDOS SÃO MULTIPLOS ENTRE SI. ATENÇÃO: OS NUMEROS 
	DEVEM PODER SEREM DIGITADOS EM ORDEM CRESCENTE OU DECRESCENTE.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int a = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();
	}
	
}
