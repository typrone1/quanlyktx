package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bo.NhanVienBO;

/**
 * Servlet implementation class DangNhapServlet
 */
@WebServlet("/DangNhapServlet")
public class DangNhapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangNhapServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		NhanVienBO nhanVienBO = new NhanVienBO();
		if("Login".equals(request.getParameter("submit"))) {
			String taiKhoan = request.getParameter("tai-khoan");
			String matKhau = request.getParameter("mat-khau");
			if (nhanVienBO.checkLogin(taiKhoan, matKhau)) {
				HttpSession session = request.getSession();
				session.setAttribute("taiKhoan", taiKhoan);
				response.sendRedirect("TrangQuanTriServlet");
			} else {
				response.sendRedirect("/DangNhapServlet");
			}
		}
	}

}
