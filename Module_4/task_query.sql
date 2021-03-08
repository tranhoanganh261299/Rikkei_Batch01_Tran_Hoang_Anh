/* sanpham sl>20 dongia <100000*/
SELECT * from sanphamdochoi a
WHERE a.SoLuong > 20 and a.DonGia < 1000000;

SELECT * from sanphamdungcu a
WHERE a.SoLuong > 20 and a.DonGia < 1000000;

SELECT * from sanphamsach a
WHERE a.SoLuong > 20 and a.DonGia < 1000000;

/*Tuoi*/
SELECT * FROM khachhang as a
WHERE ROUND(DATEDIFF(now() , a.NgaySinh)/365) BETWEEN 16 and 30
  AND ROUND(DATEDIFF(now() , a.NgaySinh)/365) > 40;
 
 /*ten*/ 
select * from khachhang where TenKhachHang like 'K%' or TenKhachHang like 'H%' or TenKhachHang like 'T%' and Char_length(TenkhachHang)>=15;

/* mua 2020*/
select * from sanphamsach where maDMSach=(select maSanPham from donhang as a,chitietdonhang as b where (a.maDonHang=b.maDonHang) and year(a.ngayMuaHang)=2020); 

select * from sanphamdungcu where maDMDungCu=(
select maSanPham from donhang as a,chitietdonhang as b where (a.maDonHang=b.maDonHang) and year(a.ngayMuaHang)=2020); 

select * from quanlysach.sanphamdochoi where maDMDoChoi=(
select maSanPham from quanlysach.donhang as a,quanlysach.chitietdonhang as b where (a.maDonHang=b.maDonHang) and year(a.ngayMuaHang)=2020); 

/*tenkhach hang*/
select distinct *from khachHang ;

/*--Hiển thị thông tin tương ứng mỗi Khách hàng đã mua bao nhiêu sản phẩm trong Quý 4 của năm 2020.*/
select * from khachhang where MaKhachHang=(select maKhachHang from donhang where maDonHang=(select maDonHang from donhang as c where quarter(c.ngayMuaHang)=4));
