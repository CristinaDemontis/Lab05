package it.polito.tdp.anagrammi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
public static Connection getConnection() {
		
		String url = "jdbc:mariadb://localhost/dizionario?user=root&password=root"; 
		
		try {
			return DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println("Errore in connessione."); 
			e.printStackTrace();
			return null; 
		} 
		
	}
}
		


