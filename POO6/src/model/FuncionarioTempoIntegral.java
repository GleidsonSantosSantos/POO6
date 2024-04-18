package model;

public class FuncionarioTempoIntegral extends FuncionarioBase {
	 private int bancoHoras;

	    public FuncionarioTempoIntegral(int id, String nome, double salario, int bancoHoras) {
	        super(id, nome, salario);
	        this.bancoHoras = bancoHoras;
	    }

	    public int getBancoHoras() {
	        return bancoHoras;
	    }
	
}
