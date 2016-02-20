package com.demo.dao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	private static DBUtil instance;
	
	private String driverClassName = "com.mysql.jdbc.Driver";
	
	private String url = "jdbc:mysql://localhost:3306/Spider001";
	
	private String user = "root";
	
	private String password = "123456";
	
	private DBUtil(){
		
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static DBUtil getInstance(){
		if(instance == null){
			instance = new DBUtil();
		}
		return instance ;
	}
	
	public Connection getConnection() throws SQLException{
		Connection conn = null;
		conn = DriverManager.getConnection(url,user,password);
		return conn;
	}
	
	public void free(Connection conn, PreparedStatement stmt, ResultSet rs){
		try {
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
			} catch (SQLException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
}

