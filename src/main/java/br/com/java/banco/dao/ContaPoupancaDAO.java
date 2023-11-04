package br.com.java.banco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.java.banco.bean.ContaPoupanca;
import br.com.java.banco.bean.enumerated.ETipoConta;
import br.com.java.banco.dao.interfaces.IContaPoupanca;
import br.com.java.banco.jdbc.DatabaseManager;

public class ContaPoupancaDAO implements IContaPoupanca {
	
	private static PreparedStatement stmt;
	private static ResultSet rs;
	private static Connection connection;
	
	public void cadastrar(ContaPoupanca cp) {
		
		try {
			String query = "INSERT INTO conta(agencia, numero_conta, tipo_conta, saldo, data_abertura) "
					+ "VALUES(?, ?, ?, ?, ?";
			connection = DatabaseManager.getConnection();
			stmt = connection.prepareStatement(query);
			
			stmt.setString(1, cp.getAgencia());
			stmt.setString(2, cp.getNumeroConta());
			stmt.setString(3, ETipoConta.POUPANCA.getTipoConta());
			stmt.setDouble(4, cp.getSaldo());
			stmt.setDate(5, cp.getDataAberturaConta());
			
			stmt.executeUpdate();
		} catch(SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	public List<ContaPoupanca> listar() {
		List<ContaPoupanca> listaCp = new ArrayList<ContaPoupanca>();
		
		try {
			String query = "SELECT * FROM conta";
			connection = DatabaseManager.getConnection();
			stmt = connection.prepareStatement(query);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				ContaPoupanca cp = new ContaPoupanca();
				cp.setIdConta(rs.getLong("id_conta"));
				cp.setAgencia(rs.getString("agencia"));
				cp.setNumeroConta(rs.getString("numero_conta"));
				cp.setTipoConta(rs.getString("tipo_conta"));
				cp.setSaldo(rs.getDouble("saldo"));
				cp.setDataAberturaConta(rs.getDate("data_abertura"));
				listaCp.add(cp);
			}
		} catch(SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				stmt.close();
				rs.close();
				connection.close();
			} catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		return listaCp;
	}
	
	public void atualizar(ContaPoupanca cp) {
		
		try {
			String query = "UPDATE conta SET(agencia = ?, numero_conta = ?, saldo = ?) "
					+ "WHERE id_conta = ?";
			connection = DatabaseManager.getConnection();
			stmt = connection.prepareStatement(query);
			
			stmt.setString(1, cp.getAgencia());
			stmt.setString(2, cp.getNumeroConta());
			stmt.setDouble(3, cp.getSaldo());
			stmt.setLong(4, cp.getIdConta());
			
			stmt.executeUpdate();
		} catch(SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	public void remover(long idConta) {
		
		try {
			String query = "DELETE FROM conta WHERE id_conta = ?";
			connection = DatabaseManager.getConnection();
			stmt = connection.prepareStatement(query);
			
			stmt.setLong(1, idConta);
			
			stmt.executeUpdate();
		} catch(SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}
	}

}
