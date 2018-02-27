package model.bo;

import model.dao.NhanVienDAO;

public class NhanVienBO {
	NhanVienDAO nhanVienDAO = new NhanVienDAO();
	public boolean checkLogin(String taiKhoan, String matKhau) {
		return nhanVienDAO.checkLogin(taiKhoan, matKhau);
	}
}
