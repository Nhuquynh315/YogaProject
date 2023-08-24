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
	
	private static final String SQL_GET_CLASS_BY_CATEGORY = "SELECT * FROM YogaWeb.clazz WHERE category_id = ?";
	private static final String SQL_GET_CLASS_BY_NAME = "SELECT * FROM YogaWeb.clazz WHERE name like ?";
	private static final String SQL_GET_ALL_CLAZZES = "SELECT * FROM YogaWeb.clazz";
	private static final String SQL_GET_CLAZZ_DETAIL = "SELECT * FROM YogaWeb.clazz WHERE id = ?";
	private static final String SQL_GET_CLAZZ_BY_SEARCH = "SELECT * FROM YogaWeb.clazz WHERE name like ?";
	
	public List<Clazz> getClazzByCategory(int categoryId) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Clazz clazz = null;
		List<Clazz> list = new ArrayList<Clazz>();
		
		try {
			conn = DBUtil.makeConnection();
			ps = conn.prepareStatement(SQL_GET_CLASS_BY_CATEGORY);
			ps.setInt(1, categoryId);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int level = rs.getInt("level");
				int lengthMin = rs.getInt("length_min");
				String description = rs.getString("description");
				
				clazz = new Clazz(id, categoryId, name, level, lengthMin, description);
				list.add(clazz);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
		}return list;
	}
	
	public List<Clazz> getClazzByName(String clazzName) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Clazz clazz = null;
		List<Clazz> list = new ArrayList<Clazz>();
		
		try {
			conn = DBUtil.makeConnection();
			ps = conn.prepareStatement(SQL_GET_CLASS_BY_NAME);
			ps.setString(1, "%" + clazzName + "%");
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("id");
				int categoryId = rs.getInt("category_id");
				String name = rs.getString("name");
				int level = rs.getInt("level");
				int lengthMin = rs.getInt("length_min");
				String description = rs.getString("description");
				
				clazz = new Clazz(id, categoryId, name, level, lengthMin, description);
				list.add(clazz);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
		}return list;
	}
	
	public List<Clazz> getAllClazz() throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Clazz clazz = null;
		List<Clazz> list = new ArrayList<Clazz>();
		
		try {
			conn = DBUtil.makeConnection();
			ps = conn.prepareStatement(SQL_GET_ALL_CLAZZES);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("id");
				int categoryId = rs.getInt("category_id");
				String name = rs.getString("name");
				int level = rs.getInt("level");
				int lengthMin = rs.getInt("length_min");
				String description = rs.getString("description");
				
				clazz = new Clazz(id, categoryId, name, level, lengthMin, description);
				list.add(clazz);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
		}return list;
	}	
	
	public Clazz getClazzDetail( int clazzId) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Clazz clazz = null;
		
		try {
			conn = DBUtil.makeConnection();
			ps = conn.prepareStatement(SQL_GET_CLAZZ_DETAIL);
			ps.setInt(1, clazzId);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("id");
				int categoryId = rs.getInt("category_id");
				String name = rs.getString("name");
				int level = rs.getInt("level");
				int lengthMin = rs.getInt("length_min");
				String description = rs.getString("description");
				
				clazz = new Clazz(id, categoryId, name, level, lengthMin, description);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
		}return clazz;
	}
	
	public List<Clazz> getClazzBySearch(String clazzName) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Clazz clazz = null;
		List<Clazz> list = new ArrayList<Clazz>();
		
		try {
			conn = DBUtil.makeConnection();
			ps = conn.prepareStatement(SQL_GET_CLAZZ_BY_SEARCH);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("id");
				int categoryId = rs.getInt("category_id");
				String name = rs.getString("name");
				int level = rs.getInt("level");
				int lengthMin = rs.getInt("length_min");
				String description = rs.getString("description");
				
				clazz = new Clazz(id, categoryId, name, level, lengthMin, description);
				list.add(clazz);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
		}return list;
	}	
}
