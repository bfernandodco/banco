package br.com.java.banco.bean;

public class ContaPoupanca extends Conta{

	private Long idContaPoupanca;
	private double rendimentoMensal;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Long idContaPoupanca, double rendimentoMensal) {
		super();
		this.idContaPoupanca = idContaPoupanca;
		this.rendimentoMensal = rendimentoMensal;
	}

	public Long getIdContaPoupanca() {
		return idContaPoupanca;
	}

	public void setIdContaPoupanca(Long idContaPoupanca) {
		this.idContaPoupanca = idContaPoupanca;
	}

	public double getRendimentoMensal() {
		return rendimentoMensal;
	}

	public void setRendimentoMensal(double rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}
	
}
