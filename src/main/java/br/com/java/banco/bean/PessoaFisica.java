package br.com.java.banco.bean;

public class PessoaFisica extends Pessoa{
	
	private Long idPessoaFisica;
	private Long cpf;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(Long idPessoaFisica, Long cpf) {
		super();
		this.idPessoaFisica = idPessoaFisica;
		this.cpf = cpf;
	}

	public Long getIdPessoaFisica() {
		return idPessoaFisica;
	}

	public void setIdPessoaFisica(Long idPessoaFisica) {
		this.idPessoaFisica = idPessoaFisica;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	

}
