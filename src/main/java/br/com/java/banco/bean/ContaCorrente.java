package br.com.java.banco.bean;

public class ContaCorrente extends Conta {

	private Long idContaCorrente;
	private double chequeEspecial;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Long idContaCorrente, double chequeEspecial) {
		super();
		this.idContaCorrente = idContaCorrente;
		this.chequeEspecial = chequeEspecial;
	}

	public Long getIdContaCorrente() {
		return idContaCorrente;
	}

	public void setIdContaCorrente(Long idContaCorrente) {
		this.idContaCorrente = idContaCorrente;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
}
