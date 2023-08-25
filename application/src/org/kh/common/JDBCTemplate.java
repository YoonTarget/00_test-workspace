package org.kh.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {
	
	public static Connection getConnection() {
		
		Connection conn = null;
		
		Properties prop = new Properties();
		
		try {
			
			prop.load(new FileInputStream(JDBCTemplate.class.getResource("/db/driver/driver.properties").getPath()));
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "PAL", "PAL");
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	public static void commit(Connection conn) {
		
		try {
			
			if(conn != null && !conn.isClosed()) {
				conn.commit();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void rollback(Connection conn) {
		
		try {
			
			if(conn != null && !conn.isClosed()) {
				conn.rollback();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close(Connection conn) {
		
		try {
			
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close(Statement stmt) {
		
		try {
			
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close(ResultSet rset) {
		
		try {
			
			if(rset != null && !rset.isClosed()) {
				rset.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
