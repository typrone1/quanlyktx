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
			<h3>Danh sách phòng</h3>
			<table class="table">
				<tr>
					<th>Mã phòng</th>
					<th>Tên phòng</th>
					<th>Số lượng tối đa</th>
					<th>Loại phòng</th>
					<th>Giá tiền</th>
					<th>Tầng</th>
					<th>Tình trạng</th>
				</tr>
			<% 
				ArrayList<Phong> listPhong = (ArrayList<Phong>)request.getAttribute("listPhong");
	    		for (int i = 0; i < listPhong.size(); i++) {	
	    			Phong phong = listPhong.get(i);
	    		%>
	    		<tr>
					<td><%= phong.getMaPhong() %></td>
					<td><%= phong.getTenPhong() %></td>
					<td><%= phong.getSoLuongNguoiOToiDa() %></td>
					<td><%= phong.getLoaiPhong() %></td>
					<td><%= phong.getGiaTien() %></td>
					<td><%= phong.getTang() %></td>
					<td><%= phong.getTinhTrang() %></td>
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