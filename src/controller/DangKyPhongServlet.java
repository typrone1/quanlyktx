package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.DangKyPhong;
import model.bo.DangKyPhongBO;

/**
 * Servlet implementation class DangKyPhongServlet
 */
@WebServlet("/DangKyPhongServlet")
public class DangKyPhongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangKyPhongServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("dangKyPhong.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DangKyPhongBO dangKyPhongBO = new DangKyPhongBO();
		int maPhong = Integer.parseInt(request.getParameter("maPhong"));
		int baoPhong = Integer.parseInt(request.getParameter("baoPhong"));
		int soThangLuuTru = Integer.parseInt(request.getParameter("soThangLuuTru"));
		String hoVaTen = request.getParameter("hoVaTen");
		String sdt = request.getParameter("sdt");
		String ngayDangKy = request.getParameter("ngayDangKy");
		DangKyPhong dangKyPhong = new DangKyPhong();
		dangKyPhong.setHoVaTen(hoVaTen);
		dangKyPhong.setBaoPhong(baoPhong);
		dangKyPhong.setSoThangLuuTru(soThangLuuTru);
		dangKyPhong.setSdt(sdt);
		dangKyPhong.setNgayDangKy(null);
		dangKyPhong.setMaPhong(maPhong);
		int ketQua = dangKyPhongBO.dangKyPhong(dangKyPhong);
		if (ketQua > 0) {
			System.out.println("Dang ky thanh cong");
		} else {
			System.out.println("Dang ky khong thanh cong");
		}
	}

}
