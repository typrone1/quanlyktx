package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.bean.Phong;
import model.bean.SinhVien;

public class PhongDAO {
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

	public List<Phong> getListPhong() {
		connect();
		String sql=	String.format("SELECT * FROM Phong");
		ResultSet rs = null;
		ArrayList<Phong> list = new ArrayList<Phong>();
		Phong phong;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				phong = new Phong();
				phong.setMaPhong(rs.getInt("MaPhong"));
				phong.setTenPhong(rs.getString("TenPhong"));
				phong.setMaNha(rs.getInt("MaNha"));
				phong.setSoLuongNguoiOToiDa(rs.getInt("SoLuongNguoiOToiDa"));
				phong.setGiaTien(rs.getDouble("GiaTien"));
				phong.setLoaiPhong(rs.getString("LoaiPhong"));
				phong.setTang(rs.getInt("Tang"));
				phong.setGiaTien(rs.getInt("TinhTrang"));
				list.add(phong);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
