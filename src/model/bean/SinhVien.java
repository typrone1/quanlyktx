package model.bean;

import java.util.Date;

public class SinhVien {
	private int maSV;
	private String tenSinhVien;
	private Date ngaySinh;
	private String gioiTinh;
	private String queQuan;
	private String cmnd;
	private String sdt;
	private String maTruong;
	private String taiKhoan;
	private String matKhau;
	
	
	public SinhVien() {
		super();
	}
	
	public SinhVien(int maSV, String tenSinhVien, Date ngaySinh, String gioiTinh, String queQuan, String cmnd,
			String sdt, String maTruong, String taiKhoan, String matKhau) {
		super();
		this.maSV = maSV;
		this.tenSinhVien = tenSinhVien;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
		this.cmnd = cmnd;
		this.sdt = sdt;
		this.maTruong = maTruong;
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getTenSinhVien() {
		return tenSinhVien;
	}
	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getMaTruong() {
		return maTruong;
	}
	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}
	public String getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", tenSinhVien=" + tenSinhVien + ", ngaySinh=" + ngaySinh + ", gioiTinh="
				+ gioiTinh + ", queQuan=" + queQuan + ", cmnd=" + cmnd + ", sdt=" + sdt + ", maTruong=" + maTruong
				+ ", taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + "]";
	}
	
}
