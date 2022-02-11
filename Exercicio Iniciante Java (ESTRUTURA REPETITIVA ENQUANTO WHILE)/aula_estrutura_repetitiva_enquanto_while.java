package estruturas_repetitivas;

import java.util.Scanner;

public class aula_estrutura_repetitiva_enquanto_while {

	public static void main(String[] args) {

/* FAZER UM PROGRAMA QUE LER NUMEROS INTEIROS ATÉ QUE UM (ZERO) SEJA LIDO. AO FINAL MOSTRA A SOMA
DOS NUMEROS LIDOS.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		int numero = sc.nextInt();
		int soma = 0;
		
		while (numero != 0) {
			soma = soma + numero;
			System.out.println("digite outro valor: ");
			numero = sc.nextInt();
		}
		
		System.out.println("Finalizamos o programa a soma dos numero digitado é: " + soma);
		sc.close();
	}

}
