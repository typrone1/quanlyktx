package model.bo;

import java.util.List;

import model.bean.DangKyPhong;
import model.dao.DangKyPhongDAO;

public class DangKyPhongBO {
	DangKyPhongDAO dangKyPhongDAO = new DangKyPhongDAO();
	
	public List<DangKyPhong> getListDangKyPhong() {
		return dangKyPhongDAO.getListDangKyPhong();
	}
	public int dangKyPhong(DangKyPhong dangKyPhong) {
		return dangKyPhongDAO.dangKyPhong(dangKyPhong);
	}
	
	public DangKyPhong getThongTinDangKyPhong(int maDK) {
		return dangKyPhongDAO.getThongTinDangKyPhong(maDK);
	}
	
	public int duyetDangKyPhong(int maDK, int maSV) {
		return dangKyPhongDAO.duyetDangKyPhong(maDK, maSV);
	}
}
