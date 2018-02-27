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
			<h3>Đăng ký phòng</h3>
			<div class="row">
				<form action="" id="form1" method="post">
					<div class="col-md-6">
						<p>Thông tin phòng</p>
						<div class="form-group">
							<label>Mã phòng</label>
							<select class="form-control" name="maPhong">
								<option value="1">A101</option>
							</select>
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
							<input class="form-control" type="text" name="hoVaTen">
						</div>
						<div class="form-group">
							<label>SĐT</label>
							<input class="form-control" type="text" name="sdt">
						</div>
					</div>
				</form>	
				
			</div>
			<button type="submit" form="form1" class="btn btn-primary">Submit</button>
		</div>
	</div>
</div>
<div>
	
</div>
<script src="js/jquery-3.2.1.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>