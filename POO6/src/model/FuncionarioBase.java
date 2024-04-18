package model;

public class FuncionarioBase implements Funcionario {

	protected int id;
	protected String nome;
	protected double salario;

	public FuncionarioBase(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	
	public String getNome() {
		return nome;
	}


	public double getSalario() {
		return salario;
	}
}