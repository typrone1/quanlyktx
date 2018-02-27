package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.bean.DangKyPhong;
import model.bean.SinhVien;

public class DangKyPhongDAO {
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
	public int dangKyPhong(DangKyPhong dangKyPhong) {
		connect();
		String sql=	String.format("INSERT INTO DangKyPhong(MaPhong,HoVaTen,SDT,TinhTrangDuyet,SoThangLuuTru,NgayDangKy,NgayHetHan,BaoPhong,TinhTrangLuuTru) "+
					" VALUES ( '%d',N'%s','%s','%d','%d','%s','%s','%d','%d')", 
					dangKyPhong.getMaPhong(), 
					dangKyPhong.getHoVaTen(),
					dangKyPhong.getSdt(),
					dangKyPhong.getTinhTrangDuyet(),
					dangKyPhong.getSoThangLuuTru(),
					dangKyPhong.getNgayDangKy()==null?"":"",
					dangKyPhong.getNgayHetHan()==null?"":"",
					dangKyPhong.getBaoPhong(),
					dangKyPhong.getTinhTrangLuuTru());
		try {
			Statement stmt = connection.createStatement();
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	public List<DangKyPhong> getListDangKyPhong() {
		connect();
		String sql=	String.format("SELECT * FROM DangKyPhong");
		ResultSet rs = null;
		ArrayList<DangKyPhong> list = new ArrayList<DangKyPhong>();
		DangKyPhong dangKyPhong;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				dangKyPhong = new DangKyPhong();
				dangKyPhong.setMaDangKy(rs.getInt("MaDangKy"));
				dangKyPhong.setMaPhong(rs.getInt("MaPhong"));
				dangKyPhong.setHoVaTen(rs.getString("HoVaTen"));
				dangKyPhong.setSdt(rs.getString("SDT"));
				dangKyPhong.setTinhTrangDuyet(rs.getInt("TinhTrangDuyet"));
				dangKyPhong.setSoThangLuuTru(rs.getInt("SoThangLuuTru"));
				dangKyPhong.setNgayDangKy(rs.getDate("NgayDangKy"));
				dangKyPhong.setNgayHetHan(rs.getDate("NgayHetHan"));
				dangKyPhong.setBaoPhong(rs.getInt("BaoPhong"));
				dangKyPhong.setTinhTrangLuuTru(rs.getInt("TinhTrangLuuTru"));
				dangKyPhong.setMaSV(rs.getInt("MaSV"));
				list.add(dangKyPhong);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public DangKyPhong getThongTinDangKyPhong(int maDK) {
		connect();
		String sql=	String.format("SELECT * FROM DangKyPhong WHERE maDangKy = %d", maDK);
		ResultSet rs = null;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DangKyPhong dangKyPhong = new DangKyPhong();
		try {
			while(rs.next()){
				dangKyPhong.setMaDangKy(rs.getInt("MaDangKy"));
				dangKyPhong.setMaPhong(rs.getInt("MaPhong"));
				dangKyPhong.setHoVaTen(rs.getString("HoVaTen"));
				dangKyPhong.setSdt(rs.getString("SDT"));
				dangKyPhong.setTinhTrangDuyet(rs.getInt("TinhTrangDuyet"));
				dangKyPhong.setSoThangLuuTru(rs.getInt("SoThangLuuTru"));
				dangKyPhong.setNgayDangKy(rs.getDate("NgayDangKy"));
				dangKyPhong.setNgayHetHan(rs.getDate("NgayHetHan"));
				dangKyPhong.setBaoPhong(rs.getInt("BaoPhong"));
				dangKyPhong.setTinhTrangLuuTru(rs.getInt("TinhTrangLuuTru"));
				dangKyPhong.setMaSV(rs.getInt("MaSV"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dangKyPhong;
	}
	
	public int duyetDangKyPhong(int maDK, int maSV) {
		connect();
		String sql=	String.format("UPDATE DangKyPhong "+
					" SET MaSV = %d, TinhTrangDuyet = 1 WHERE MaDangKy = '%s'", maSV, maDK);
		try {
			Statement stmt = connection.createStatement();
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
}
