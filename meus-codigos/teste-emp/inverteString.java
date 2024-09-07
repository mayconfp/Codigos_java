package testeEmp;

public class inverteString {
	public static void main(String[] args) {

		// Define a string para ser invertida
		String input = "exemplo";

		// Inverte a string
		String reversed = inverterString(input);

		// Exibe a string invertida
		System.out.println("String invertida: " + reversed);
	}

	// Método para inverter a string
	public static String inverterString(String str) {
		String resultado = "";
		// Percorre a string de trás para frente
		for (int i = str.length() - 1; i >= 0; i--) {
			resultado += str.charAt(i);
		}
		return resultado;
	}
}
