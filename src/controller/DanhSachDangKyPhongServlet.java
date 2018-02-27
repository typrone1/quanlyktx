package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.DangKyPhongBO;
import model.bo.SinhVienBO;

/**
 * Servlet implementation class DanhSachDangKyPhongServlet
 */
@WebServlet("/DanhSachDangKyPhongServlet")
public class DanhSachDangKyPhongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachDangKyPhongServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DangKyPhongBO dangKyPhongBO = new DangKyPhongBO();
		request.setAttribute("listDangKyPhong", dangKyPhongBO.getListDangKyPhong());
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("danhSachDangKyPhong.jsp");
		requestDispatcher.forward(request, response);
	}

}
