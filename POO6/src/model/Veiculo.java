package model;

abstract class Veiculo {

	protected String placa;
	protected String marca;
	protected String modelo;
	protected String cor;
	protected float velocMax;
	protected Motor motor;

	public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, Motor motor) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velocMax = velocMax;
		this.motor = motor;
	}


	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public abstract float calcularVelocidade(float velocMax);
}