package db.util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil implements Serializable{
	public static Connection makeConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/YogaWeb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Australia/Adelaide", "newuser",
					"123456");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
}
}
