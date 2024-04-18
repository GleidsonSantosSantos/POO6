package view;

import controller.ContratacaoControle;
import model.FuncionarioTempoIntegral;
import model.FuncionarioTempoParcial;
import model.FuncionarioTemporario;

public class Teste_Func {

	public static void main(String[] args) {
		ContratacaoControle controle = new ContratacaoControle();

        
        FuncionarioTempoIntegral funcionarioTempoIntegral = controle.contratarFuncionarioTempoIntegral(1, "Gleidson", 3500, 40);
        FuncionarioTempoParcial funcionarioTempoParcial = controle.contratarFuncionarioTempoParcial(2, "Marcos Antonio", 4500, 9, 13);
        FuncionarioTemporario funcionarioTemporario = controle.contratarFuncionarioTemporario(3, "Victor Pedrosa", 3000, 31, 12, 2024);

     
        System.out.println("Funcionário de Tempo Integral:");
        System.out.println("ID: " + funcionarioTempoIntegral.getId());
        System.out.println("Nome: " + funcionarioTempoIntegral.getNome());
        System.out.println("Salário: " + funcionarioTempoIntegral.getSalario());
        System.out.println("Banco de Horas: " + funcionarioTempoIntegral.getBancoHoras());
        System.out.println();

        System.out.println("Funcionário de Tempo Parcial:");
        System.out.println("ID: " + funcionarioTempoParcial.getId());
        System.out.println("Nome: " + funcionarioTempoParcial.getNome());
        System.out.println("Salário: " + funcionarioTempoParcial.getSalario());
        System.out.println("Hora de Entrada: " + funcionarioTempoParcial.getHoraEntrada());
        System.out.println("Hora de Saída: " + funcionarioTempoParcial.getHoraSaida());
        System.out.println();

        System.out.println("Funcionário Temporário:");
        System.out.println("ID: " + funcionarioTemporario.getId());
        System.out.println("Nome: " + funcionarioTemporario.getNome());
        System.out.println("Salário: " + funcionarioTemporario.getSalario());
        System.out.println("Fim do Contrato: " + funcionarioTemporario.getDiaFimContrato() + "/" + funcionarioTemporario.getMesFimContrato() + "/" + funcionarioTemporario.getAnoFimContrato());
    }
}