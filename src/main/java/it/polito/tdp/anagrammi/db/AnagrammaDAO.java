package it.polito.tdp.anagrammi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnagrammaDAO {
	
	public boolean isCorrect(String anagramma) {
		
		String sql = "SELECT nome FROM parola WHERE nome = ?";
		boolean flag = false; 
		try {
			Connection conn = ConnectDB.getConnection(); 
			PreparedStatement st = conn.prepareStatement(sql); 
			st.setString(1, anagramma);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				flag = true; 
			}
			st.close();
			rs.close();
			conn.close();
			
			if(flag) {
				return true; 
			}else {
				return false; 
			}
			
			
		}catch (SQLException e) {
			System.out.println("Error in AnagrammaDAO");
			e.printStackTrace();
			return false; 
		}
		 
	}

}
