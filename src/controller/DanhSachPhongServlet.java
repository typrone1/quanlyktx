package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.PhongBO;
import model.bo.SinhVienBO;
import model.dao.PhongDAO;

/**
 * Servlet implementation class DanhSachPhongServlet
 */
@WebServlet("/DanhSachPhongServlet")
public class DanhSachPhongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachPhongServlet() {
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
		PhongBO phongBO = new PhongBO();
		request.setAttribute("listPhong", phongBO.getListPhong());
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("danhSachPhong.jsp");
		requestDispatcher.forward(request, response);
	}

}
