package estrutura_condicional;

import java.util.Scanner;

public class exercicio3_condicao {

	public static void main(String[] args) {
	
	/* LEIA 2 VALORES INTEIROS (A,B). AP�S, O PROGRAMA DEVE MOSTRAR UMA MENSAGEM "S�O MULTIPLOS" OU
	"N�O S�O MULTIPLOS", INDICANTO SE OS VALORES LIDOS S�O MULTIPLOS ENTRE SI. ATEN��O: OS NUMEROS 
	DEVEM PODER SEREM DIGITADOS EM ORDEM CRESCENTE OU DECRESCENTE.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int a = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("S�o multiplos");
		}
		else {
			System.out.println("N�o s�o multiplos");
		}
		
		sc.close();
	}
	
}
