import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KhachHang {
    protected String MaKH;
    protected String HoTen;
    protected int Sdt;
    protected String Email = "^\\w+@\\+(\\.\\w+){1,2}$";
    protected Date NgaySinh;
    protected String LoaiKH;

    public KhachHang(String maKH, String hoTen, int sdt, String email, Date ngaySinh, String loaiKH) {
        MaKH = maKH;
        HoTen = hoTen;
        Sdt = sdt;
        Email = email;
        NgaySinh = ngaySinh;
        LoaiKH = loaiKH;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getSdt() {
        return Sdt;
    }

    public void setSdt(int sdt) {
        Sdt = sdt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Pattern pattern = Pattern.compile(Email);
        Email = email;
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()==false){
            System.out.println("dia chi email bạn nhap sai");
        }
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getLoaiKH() {
        return LoaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        LoaiKH = loaiKH;
    }
}
