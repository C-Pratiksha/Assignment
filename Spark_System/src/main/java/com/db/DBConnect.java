package com.db;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static Connection conn;

	public static Connection getConn() { //we make this method static because it will make easy to call method from anywhere
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//driver name
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sparkapp", "root", "Pratiksha");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

}

