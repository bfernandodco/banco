package br.com.java.banco.dao.interfaces;

import java.util.List;

import br.com.java.banco.bean.ContaCorrente;

public interface IContaCorrente {
	
	public void cadastrar(ContaCorrente cc);
	
	public List<ContaCorrente> listar();
	
	public void atualizar(ContaCorrente cc);
	
	public void remover(long idConta);

}
