package exerciciosPessoais;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String continuar = "s";
		
		while (continuar.equalsIgnoreCase("s")) {
			
			// Vai pedir para o usúario digitar os números que ele deseja
			System.out.println("Digite o primeiro número: ");
			int num1 = entrada.nextInt();
			
			System.out.println("Digite o segundo número: ");
			int num2 = entrada.nextInt();
			
			// Escolha de operadores
			System.out.println("Escolha uma operação: (+, -, *, /)");
			char operacao = entrada.next().charAt(0);
			
			// Calculando de acordo com o operador escolhido
			switch (operacao) {
			
			case '+':
				System.out.println("Resultado " + num1 + " + " + num2 + " = " + 
			(num1 + num2));
				break;
			
			case '-':
				System.out.println("Resultado " + num1 + " - " + num2 + " = " + 
						(num1 - num2));
				break;
				
			case '*' :
				System.out.println("Resultado " + num1 + " * " + num2 + " = " + 
						(num1 * num2));
				break;
				
			case '/':
				if (num2 != 0) {
					System.out.println("Resultado " + num1 + "/" + num2 + " = " +
				(num1 / num2));
				
				} else {
					System.out.println("Não divide por o zero!");
				}
					break;
				default:
					System.out.println("Operação não é válida");
				
				}
			// Perguntando se o usuário quer continuar usando a calculadora
			System.out.println("Deseja continuar (s/n): ");
				continuar = entrada.next();
			
			}
		System.out.println("Programada Fechado!");
		
		System.out.println("Obrigado por usar a calculadora. :) ");
		entrada.close();	
		}
		
	}
