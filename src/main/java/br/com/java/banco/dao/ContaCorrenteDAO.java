package br.com.java.banco.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import br.com.java.banco.bean.ContaCorrente;
import br.com.java.banco.jdbc.DatabaseManager;

public class ContaCorrenteDAO implements IContaCorrente {
	
	private static Connection connection = DatabaseManager.getConnection();
	private static PreparedStatement stmt;
	
	@Override
	public void cadastrarContaCorrente(ContaCorrente cc) {
		
		try {
			String query = "INSERT INTO ContaCorrente(agencia, numeroConta, tipoConta, saldo, "
					+ "dataAberturaConta, chequeEspecial) "
					+ "VALUES (?, ?, ?, ?, ?, ?)";
			LocalDate date = LocalDate.now();
			cc.setDataAberturaConta(date);
			stmt = connection.prepareStatement(query);
			stmt.setString(1, cc.getAgencia());
			stmt.setString(2, cc.getNumeroConta());
			stmt.setString(3, "Corrente");
			stmt.setDouble(4, cc.getSaldo());
			stmt.setDate(5, Date.valueOf(date));
			stmt.setDouble(6, cc.getChequeEspecial());
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} 
	}

}
