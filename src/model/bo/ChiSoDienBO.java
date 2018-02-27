package model.bo;

import java.util.List;

import model.bean.ChiSoDien;
import model.dao.ChiSoDienDAO;

public class ChiSoDienBO {
	ChiSoDienDAO chiSoDienDAO = new ChiSoDienDAO();
	public List<ChiSoDien> getListChiSoDienTheoThang(int maThang) {
		return chiSoDienDAO.getListChiSoDienTheoThang(maThang);
	}
	public int nhapChiSoDien(int maThang, int maPhong, int chiSoCu, int chiSoMoi, int giaDien) {
		return chiSoDienDAO.nhapChiSoDien(maThang, maPhong, chiSoCu, chiSoMoi, giaDien);
	}
	public ChiSoDien layThongTinSoDien(int maThang, int maPhong) {
		return chiSoDienDAO.layThongTinSoDien(maThang, maPhong);
	}
}
