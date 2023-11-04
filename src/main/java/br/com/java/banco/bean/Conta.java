package br.com.java.banco.bean;

import java.sql.Date;

public class Conta {
	
	private Long idConta;
	private String agencia;
	private String numeroConta;
	private String eTipoConta;
	private double saldo;
	private Date dataAberturaConta;
	
	public Conta() {
		
	}

	public Conta(Long idConta, String agencia, String numeroConta, String eTipoConta, 
			double saldo, Date dataAberturaConta) {
		this.idConta = idConta;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.eTipoConta = eTipoConta;
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

	public String getTipoConta() {
		return eTipoConta;
	}

	public void setTipoConta(String eTipoConta) {
		this.eTipoConta = eTipoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Date getDataAberturaConta() {
		return dataAberturaConta;
	}

	public void setDataAberturaConta(Date dataAberturaConta) {
		this.dataAberturaConta = dataAberturaConta;
	}
	
}
