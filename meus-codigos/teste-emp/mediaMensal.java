package testeEmp;

public class mediaMensal {
	public static void main(String[] args) {
		 
		//vetor de faturamento
	double[] faturamento = {1000.0, 2000.0, 0.0, 500.0, 3000.0, 700.0, 0.0, 1500.0, 1200.0, 0.0, 
		                                900.0, 1300.0, 0.0, 2500.0, 1800.0, 0.0, 2300.0, 0.0, 2100.0, 3000.0, 
		                                1700.0, 1900.0, 0.0, 1400.0, 2700.0, 3200.0, 0.0, 2600.0, 2800.0, 1000.0};
		        
	double menorFaturamento = Double.MAX_VALUE;
	double maiorFaturamento = Double.MIN_VALUE;
	double somaFaturamento = 0.0;
	int diasAcimaMedia = 0, diasComFaturamento = 0;

	// Calculando o menor, maior, e soma
	for (double valor : faturamento) {
		if (valor > 0) {
			if (valor < menorFaturamento) menorFaturamento = valor;
				if (valor > maiorFaturamento) maiorFaturamento = valor;
		                somaFaturamento += valor;
		                diasComFaturamento++;
		          }
		     }

		        // Calculando a média mensal
	 double mediaMensal = somaFaturamento / diasComFaturamento;

		        // Contando dias com faturamento acima da média
	for (double valor : faturamento) {
		if (valor > mediaMensal) diasAcimaMedia++;
}

	// mostrando o resultado:
		System.out.println("Menor faturamento: " + menorFaturamento);
		System.out.println("Maior faturamento: " + maiorFaturamento);
		System.out.println("Dias com faturamento acima da média: " + diasAcimaMedia);
	}
}
