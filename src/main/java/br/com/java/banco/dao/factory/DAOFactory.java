package br.com.java.banco.dao.factory;

import br.com.java.banco.dao.ContaCorrenteDAO;
import br.com.java.banco.dao.ContaPoupancaDAO;
import br.com.java.banco.dao.interfaces.IContaCorrente;
import br.com.java.banco.dao.interfaces.IContaPoupanca;

public abstract class DAOFactory {

	public static IContaCorrente getContaCorrenteDAO() {
		return new ContaCorrenteDAO();
	}
	
	public static IContaPoupanca getContaPoupancaDAO() {
		return new ContaPoupancaDAO();
	}
	
}
