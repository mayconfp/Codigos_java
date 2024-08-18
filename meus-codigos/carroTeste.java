package exerciciosPessoais;

public class carroTeste {
	public static void main(String[] args) {
		
		carro car = new carro ("Fiat", "Uno", "Branco", 2010, 0);
		car.acelerar(280);
		car.exibirCarro();
		
		System.out.println("\nCarro acionando os freios\n");
		
		car.freio(150);
		car.exibirCarro();
		
		// exibindo o carro sem usar o método exibir carro
		
		carro meuCarro = new carro ("Fiat", "Marea", "Preto", 2006, 150);
		
		System.out.println("Marca: " + meuCarro.marca);
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Cor: " + meuCarro.cor);
		System.out.println("Ano de Fabricação: " + meuCarro.ano);
		System.out.println("Velocidade: " + meuCarro.velocidadeAtual + " Km/h");
		
		// freando o carro
		meuCarro.freio(120);
		
		// exibindo nova velocidade após acionar os freios.
		
		System.out.println("\nMarca: " + meuCarro.marca);
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Cor: " + meuCarro.cor);
		System.out.println("Ano de Fabricação: " + meuCarro.ano);
		System.out.println("Velocidade: " + meuCarro.velocidadeAtual + " Km/h");
		
	}
}
