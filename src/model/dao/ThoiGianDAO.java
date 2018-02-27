package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.bean.Phong;
import model.bean.SinhVien;
import model.bean.ThoiGian;

public class ThoiGianDAO {
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

	public List<ThoiGian> getListThoiGian() {
		connect();
		String sql=	String.format("SELECT * FROM ThoiGian");
		ResultSet rs = null;
		ArrayList<ThoiGian> list = new ArrayList<ThoiGian>();
		ThoiGian thoiGian;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				thoiGian = new ThoiGian();
				thoiGian.setMaThoiGian(rs.getInt("MaThoiGian"));
				thoiGian.setNam(rs.getInt("Nam"));
				thoiGian.setThang(rs.getInt("Thang"));
				list.add(thoiGian);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int themThangMoi(ThoiGian thoiGian) {
		connect();
		try {
			PreparedStatement stmt;
			String sql = "INSERT INTO ThoiGian(MaThoiGian, Thang, Nam) VALUES (?, ? ,?)";
			stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, thoiGian.getMaThoiGian());
			stmt.setInt(2, thoiGian.getThang());
			stmt.setInt(3, thoiGian.getNam());
			return stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	public int taoDanhSachPhongNopTienDien(int maThoiGian) {
		connect();
		String sql=	String.format("SELECT * FROM Phong");
		ResultSet rs = null;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				int maPhong = rs.getInt("MaPhong");
				int ketQua = this.themPhongTieuThuDien(maThoiGian, maPhong);
				if (ketQua < 0) {
					return -1;
				}
			}
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	public int themPhongTieuThuDien(int maThoiGian, int maPhong) {
		connect();
		try {
			PreparedStatement stmt;
			String sql = "INSERT INTO ChiSoDien(MaThoiGian, MaPhong) VALUES (?, ?)";
			stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, maThoiGian);
			stmt.setInt(2, maPhong);
			return stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
}
