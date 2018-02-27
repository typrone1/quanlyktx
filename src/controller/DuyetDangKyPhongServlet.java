package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.DangKyPhong;
import model.bean.SinhVien;
import model.bo.DangKyPhongBO;
import model.bo.SinhVienBO;

/**
 * Servlet implementation class DuyetDangKyPhongServlet
 */
@WebServlet("/DuyetDangKyPhongServlet")
public class DuyetDangKyPhongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DuyetDangKyPhongServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("mdk") == null ) {
			response.sendRedirect("DanhSachDangKyPhongServlet");
			
		} else {
			String maDangKy = request.getParameter("mdk");
			String step = request.getParameter("step");
			if (step == null || "".equals(step) || "1".equals(step)) {
				DangKyPhongBO dangKyPhongBO = new DangKyPhongBO();
				DangKyPhong dangKyPhong = dangKyPhongBO.getThongTinDangKyPhong(Integer.parseInt(maDangKy));
				request.setAttribute("dangKyPhong", dangKyPhong);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("duyetDangKyPhong.jsp");
				requestDispatcher.forward(request, response);
			} else if ("2".equals(step)){
				DangKyPhongBO dangKyPhongBO = new DangKyPhongBO();
				DangKyPhong dangKyPhong = dangKyPhongBO.getThongTinDangKyPhong(Integer.parseInt(maDangKy));
				request.setAttribute("dangKyPhong", dangKyPhong);
				request.setAttribute("step", "2");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("duyetDangKyPhong.jsp");
				requestDispatcher.forward(request, response);
			}
		}
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String step = request.getParameter("step");
		if ("3".equals(step)) {
			SinhVien sv = new SinhVien();
			String hoVaTen = request.getParameter("hoVaTen");
			sv.setTenSinhVien(hoVaTen);
			SinhVienBO sinhVienBO = new SinhVienBO();
			int maSV = sinhVienBO.themSinhVien(sv);
			System.out.println(maSV);
			DangKyPhongBO dangKyPhongBO = new DangKyPhongBO();
			int maDK = Integer.parseInt(request.getParameter("mdk"));
			if (dangKyPhongBO.duyetDangKyPhong(maDK, maSV) > 0) {
				request.setAttribute("thongBao", "Duyệt thành công");
			} else {
				request.setAttribute("thongBao", "Duyệt không thành công");
			}
			DangKyPhong dangKyPhong = dangKyPhongBO.getThongTinDangKyPhong(maDK);
			request.setAttribute("dangKyPhong", dangKyPhong);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("duyetDangKyPhong.jsp");
			requestDispatcher.forward(request, response);
		} else {
			doGet(request, response);
		}
	}

}
