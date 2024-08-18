package exerciciosPessoais;

public class carro {
	String marca;
	String modelo;
	String cor;
	int ano;
	int velocidadeAtual;
	
	public carro (String marca, String modelo, String cor, int ano, int velocidadeAtual) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.velocidadeAtual = velocidadeAtual;
	}
	// aceleração do carro 
	public void acelerar (int aumentoVelocidade) {
		this.velocidadeAtual += aumentoVelocidade;
	}
	
	// freando o carro 
	public void freio (int freando) {
		if (velocidadeAtual - freando <0) {
			velocidadeAtual = 0;
		} else {
			velocidadeAtual -= freando;
		}
	}
	// exibir o carro completo
	public void exibirCarro () {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo do carro: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Velocidade: " + velocidadeAtual + "km/h");
	}
}
