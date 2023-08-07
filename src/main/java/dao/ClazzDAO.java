package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.util.DBUtil;
import model.Clazz;

public class ClazzDAO {
	public List<Clazz> getClazzByCategory(int categoryId) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Clazz clazz = null;
		List<Clazz> list = new ArrayList<Clazz>();
		
		try {
			conn = DBUtil.makeConnection();
			ps = conn.prepareStatement("select * from `clazz` where category_id = ?");
			ps.setInt(1, categoryId);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				
				clazz = new Clazz(id, categoryId, name);
				list.add(clazz);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
		return list;
	}
}
