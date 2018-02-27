package model.bean;

import java.util.Date;

public class DangKyPhong {
	private int maDangKy;
	private int maPhong;
	private String hoVaTen;
	private String sdt;
	private int tinhTrangDuyet;
	private int soThangLuuTru;
	private Date ngayDangKy;
	private Date ngayHetHan;
	private int baoPhong;
	private int tinhTrangLuuTru;
	private int maSV;
	
	public DangKyPhong() {
		super();
	}
	public DangKyPhong(int maDangKy, int maPhong, String hoVaTen, String sdt, int tinhTrangDuyet, int soThangLuuTru,
			Date ngayDangKy, Date ngayHetHan, int baoPhong, int tinhTrangLuuTru, int maSV) {
		super();
		this.maDangKy = maDangKy;
		this.maPhong = maPhong;
		this.hoVaTen = hoVaTen;
		this.sdt = sdt;
		this.tinhTrangDuyet = tinhTrangDuyet;
		this.soThangLuuTru = soThangLuuTru;
		this.ngayDangKy = ngayDangKy;
		this.ngayHetHan = ngayHetHan;
		this.baoPhong = baoPhong;
		this.tinhTrangLuuTru = tinhTrangLuuTru;
		this.maSV = maSV;
	}
	public int getMaDangKy() {
		return maDangKy;
	}
	public void setMaDangKy(int maDangKy) {
		this.maDangKy = maDangKy;
	}
	public int getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public int getTinhTrangDuyet() {
		return tinhTrangDuyet;
	}
	public void setTinhTrangDuyet(int tinhTrangDuyet) {
		this.tinhTrangDuyet = tinhTrangDuyet;
	}
	public int getSoThangLuuTru() {
		return soThangLuuTru;
	}
	public void setSoThangLuuTru(int soThangLuuTru) {
		this.soThangLuuTru = soThangLuuTru;
	}
	public Date getNgayDangKy() {
		return ngayDangKy;
	}
	public void setNgayDangKy(Date ngayDangKy) {
		this.ngayDangKy = ngayDangKy;
	}
	public Date getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(Date ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	public int getBaoPhong() {
		return baoPhong;
	}
	public void setBaoPhong(int baoPhong) {
		this.baoPhong = baoPhong;
	}
	public int getTinhTrangLuuTru() {
		return tinhTrangLuuTru;
	}
	public void setTinhTrangLuuTru(int tinhTrangLuuTru) {
		this.tinhTrangLuuTru = tinhTrangLuuTru;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	
}
