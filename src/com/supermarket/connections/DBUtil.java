package com.supermarket.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	final static String forNameURL="com.mysql.cj.jdbc.Driver";
	final static String dBURL="jdbc:mysql://localhost:3306/supermarket1";
	final static String username="root";
	final static String password="7386504740";
	public static Connection DBConnection() throws ClassNotFoundException, SQLException {
		Class.forName(forNameURL);
		Connection con=DriverManager.getConnection(dBURL,username,password);
		return con;
	}

}