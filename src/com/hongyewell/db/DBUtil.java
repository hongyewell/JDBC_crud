package com.hongyewell.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
* @className:DBUtil.java
* @classDescription:
* @author:yeye
* @createTime:2015年8月8日 上午9:53:26
*/
public class DBUtil {
	
	private static final String URL="jdbc:mysql://127.0.0.1:3306/shopping";
	private static final String USER="root";
	private static final String PASSWORD="1234";
	
	private static Connection conn=null;
	
	static{
		try {
			//1.加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//2.获得数据库的连接
			conn=DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		return conn;
		
	}

}
