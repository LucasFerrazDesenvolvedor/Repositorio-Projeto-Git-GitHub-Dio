package estruturas_repetitivas;

import java.util.Scanner;

public class Estrutura_repetitiva_programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, contador, limite, resultado;
		
		
		contador = 0;
		limite = 10;
		
		System.out.println("Digite o numero que você deseja ver a tabuada de 1 a 10: ");
		numero = sc.nextInt();
		
		do {
			resultado = numero * contador; 
			System.out.println(numero + " x " + contador + " = " + resultado);
			contador = contador +1;
		} while (contador <= limite);
		
		sc.close();
	}

}
