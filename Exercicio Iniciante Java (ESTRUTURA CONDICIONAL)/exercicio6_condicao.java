package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6_condicao {

	public static void main(String[] args) {
		
/* VOC� DEVE FAZER UM PROGRAMA QUE LEIA UM VALOR QUALQUER E APRESENTE UMA MENSAGEM DIZENDO EM QUAL
DOS SEGUINTES INTERVALOS ([0,25], (25,50], (50,75], (75,100]) ESTE VALOR SE ENCONTRA. OBVIAMENTE SE
O VALOR N�O ESTIVER EM NENHUM DESTES INTERVALOS, DEVER� SER IMPRESSA A MENSAGEM "FORA DE INTERVALOR".
*/	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o valor para sabermos se est� dentro do intervalo: ");
		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("O numero digitado est� fora do intervalo!");
		}
		else if (numero <= 25.0) {
			System.out.println("O numero digitado � no intervalo de [0,25]");
		}
		else if (numero <= 50.0) {
			System.out.println("O numero digitado est� no intervalo de [25,50");
		}
		else if (numero <= 75.0) {
			System.out.println("O numero digitado est� no intervalo de [50,75]");
		}
		else {
			System.out.println("O numero digitado est� no intervalo de [75,100]");
		}
		
		sc.close();
	}

}
