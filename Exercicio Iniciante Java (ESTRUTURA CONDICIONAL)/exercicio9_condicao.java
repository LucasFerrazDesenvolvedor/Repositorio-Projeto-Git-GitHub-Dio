package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio9_condicao {

	public static void main(String[] args) {

/* UMA OPERADORA DE TELEFONIA COBRA R$ 50.00 POR UM PLANO BASICO QUE DA DIREITO A 100 MINUTOS  DE 
TELEFONE. CADA MINUTO QUE EXCEDER A FRANQUIA DE R$ 100 MINUTOS CUSTA R$ 2.00. 

FAZER UM PROGRAMA PARA LER A QUANTIDADE DE MINUTOS QUE UMA PESSOA CONSUMIU, DAI MOSTRA O VALOR A SER
PAGO. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe para nós quantos minutos você usou de sua franquia: ");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if (minutos > 100) {
			conta = conta + (minutos - 100)* 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();
	}

}
