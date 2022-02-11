package estrutura_condicional;

import java.util.Scanner;

public class exercicio10_switchcase {

	public static void main(String[] args) {

/* FAZER UM PROGRAMA PRA LER UM VALOR INTEIRO DE 1 A 7 REPRESENTANDO UM DIA DA SEMANA (SENDO)
 1 = DOMINGO, 2 = SEGUNDA E ASSIM POR DIANTE. ESCREVER NA TELA O DIA DA SEMANA CORRESPONDENTE,
 CONFORME EXEMPLOS.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha uma opção:");
		int opcao = sc.nextInt();
		
		String dia;
		
		switch (opcao) {
		case 1:
			dia = "DOMINGO";
			break;
		case 2:
			dia = "SEGUNDA";
			break;
		case 3:
			dia = "TERÇA";
			break;
		case 4:
			dia = "QUARTA";
			break;
		case 5:
			dia = "QUINTA";
			break;
		case 6:
			dia = "SEXTA";
			break;
		case 7:
			dia = "SABÁDO";
			break;
			
		default:
			dia = "Dia invalido";
			break;
		}	
		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();
	}

}
