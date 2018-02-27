package model.bo;

import java.util.List;

import model.bean.SinhVien;
import model.dao.SinhVienDAO;

public class SinhVienBO {
	SinhVienDAO sinhVienDAO = new SinhVienDAO();
	public List<SinhVien> getListSinhVien() {
		return sinhVienDAO.getListSinhVien();
	}
	public int themSinhVien(SinhVien sinhVien) {
		return sinhVienDAO.themSinhVien(sinhVien);
	}
}
