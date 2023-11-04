package br.com.java.banco.bean;

public class ContaPoupanca extends Conta{

	private double rendimentoMensal;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(double rendimentoMensal) {
		super();
		this.rendimentoMensal = rendimentoMensal;
	}

	public double getRendimentoMensal() {
		return rendimentoMensal;
	}

	public void setRendimentoMensal(double rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}
	
}
