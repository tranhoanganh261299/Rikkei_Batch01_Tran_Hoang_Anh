select * from khachhang where year(curdate())-year(ngaysinh)>16 and year(curdate())-year(ngaysinh)<30 or year(curdate())-year(ngaysinh)>40
select * from khachhang where TenKhachHang like 'K%' or TenKhachHang like 'H%' or TenKhachHang like 'T%' and Char_length(TenkhachHang)>=15
