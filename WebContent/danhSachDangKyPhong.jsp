<%@page import="model.bean.DangKyPhong"%>
<%@page import="model.bean.Phong"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<title>Trang quản trị</title>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Quản lý Ký túc xá DMC</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Trang chủ <span class="sr-only">(current)</span></a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="/DangNhapServlet">Đăng nhập</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<div class="container">
	<div class="row">
		<div class="col-md-12">
			<h3>Danh sách đăng ký phòng</h3>
			<button class="btn btn-primary">Đăng ký phòng</button>
			<table class="table">
				<tr>
					<th>Mã đăng ký phòng</th>
					<th>Mã phòng</th>
					<th>Họ và tên</th>
					<th>Số ĐT</th>
					<th>Số tháng lưu trú</th>
					<th>Bao phòng</th>
					<th>Ngày đăng ký</th>
					<th>Ngày hết hạn</th>
					<th>Tình trạng duyệt</th>
					<th>Tình trạng lưu trú</th>
					<th></th>
				</tr>
			<% 
				ArrayList<DangKyPhong> listDangKyPhong = (ArrayList<DangKyPhong>)request.getAttribute("listDangKyPhong");
	    		for (int i = 0; i < listDangKyPhong.size(); i++) {	
	    			DangKyPhong dangKyPhong = listDangKyPhong.get(i);
	    		%>
	    		<tr>
					<td><%= dangKyPhong.getMaDangKy() %></td>
					<td><%= dangKyPhong.getMaPhong() %></td>
					<td><%= dangKyPhong.getHoVaTen() %></td>
					<td><%= dangKyPhong.getSdt() %></td>
					<td><%= dangKyPhong.getSoThangLuuTru() %></td>
					<td><%= dangKyPhong.getBaoPhong() %></td>
					<td><%= dangKyPhong.getNgayDangKy() %></td>
					<td><%= dangKyPhong.getNgayHetHan() %></td>
					<td><%= dangKyPhong.getTinhTrangDuyet() %></td>
					<td><%= dangKyPhong.getTinhTrangLuuTru() %></td>
					<td>
						<a href="#" class="btn btn-primary">Chỉnh sửa</a>
						<a href="#" class="btn btn-primary">Xóa</a>
						<a href="DuyetDangKyPhongServlet?mdk=<%=dangKyPhong.getMaDangKy()%>" class="btn btn-primary <%= dangKyPhong.getTinhTrangDuyet() == 0?"":"disabled" %>">Duyệt</a>
					</td>
				</tr>			
					
			<% 	} %>
						
			</table>
		</div>
	</div>
</div>
<div>
	
</div>
<script src="js/jquery-3.2.1.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>