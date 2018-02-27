package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.bean.SinhVien;

public class SinhVienDAO {
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

	public List<SinhVien> getListSinhVien() {
		connect();
		String sql=	String.format("SELECT * FROM SinhVien");
		ResultSet rs = null;
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		SinhVien sinhVien;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				sinhVien = new SinhVien();
				sinhVien.setMaSV(rs.getInt("MaSV"));
				sinhVien.setTenSinhVien(rs.getString("TenSinhVien"));
				sinhVien.setGioiTinh(rs.getString("GioiTinh"));
				sinhVien.setQueQuan(rs.getString("QueQuan"));
				sinhVien.setCmnd(rs.getString("CMND"));
				sinhVien.setSdt(rs.getString("SDT"));
				sinhVien.setMaTruong(rs.getString("MaTruong"));
				list.add(sinhVien);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int themSinhVien(SinhVien sinhVien) {
		connect();
		try {
			PreparedStatement stmt;
			String sql = "INSERT INTO SinhVien(TenSinhVien) VALUES (?)";
			stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, sinhVien.getTenSinhVien());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
		    rs.next();
		    return rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
}
