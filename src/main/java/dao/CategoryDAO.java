package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.util.DBUtil;
import model.Category;

public class CategoryDAO {
	public List<Category> getAllCategories() throws SQLException {
		// connect to DB
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Category> list = new ArrayList<Category>();
		try {
			// make connection to mysql
			conn = DBUtil.makeConnection();

			// table Category ->
			// Run query "select * from category"
			ps = conn.prepareStatement("select * from `category`");

			// excute and get result SET
			rs = ps.executeQuery();

			// mapping data in result set (IF RESULT SET HAS DATA) into ENTITY CLASS
			// (Category)
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");

				Category category = new Category(id, name);
				list.add(category);

			}
		} catch (Exception e) {
			e.printStackTrace();
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
		return list;
	}
}
