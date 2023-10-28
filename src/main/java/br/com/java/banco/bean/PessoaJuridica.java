package br.com.java.banco.bean;

public class PessoaJuridica extends Pessoa{
	
	private Long idPessoaJuridica;
	private String razaoSocial;
	private String inscricao;
	private String ordem;
	private int verificador;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(Long idPessoaJuridica, String razaoSocial, String inscricao, String ordem, int verificador) {
		super();
		this.idPessoaJuridica = idPessoaJuridica;
		this.razaoSocial = razaoSocial;
		this.inscricao = inscricao;
		this.ordem = ordem;
		this.verificador = verificador;
	}

	public Long getIdPessoaJuridica() {
		return idPessoaJuridica;
	}

	public void setIdPessoaJuridica(Long idPessoaJuridica) {
		this.idPessoaJuridica = idPessoaJuridica;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getInscricao() {
		return inscricao;
	}

	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}

	public int getVerificador() {
		return verificador;
	}

	public void setVerificador(int verificador) {
		this.verificador = verificador;
	}
	
}
