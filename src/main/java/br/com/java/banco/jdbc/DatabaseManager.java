package br.com.java.banco.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DatabaseManager {
	
	private static final String URL = "jdbc:mysql://localhost:3306/banco";
	private static final String USER = "root";
	private static final String PASSWORD = "fiapalura";
	private static Connection connection;
	private static DatabaseManager instance;
	
	private DatabaseManager() {
		
	}
	
	public static DatabaseManager getInstance() {
		if (instance == null) {
			instance = new DatabaseManager();
		}
		return instance;
	}
	
	public static Connection getConnection() {
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("CONEXÃO ESTABELECIDA");
			return connection;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.out.println("CONEXÃO PERDIDA");
			return null;
		} 
		
	}

}
