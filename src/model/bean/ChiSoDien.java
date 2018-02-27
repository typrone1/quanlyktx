package model.bean;

import java.util.Date;

public class ChiSoDien {
	private int maThoiGian;
	private int maPhong;
	private int lanGhi;
	private Date ngayGhiNhanChiSo;
	private int chiSoCu;
	private int chiSoMoi;
	private int soDienTieuThu;
	private int donGia;
	private int thanhTien;
	public ChiSoDien() {}
	public ChiSoDien(int maThoiGian, int maPhong, int lanGhi, Date ngayGhiNhanChiSo, int chiSoCu, int chiSoMoi,
			int soDienTieuThu, int donGia, int thanhTien) {
		super();
		this.maThoiGian = maThoiGian;
		this.maPhong = maPhong;
		this.lanGhi = lanGhi;
		this.ngayGhiNhanChiSo = ngayGhiNhanChiSo;
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
		this.soDienTieuThu = soDienTieuThu;
		this.donGia = donGia;
		this.thanhTien = thanhTien;
	}
	public int getMaThoiGian() {
		return maThoiGian;
	}
	public void setMaThoiGian(int maThoiGian) {
		this.maThoiGian = maThoiGian;
	}
	public int getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}
	public int getLanGhi() {
		return lanGhi;
	}
	public void setLanGhi(int lanGhi) {
		this.lanGhi = lanGhi;
	}
	public Date getNgayGhiNhanChiSo() {
		return ngayGhiNhanChiSo;
	}
	public void setNgayGhiNhanChiSo(Date ngayGhiNhanChiSo) {
		this.ngayGhiNhanChiSo = ngayGhiNhanChiSo;
	}
	public int getChiSoCu() {
		return chiSoCu;
	}
	public void setChiSoCu(int chiSoCu) {
		this.chiSoCu = chiSoCu;
	}
	public int getChiSoMoi() {
		return chiSoMoi;
	}
	public void setChiSoMoi(int chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}
	public int getSoDienTieuThu() {
		return soDienTieuThu;
	}
	public void setSoDienTieuThu(int soDienTieuThu) {
		this.soDienTieuThu = soDienTieuThu;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public int getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(int thanhTien) {
		this.thanhTien = thanhTien;
	}
	
	
	
}
