package model.bo;

import java.util.List;

import model.bean.ThoiGian;
import model.dao.ThoiGianDAO;

public class ThoiGianBO {
	ThoiGianDAO thoiGianDAO = new ThoiGianDAO();
	public List<ThoiGian> getListThoiGian() {
		return thoiGianDAO.getListThoiGian();
	}
	public int themThangMoi(ThoiGian thoiGian) {
		thoiGianDAO.themThangMoi(thoiGian);
		return thoiGianDAO.taoDanhSachPhongNopTienDien(thoiGian.getMaThoiGian());
	}
}
