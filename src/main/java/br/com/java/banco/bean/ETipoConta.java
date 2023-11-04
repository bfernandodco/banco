package br.com.java.banco.bean;

public enum ETipoConta {

	CORRENTE("Corrente"),
	POUPANCA("Poupança"),
	SALARIO("Salário");
	private String tipoConta;
	
	ETipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public String getTipoConta() {
		return this.tipoConta;
	}
	
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
}
