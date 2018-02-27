package model.bean;

public class ThoiGian {
	private int maThoiGian;
	private int thang;
	private int nam;
	public ThoiGian() {
		super();
	}
	public ThoiGian(int maThoiGian, int thang, int nam) {
		super();
		this.maThoiGian = maThoiGian;
		this.thang = thang;
		this.nam = nam;
	}
	public int getMaThoiGian() {
		return maThoiGian;
	}
	public void setMaThoiGian(int maThoiGian) {
		this.maThoiGian = maThoiGian;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	
	
	
}
