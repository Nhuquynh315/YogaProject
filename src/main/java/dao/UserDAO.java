package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import db.util.DBUtil;
import model.User;

public class UserDAO {
	
	public User getUserByUsernameAndPassword(String username, String password) throws SQLException {
		User user = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.makeConnection();
			
			ps = conn.prepareStatement("SELECT * FROM `YogaWeb`.User WHERE `username` = ? AND `password` = ?");
			ps.setString(1, username);
			ps.setString(2, password);
			System.out.println("Username: " + username);
			System.out.println("Password: " + password);
			rs = ps.executeQuery();
			while (rs.next()) {
			    System.out.println("Fullname: " + rs.getString("fullname"));
			    System.out.println("Email: " + rs.getString("email"));
			    // ... Print other relevant data
			}

			
			if (rs.next()) {
				int id = rs.getInt("id");
                String fullname = rs.getString("fullname");
                String email = rs.getString("email");
                Date startDate = rs.getDate("startDate");
                Date endDate = rs.getDate("endDate");
				
				user = new User(id, fullname, email, startDate, endDate);
			}
			} catch (Exception e) {
				e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return user;
	}}
