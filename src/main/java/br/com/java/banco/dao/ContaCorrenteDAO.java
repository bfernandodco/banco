package br.com.java.banco.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.java.banco.bean.ContaCorrente;
import br.com.java.banco.bean.ETipoConta;
import br.com.java.banco.jdbc.DatabaseManager;

public class ContaCorrenteDAO implements IContaCorrente {
	private static PreparedStatement stmt;
	private static ResultSet rs;
	private static Connection connection;
	
	@Override
	public void cadastrar(ContaCorrente cc) {
		try {
			String query = "INSERT INTO ContaCorrente(agencia, numero_conta, tipo_conta, saldo, "
					+ "data_abertura, cheque_especial) "
					+ "VALUES (?, ?, ?, ?, ?, ?)";
			connection = DatabaseManager.getConnection();
			stmt = connection.prepareStatement(query);
			
			stmt.setString(1, cc.getAgencia());
			stmt.setString(2, cc.getNumeroConta());
			stmt.setString(3, ETipoConta.CORRENTE.getTipoConta());
			stmt.setDouble(4, cc.getSaldo());
			stmt.setDate(5, Date.valueOf(LocalDate.now()));
			stmt.setDouble(6, cc.getChequeEspecial());
		
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	@Override
	public List<ContaCorrente> listar() {
		List<ContaCorrente> listaCc = new ArrayList<ContaCorrente>();
		
		try {
			String query = "SELECT * FROM ContaCorrente";
			connection = DatabaseManager.getConnection();
			stmt = connection.prepareStatement(query);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				ContaCorrente cc = new ContaCorrente();
				cc.setIdConta(rs.getLong("id_conta"));
				cc.setAgencia(rs.getString("agencia"));
				cc.setNumeroConta(rs.getString("numero_conta"));
				cc.setTipoConta(rs.getString("tipo_conta"));
				cc.setSaldo(rs.getDouble("saldo"));
				cc.setDataAberturaConta(rs.getDate("data_abertura"));
				cc.setChequeEspecial(rs.getDouble("cheque_especial"));
				listaCc.add(cc);
			}
			for (ContaCorrente items: listaCc) {
				System.out.println(items.getNumeroConta());
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
		return listaCc;
	}
	
	@Override
	public void atualizar(ContaCorrente cc) {
		
		try {
			String query = "UPDATE conta SET(agencia = ?, numero_conta = ?, saldo = ?, cheque_especial = ? "
					+ "WHERE id_conta = ?";
			connection = DatabaseManager.getConnection();
			stmt = connection.prepareStatement(query);
			
			stmt.setString(1, cc.getAgencia());
			stmt.setString(2, cc.getNumeroConta());
			stmt.setDouble(3, cc.getSaldo());
			stmt.setDouble(4, cc.getChequeEspecial());
			stmt.setLong(5, cc.getIdConta());
			
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
	
	@Override
	public void remover(long idConta) {
		
		try {
			String query = "DELETE FROM conta WHERE id_conta = ?";
			connection = DatabaseManager.getConnection();
			stmt = connection.prepareStatement(query);
			
			stmt.setLong(1, idConta);
		}catch(SQLException e) {
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
