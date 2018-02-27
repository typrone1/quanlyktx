package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.ChiSoDien;
import model.bo.ChiSoDienBO;

/**
 * Servlet implementation class NhapChiSoDienServlet
 */
@WebServlet("/NhapChiSoDienServlet")
public class NhapChiSoDienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NhapChiSoDienServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int maThang = Integer.parseInt(request.getParameter("maThang"));
		int maPhong = Integer.parseInt(request.getParameter("maPhong"));
		ChiSoDienBO chiSoDienBO = new ChiSoDienBO();
		ChiSoDien chiSoDien = chiSoDienBO.layThongTinSoDien(maThang, maPhong);
		request.setAttribute("chiSoDien", chiSoDien);
		System.out.println(chiSoDien);
		RequestDispatcher dispatcher = request.getRequestDispatcher("nhapChiSoDien.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int maThang = Integer.parseInt(request.getParameter("maThang"));
		int maPhong = Integer.parseInt(request.getParameter("maPhong"));
		int chiSoCu = Integer.parseInt(request.getParameter("chiSoCu"));
		int chiSoMoi = Integer.parseInt(request.getParameter("chiSoMoi"));
		int donGia = Integer.parseInt(request.getParameter("donGia"));
		ChiSoDienBO chiSoDienBO = new ChiSoDienBO();
		chiSoDienBO.nhapChiSoDien(maThang, maPhong, chiSoCu, chiSoMoi, donGia);
		response.sendRedirect("ChiSoDienTheoThangServlet?maThang="+maThang);
		return;
	}

}
