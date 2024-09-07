package testeEmp;

public class percentual {
	public static void main(String[] args) {
		
		//os faturamentos dos estados
		double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        
        //agora vamos calcular o faturamento
        
        double total = sp + rj + mg + es + outros;
        
        // iremos calcular os percentuais dos estados
        double percentualSP = (sp / total) * 100;
        double percentualRJ = (rj / total) * 100;
        double percentualMG = (mg / total) * 100;
        double percentualES = (es / total) * 100;
        double percentualOutros = (outros / total) * 100;
        
        // vamos exibir os resultados dos calculos
        System.out.println("Percentual para representação por estados:");
        System.out.printf("SP: %.2f%%\n", percentualSP);
        System.out.printf("RJ: %.2f%%\n", percentualRJ);
        System.out.printf("MG: %.2f%%\n", percentualMG);
        System.out.printf("ES: %.2f%%\n", percentualES);
        System.out.printf("Outros: %.2f%%\n", percentualOutros);
		
	}
}
