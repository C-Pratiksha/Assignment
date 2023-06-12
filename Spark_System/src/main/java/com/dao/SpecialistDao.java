package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.beans.Specialist;
import com.beans.User;

import java.sql.Connection;

	public class SpecialistDao {
	
	private Connection conn;

	public SpecialistDao(Connection conn) {
		super();
		this.conn = conn;
	}
	public Specialist login(String eml, String pswd) {
		Specialist s = null;

		try {
			String sql = "select * from user where email=? and password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, eml);
			ps.setString(2, pswd);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				s = new Specialist();
				s.setSpe_id(rs.getInt(1));
				s.setFull_name(rs.getString(2));
				s.setProfession(rs.getString(3));
				s.setContact_no(rs.getString(4));
				s.setEmail(rs.getString(5));
				s.setPassword(rs.getString(6));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return s;
	}
	public boolean addSpecialist(String spec) {
		boolean f = false;
		try {
			String sql = "insert into specialist(spec_name) values(?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, spec);

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public List<Specialist> getAllSpecialist() {
		List<Specialist> list = new ArrayList<Specialist>();
		Specialist s = null;

		try {
			String sql = "select * from specialist";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				s = new Specialist();
				s.setSpe_id(rs.getInt(1));
				s.setFull_name(rs.getString(2));
				list.add(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	public boolean deleteSpecialist(int spe_id) {
		boolean f = false;
		try {
			String sql = "delete from doctor where spe_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, spe_id);

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}
	public boolean updateSpecialist(Specialist s) {
		// TODO Auto-generated method stub
		return false;
	}

}