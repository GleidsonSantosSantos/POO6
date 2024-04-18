package model;

public class FuncionarioTempoParcial extends FuncionarioBase {
	private int horaSaida;
	 private int horaEntrada;

	public FuncionarioTempoParcial(int id, String nome, double salario, int horaEntrada, int horaSaida) {
		super(id, nome, salario);
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
	}

	public int getHoraEntrada() {
		return horaEntrada;
	}

	public int getHoraSaida() {
		return horaSaida;
	}

}
