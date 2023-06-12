package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.beans.User;

public class UserDao {
private Connection conn;

public UserDao(Connection conn) {
	super();
	this.conn = conn;
}
public boolean register(User u) {
	boolean f = false;

	try {
		String sql = "insert into user(full_name,age,email,password) values(?,?,?,?) ";

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, u.getFull_name());
		ps.setInt(2,u.getAge());
		ps.setString(3, u.getEmail());
		ps.setString(4, u.getPassword());

		int i = ps.executeUpdate();

		if (i == 1) {
			f = true;
		}

	} catch (Exception e) {
		e.printStackTrace();
	}

	return f;
}

public User login(String eml, String pswd) {
	User u = null;

	try {
		String sql = "select * from user where email=? and password=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, eml);
		ps.setString(2, pswd);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			u = new User();
			u.setId(rs.getInt(1));
			u.setFull_name(rs.getString(2));
			u.setAge(rs.getInt(3));
			u.setEmail(rs.getString(4));
			u.setPassword(rs.getString(5));
		}

	} catch (Exception e) {
		e.printStackTrace();
	}

	return u;
}

}



