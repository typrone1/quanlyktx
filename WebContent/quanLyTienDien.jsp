<%@page import="common.StringProcess"%>
<%@page import="model.bean.ThoiGian"%>
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
		<div class="col-md-12 well">
			<h3>Thêm tháng mới</h3>
			<%= StringProcess.getVaildString((String)request.getAttribute("thongBao")) %>
			<form action="" method="post">
				<div class="form-group">
					<label>Mã thời gian</label>
					<input class="form-control" name="maThoiGian" type="text">
				</div>
				<div class="form-group">
					<label>Tháng</label>
					<input class="form-control" name="thang" type="text">
				</div>
				<div class="form-group">
					<label>Năm</label>
					<input class="form-control" name="nam" type="text">
				</div>
				<div class="form-group">
					<label>Đối tượng áp dụng</label>
					<select class="form-control">
						<option>Tất cả các phòng</option>
					</select>
				</div>
				<input type="submit" value="Submit" class="btn btn-primary">
			</form>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<h3>Danh sách các tháng nộp tiền điện</h3>
			<table class="table">
				<tr>
					<th>Mã tháng</th>
					<th>Tháng</th>
					<th>Năm</th>
					<th>Hành động</th>
				</tr>
			<% 
				ArrayList<ThoiGian> listThoiGian = (ArrayList<ThoiGian>)request.getAttribute("listThoiGian");
	    		for (int i = 0; i < listThoiGian.size(); i++) {	
	    			ThoiGian thoiGian = listThoiGian.get(i);
	    		%>
	    		<tr>
					<td><%= thoiGian.getMaThoiGian() %></td>
					<td><%= thoiGian.getThang() %></td>
					<td><%= thoiGian.getNam() %></td>
					<td><a href="ChiSoDienTheoThangServlet?maThang=<%= thoiGian.getMaThoiGian() %>" class="btn btn-primary">Xem danh sách nộp tiền</a></td>
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