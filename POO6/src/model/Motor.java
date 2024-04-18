package model;

public class Motor {
	private int qtdPist;
	private int potencia;

	public Motor(int qtdPist, int potencia) {
		this.qtdPist = qtdPist;
		this.potencia = potencia;
	}

	public int getQtdPist() {
		return qtdPist;
	}

	public int getPotencia() {
		return potencia;
	}
}