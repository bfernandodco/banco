package br.com.java.banco.dao;

public abstract class DAOFactory {

	public static IContaCorrente getContaCorrenteDAO() {
		return new ContaCorrenteDAO();
	}
	
}
