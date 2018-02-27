package model.bean;

public class Phong {
	private int maPhong;
	private String tenPhong;
	private int maNha;
	private int soLuongNguoiOToiDa;
	private String loaiPhong;
	private double giaTien;
	private int tang;
	private int tinhTrang;
	
	public Phong() {
		super();
	}

	public Phong(int maPhong, String tenPhong, int maNha, int soLuongNguoiOToiDa, String loaiPhong, double giaTien,
			int tang, int tinhTrang) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.maNha = maNha;
		this.soLuongNguoiOToiDa = soLuongNguoiOToiDa;
		this.loaiPhong = loaiPhong;
		this.giaTien = giaTien;
		this.tang = tang;
		this.tinhTrang = tinhTrang;
	}

	public int getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public int getMaNha() {
		return maNha;
	}

	public void setMaNha(int maNha) {
		this.maNha = maNha;
	}

	public int getSoLuongNguoiOToiDa() {
		return soLuongNguoiOToiDa;
	}

	public void setSoLuongNguoiOToiDa(int soLuongNguoiOToiDa) {
		this.soLuongNguoiOToiDa = soLuongNguoiOToiDa;
	}

	public String getLoaiPhong() {
		return loaiPhong;
	}

	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}

	public double getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}

	public int getTang() {
		return tang;
	}

	public void setTang(int tang) {
		this.tang = tang;
	}

	public int getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(int tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	
	
}
