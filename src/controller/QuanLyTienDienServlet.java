package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.ThoiGian;
import model.bo.ThoiGianBO;

/**
 * Servlet implementation class QuanLyTienDienServlet
 */
@WebServlet("/QuanLyTienDienServlet")
public class QuanLyTienDienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuanLyTienDienServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ThoiGianBO thoiGianBO = new ThoiGianBO();
		List<ThoiGian> listThoiGian = thoiGianBO.getListThoiGian();
		request.setAttribute("listThoiGian", listThoiGian);
		RequestDispatcher dispatcher = request.getRequestDispatcher("quanLyTienDien.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int maThoiGian = Integer.parseInt(request.getParameter("maThoiGian"));
		int thang = Integer.parseInt(request.getParameter("thang"));
		int nam = Integer.parseInt(request.getParameter("nam"));
		ThoiGianBO thoiGianBO = new ThoiGianBO();
		ThoiGian thoiGian = new ThoiGian(maThoiGian, thang, nam);
		int ketQua = thoiGianBO.themThangMoi(thoiGian);
		if (ketQua > 0) {
			request.setAttribute("thongBao", "Thêm thành công");
		} else {
			request.setAttribute("thongBao", "Thêm không thành công");
		}
		List<ThoiGian> listThoiGian = thoiGianBO.getListThoiGian();
		request.setAttribute("listThoiGian", listThoiGian);
		RequestDispatcher dispatcher = request.getRequestDispatcher("quanLyTienDien.jsp");
		dispatcher.forward(request, response);
	}

}
