CREATE DATABASE QLKTX
GO
USE QLKTX
GO
CREATE TABLE Truong(
	MaTruong nvarchar(10) primary key,
	TenTruong nvarchar(50)

)
CREATE TABLE NhanVien(
	MaNV int primary key,
	TenNhanVien nvarchar(30),
	TaiKhoan varchar(30),
	MatKhau nvarchar(30),
)
CREATE TABLE SinhVien(
	MaSV int primary key identity(1000,1),
	TenSinhVien nvarchar(30),
	NgaySinh date,
	GioiTinh nvarchar(5),
	QueQuan nvarchar(50),
	CMND varchar(12),
	SDT nvarchar(12),
	MaTruong nvarchar(10) FOREIGN KEY REFERENCES Truong(MaTruong),
	TaiKhoan varchar(30),
	MatKhau nvarchar(30),
)
CREATE TABLE Khu(
	MaKhu int primary key,
	TenKhu nvarchar(30)
)
CREATE TABLE Nha(
	MaNha int primary key,
	TenNha nvarchar(30),
	MaKhu int FOREIGN KEY REFERENCES Khu(MaKhu)
)
CREATE TABLE Phong(
	MaPhong int primary key,
	TenPhong nvarchar(10),
	MaNha int FOREIGN KEY REFERENCES Nha(MaNha),
	SoLuongNguoiOToiDa int,
	LoaiPhong nvarchar(5), /* Nam or Nu*/
	GiaTien decimal(10,2),
	Tang int,
	TinhTrang int,
)

CREATE TABLE DangKyPhong(
	MaDangKy int primary key identity(1000,1),
	MaPhong int FOREIGN KEY REFERENCES Phong(MaPhong),
	HoVaTen nvarchar(30),
	SDT nvarchar(12),
	TinhTrangDuyet int,
	SoThangLuuTru int,
	NgayDangKy date,
	NgayHetHan date,
	BaoPhong int DEFAULT(1),
	TinhTrangLuuTru int,
	MaSV int FOREIGN KEY REFERENCES SinhVien(MaSV)
)
CREATE TABLE ThoiGian(
	MaThoiGian int primary key,
	Thang int,
	Nam int,
	
)
CREATE TABLE ChiSoDien(
	MaThoiGian int FOREIGN KEY REFERENCES ThoiGian(MaThoiGian),
	MaPhong int	FOREIGN KEY REFERENCES Phong(MaPhong),
	LanGhi int DEFAULT(1),
	NgayGhiNhanChiSo date,
	ChiSoCu int, 
	ChiSoMoi int,
	SoDienTieuThu int,
	DonGia decimal(10,2),
	ThanhTien decimal(10,2),
	primary key (MaThoiGian, MaPhong, LanGhi)
)