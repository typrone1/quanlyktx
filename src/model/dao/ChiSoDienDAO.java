package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.bean.ChiSoDien;
import model.bean.Phong;

public class ChiSoDienDAO {
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
	public List<ChiSoDien> getListChiSoDienTheoThang(int maThang) {
		connect();
		String sql=	String.format("SELECT * FROM ChiSoDien WHERE MaThoiGian="+ maThang);
		ResultSet rs = null;
		ArrayList<ChiSoDien> list = new ArrayList<ChiSoDien>();
		ChiSoDien chiSoDien;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				chiSoDien = new ChiSoDien();
				chiSoDien.setMaThoiGian(maThang);
				chiSoDien.setChiSoCu(rs.getInt("ChiSoCu"));
				chiSoDien.setChiSoMoi(rs.getInt("ChiSoMoi"));
				chiSoDien.setNgayGhiNhanChiSo(rs.getDate("NgayGhiNhanChiSo"));
				chiSoDien.setSoDienTieuThu(rs.getInt("SoDienTieuThu"));
				chiSoDien.setMaPhong(rs.getInt("MaPhong"));
				list.add(chiSoDien);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public ChiSoDien layThongTinSoDien(int maThang, int maPhong) {
		connect();
		String sql=	String.format("SELECT * FROM ChiSoDien WHERE MaThoiGian="+ maThang +" AND MaPhong=" + maPhong);
		ResultSet rs = null;
		ChiSoDien chiSoDien;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()){
				chiSoDien = new ChiSoDien();
				chiSoDien.setMaThoiGian(maThang);
				chiSoDien.setChiSoCu(rs.getInt("ChiSoCu"));
				chiSoDien.setChiSoMoi(rs.getInt("ChiSoMoi"));
				chiSoDien.setDonGia(rs.getInt("DonGia"));
				chiSoDien.setThanhTien(rs.getInt("ThanhTien"));
				chiSoDien.setNgayGhiNhanChiSo(rs.getDate("NgayGhiNhanChiSo"));
				chiSoDien.setSoDienTieuThu(rs.getInt("SoDienTieuThu"));
				chiSoDien.setMaPhong(rs.getInt("MaPhong"));
				return chiSoDien;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public int nhapChiSoDien(int maThang, int maPhong, int chiSoCu, int chiSoMoi, int giaDien) {
		connect();
		try {
			PreparedStatement stmt;
			String sql = "UPDATE ChiSoDien SET ChiSoCu=?, ChiSoMoi=?, DonGia=?, SoDienTieuThu =?, ThanhTien=?, NgayGhiNhanChiSo=GETDATE() WHERE MaThoiGian=? AND MaPhong=?";
			stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			int soDienTieuThu = chiSoMoi - chiSoCu;
			stmt.setInt(1, chiSoCu);
			stmt.setInt(2, chiSoMoi);
			stmt.setInt(3, giaDien);
			stmt.setInt(4, soDienTieuThu);
			stmt.setInt(5, soDienTieuThu*giaDien);
			stmt.setInt(6, maThang);
			stmt.setInt(7, maPhong);
			return stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
}
