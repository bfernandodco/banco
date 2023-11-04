package br.com.java.banco.dao.interfaces;

import java.util.List;

import br.com.java.banco.bean.ContaPoupanca;

public interface IContaPoupanca {

	public void cadastrar(ContaPoupanca cp);
	
	public List<ContaPoupanca> listar();
	
	public void atualizar(ContaPoupanca cp);
	
	public void remover(long idConta);
	
}
