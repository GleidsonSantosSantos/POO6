package model;

public class FuncionarioTemporario extends FuncionarioBase {

	private int diaFimContrato;
	private int mesFimContrato;
	private int anoFimContrato;

	public FuncionarioTemporario(int id, String nome, double salario, int diaFimContrato, int mesFimContrato,
			int anoFimContrato) {
		super(id, nome, salario);
		this.diaFimContrato = diaFimContrato;
		this.mesFimContrato = mesFimContrato;
		this.anoFimContrato = anoFimContrato;
	}

	public int getDiaFimContrato() {
		return diaFimContrato;
	}

	public int getMesFimContrato() {
		return mesFimContrato;
	}

	public int getAnoFimContrato() {
		return anoFimContrato;
	}
}
