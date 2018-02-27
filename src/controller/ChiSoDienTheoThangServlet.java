package controller;

import java.io.IOException;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.ChiSoDien;
import model.bo.ChiSoDienBO;

/**
 * Servlet implementation class ChiSoDienTheoThangServlet
 */
@WebServlet("/ChiSoDienTheoThangServlet")
public class ChiSoDienTheoThangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChiSoDienTheoThangServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int maThang = Integer.parseInt(request.getParameter("maThang"));
		ChiSoDienBO chiSoDienBO = new ChiSoDienBO();
		List<ChiSoDien> list = chiSoDienBO.getListChiSoDienTheoThang(maThang);
		request.setAttribute("listChiSo", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("chiSoDienTheoThang.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
