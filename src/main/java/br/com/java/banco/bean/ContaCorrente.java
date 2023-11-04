package br.com.java.banco.bean;

public class ContaCorrente extends Conta {

	private double chequeEspecial;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Long idContaCorrente, double chequeEspecial) {
		super();
		this.chequeEspecial = chequeEspecial;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
}
