<%@page import="common.StringProcess"%>
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
		<%
			DangKyPhong dangKyPhong = (DangKyPhong)request.getAttribute("dangKyPhong");
		%>
		<%
			String step = "1";
    		if (request.getAttribute("step") != null) {
    			step = (String) request.getAttribute("step");
    		}
			if (step.equals("1")) { 
		%>	
		<div class="col-md-12">
			<h3>Duyệt đăng ký phòng</h3>
			<%= StringProcess.getVaildString((String)request.getAttribute("thongBao")) %>
			<div class="row">	
				
				<form action="DuyetDangKyPhongServlet?mdk=<%= dangKyPhong.getMaDangKy() %>&step=2" id="form1" method="post">
					<div class="col-md-6">
					
						<div class="form-group">
							<label>Mã đăng ký</label>
							<input type="text" class="form-control" name="maDangKy" value="<%= dangKyPhong.getMaDangKy() %>">
						</div>
						<p>Thông tin phòng</p>
						
						<div class="form-group">
							<label>Mã phòng</label>
							<input type="text" class="form-control" name="maPhong" value="<%= dangKyPhong.getMaPhong() %>">
						</div>
						<div class="form-group">
							<label>Ngày đăng ký</label>
							<input type="date" class="form-control" name="ngayDangKy">
						</div>
						<div class="form-group">
							<label>Bao phòng</label>
							<select class="form-control" name="baoPhong">
								<option value="1">1 người</option>
								<option value="2">2 người</option>
								<option value="3">3 người</option>
								<option value="4">4 người</option>
								<option value="ghep">Ở ghép</option>
							</select>
						</div>
						<div class="form-group">
							<label>Số tháng lưu trú</label>
							<select class="form-control" name="soThangLuuTru">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
							</select>
						</div>
					</div>
					<div class="col-md-6">
						<p>Thông tin cá nhân </p>
						<div class="form-group">
							<label>Họ và tên</label>
							<input class="form-control" type="text" name="hoVaTen" value="<%= dangKyPhong.getHoVaTen() %>">
						</div>
						<div class="form-group">
							<label>SĐT</label>
							<input class="form-control" type="text" name="sdt" value="<%= dangKyPhong.getSdt() %>">
						</div>
						<div class="form-group">
							<label>Ngày sinh</label>
							<input class="form-control" type="date" name="ngaySinh">
						</div>
						<div class="form-group">
							<label>Giới tính</label>
							<input type="checkbox" name="gioiTinh" value="Nam"> Nam 
							<input type="checkbox" name="gioiTinh" value="Nữ"> Nữ 
						</div>
						<div class="form-group">
							<label>Trường</label>
							<select class="form-control" name="maTruong">
								<option value="1">Cao đẳng Công nghệ</option>
							</select>
						</div>
					</div>
				</form>				
			</div>
			<button type="submit" form="form1" class="btn btn-primary">Submit</button>
		</div>
		<% } else { %>
		<div class="col-md-6">
			<h3>Chọn sinh viên đã tồn tại trong hệ thống</h3>	
			<form>
				<p>Chọn sinh viên </p>
				<select class="form-control" name="maSinhVien">
					<option>Nguyễn Văn Tèo</option>
				</select>
				<input type="submit" value="Submit" class="btn btn-primary"> 
			</form>
		</div>
		<div class="col-md-6 well">
			<h3>Thêm mới sinh viên</h3>	
			<form action="DuyetDangKyPhongServlet?mdk=<%= dangKyPhong.getMaDangKy() %>&step=3" method="post" id="form2">
				<p>Thông tin cá nhân </p>
				<div class="form-group">
					<label>Họ và tên</label>
					<input class="form-control" type="text" name="hoVaTen">
				</div>
				<div class="form-group">
					<label>SĐT</label>
					<input class="form-control" type="text" name="sdt">
				</div>
				<div class="form-group">
					<label>Ngày sinh</label>
					<input class="form-control" type="date" name="ngaySinh">
				</div>
				<div class="form-group">
					<label>Giới tính</label>
					<input type="checkbox" name="gioiTinh" value="Nam"> Nam 
					<input type="checkbox" name="gioiTinh" value="Nữ"> Nữ 
				</div>
				<div class="form-group">
					<label>Trường</label>
					<select class="form-control" name="maTruong">
						<option value="1">Cao đẳng Công nghệ</option>
					</select>
				</div>
				
			</form>
			<button type="submit" class="btn btn-primary" form="form2">Thêm sinh viên mới và hoàn thành</button>
			</div>
		<% } %>
	</div>
</div>
<div>
	
</div>
<script src="js/jquery-3.2.1.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>