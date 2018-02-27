package model.bo;

import java.util.List;

import model.bean.Phong;
import model.dao.PhongDAO;

public class PhongBO {
	PhongDAO phongDAO = new PhongDAO();
	public List<Phong> getListPhong() {
		return phongDAO.getListPhong();
	}
}
