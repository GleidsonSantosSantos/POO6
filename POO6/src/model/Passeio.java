package model;

 public class Passeio extends Veiculo {
	private int qtdPassageiros;

	public Passeio(String placa, String marca, String modelo, String cor, float velocMax, Motor motor,
			int qtdPassageiros) {
		super(placa, marca, modelo, cor, velocMax, motor);
		this.qtdPassageiros = qtdPassageiros;
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public float calcularVelocidade(float velocMax) {

		return velocMax * 1000;
	}
}
