package com.mybatis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/wei";
	private static final String USERNAME = "root";
	private static final String USERPASSWORD = "123456";
	private static Connection connection = null;
	
	static{
		//加载数据库驱动
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("连接数据库异常");
		}
	}
	public static Connection getConnection(){
		
		try {
			connection = DriverManager.getConnection(URL, USERNAME, USERPASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
