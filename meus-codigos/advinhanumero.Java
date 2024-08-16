package controle;

import java.util.Scanner;

public class AdvinhaNumero {
	public static void main(String[] args) {
		
		int numeroCerto = 66;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número: ");
		
		int tentativas = 10;

		int i;

		for (i = 0; i < tentativas; i++) {
			int  numero = entrada.nextInt();
			
			// confere se o número digitado é maior.
			if (numero > numeroCerto) {
				System.out.println("O número digitado é maior que o número certo ");
			
			// confere se o número digitado é menor.
			} else if (numero < numeroCerto) {
				System.out.println("O número digitado é menor que o número certo ");
				
			// se o jogador acertou e quebra o laço.
			} else {
				System.out.println("PARABÉNS VOCÊ ACERTOU!!!");
				break;
			}
			
			// tentivas do jogador
			if (i < tentativas - 1) {
				System.out.println("Você tem " + (tentativas -1 -i) +(" tentativas restantes")) ;
			
			// se acabar as tentativas, mostra o número correto
			} else {
				System.out.println("Suas tentivas acabaram. "
						+ "\n o Número certo era: " + numeroCerto);
			}
		
		}
		entrada.close();
	}
}
