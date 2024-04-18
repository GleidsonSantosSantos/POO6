package controller;

import model.FuncionarioTempoIntegral;
import model.FuncionarioTempoParcial;
import model.FuncionarioTemporario;

public class ContratacaoControle {
	
	  public FuncionarioTempoIntegral contratarFuncionarioTempoIntegral(int id, String nome, double salario, int bancoHoras) {
	        return new FuncionarioTempoIntegral(id, nome, salario, bancoHoras);
	    }

	    public FuncionarioTempoParcial contratarFuncionarioTempoParcial(int id, String nome, double salario, int horaEntrada, int horaSaida) {
	        return new FuncionarioTempoParcial(id, nome, salario, horaEntrada, horaSaida);
	    }

	    public FuncionarioTemporario contratarFuncionarioTemporario(int id, String nome, double salario, int diaFimContrato, int mesFimContrato, int anoFimContrato) {
	        return new FuncionarioTemporario(id, nome, salario, diaFimContrato, mesFimContrato, anoFimContrato);
	    }
	}


