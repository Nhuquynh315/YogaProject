package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.util.DBUtil;
import model.User;

public class UserDAO {
	
	public User getUserByEmailAndPassword(String username, String password) throws SQLException {
		User user = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.makeConnection();
			
			ps = conn.prepareStatement("SELECT * FROM `User` WHERE username = ? AND password = ?");
			ps.setString(1, password);
			ps.setString(2, username);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				String fullname = rs.getString("fullname");
				String email = rs.getString("email");
				int id = rs.getInt("id");
				
				user = new User (id, fullname, username, password, email);
			}else {
				return null;
				
			}return user;
			
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}}
