package br.com.java.banco;

import br.com.java.banco.bean.ContaCorrente;
import br.com.java.banco.dao.DAOFactory;
import br.com.java.banco.dao.IContaCorrente;

public class Testes {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.setAgencia("1234");
		cc.setNumeroConta("12345678");
		cc.setSaldo(0.0);
		cc.setChequeEspecial(0.0);
		
		IContaCorrente dao = DAOFactory.getContaCorrenteDAO();
		dao.cadastrarContaCorrente(cc);

	}

}
