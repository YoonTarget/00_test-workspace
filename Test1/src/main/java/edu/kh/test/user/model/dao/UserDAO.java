package edu.kh.test.user.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import edu.kh.test.user.model.vo.UserDTO;

public class UserDAO {
	
	private Properties prop = new Properties();
	
	public UserDTO selectUser(int userNo) {
		
		UserDTO ud = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		
		String sql = "SELECT USER_NO, USER_ID, USER_NAME, USER_AGE\r\n"
				+ "  FROM TB_USER\r\n"
				+ " WHERE USER_NO = ?";
				
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TEST", "TEST");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, userNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				ud = new UserDTO(rset.getInt("user_no"), 
								rset.getString("user_id"), 
								rset.getString("user_name"), 
								rset.getInt("user_age"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return ud;
		
	}

}
