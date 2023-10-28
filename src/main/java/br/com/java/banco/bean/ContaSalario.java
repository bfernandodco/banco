package br.com.java.banco.bean;

public class ContaSalario extends Conta{

	private Long idContaSalario;
	private double salario;
	
	public ContaSalario() {
		super();
	}

	public ContaSalario(Long idContaSalario, double salario) {
		super();
		this.idContaSalario = idContaSalario;
		this.salario = salario;
	}

	public Long getIdContaSalario() {
		return idContaSalario;
	}

	public void setIdContaSalario(Long idContaSalario) {
		this.idContaSalario = idContaSalario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
