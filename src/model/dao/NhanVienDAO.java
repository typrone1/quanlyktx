package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NhanVienDAO {
	String url = "jdbc:sqlserver://localhost:1433;databaseName=QLKTX";
	String userName = "sa";
	String password = "123";
	Connection connection;
	
	void connect(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public boolean checkLogin(String taiKhoan, String matKhau) {
		connect();
		String sql=	String.format("SELECT * FROM NhanVien WHERE TaiKhoan = '%s' AND MatKhau = '%s'", taiKhoan, matKhau);
		ResultSet rs = null;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
