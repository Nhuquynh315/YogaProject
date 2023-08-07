package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.util.DBUtil;
import model.User;

public class RegisterDao {
	public boolean insertUser(User user) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBUtil.makeConnection();
			ps = conn.prepareStatement(
					"INSERT INTO `YogaWeb`.User (`fullname`, `username`, `password`, `email`) VALUES (?,?,?,?)");
			ps.setString(1, user.getFullname());
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getEmail());
			ps.execute();

		} catch (Exception e) {
			e.printStackTrace();
			return false;

		} finally {
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return true;
	}
}
