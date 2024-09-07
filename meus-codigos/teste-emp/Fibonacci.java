package testeEmp;

import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita ao usuário que insira um número
	        System.out.print("Digite um número para ver se pertence a sequência de Fibonacci: ");
	        int number = scanner.nextInt();

	        // Verifica se o número pertence à sequência de Fibonacci
	        if (isFibonacci(number)) {
	            System.out.println(number + " pertence a sequência de Fibonacci.");
	        } else {
	            System.out.println(number + " não pertence a sequência de Fibonacci.");
	        }

	        // Fechando o scanner
	        scanner.close();
	    }

	    //  verificando se um número pertence à sequência de Fibonacci
	    public static boolean isFibonacci(int num) {
	        // Inicializa os primeiros dois números da sequência de Fibonacci
	        int a = 0, b = 1;

	        // Gerando números da sequência de Fibonacci até o número informado ou até passar
	        while (b < num) {
	            int temp = a + b;
	            a = b;
	            b = temp;
	        }

	        // Retorna se o número é igual ao último número da sequência gerado
	        return b == num;
	    }

	}


