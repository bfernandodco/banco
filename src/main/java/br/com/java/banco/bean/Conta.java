package br.com.java.banco.bean;

import java.time.LocalDate;

public class Conta {
	
	private Long idConta;
	private String agencia;
	private String numeroConta;
	private TipoConta tipoConta;
	private double saldo;
	private LocalDate dataAberturaConta = LocalDate.now();
	
	public Conta() {
		
	}

	public Conta(Long idConta, String agencia, String numeroConta, TipoConta tipoConta, 
			double saldo, LocalDate dataAberturaConta) {
		this.idConta = idConta;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.saldo = saldo;
		this.dataAberturaConta = dataAberturaConta;;
	}

	public Long getIdConta() {
		return idConta;
	}

	public void setIdConta(Long idConta) {
		this.idConta = idConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public LocalDate getDataAberturaConta() {
		return dataAberturaConta;
	}

	public void setDataAberturaConta(LocalDate dataAberturaConta) {
		this.dataAberturaConta = dataAberturaConta;
	}
	
}
