import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SanPhamSach extends SanPham{
    private String nhaXb;
    private String namXB = "^\\d{4}$";
    private String tenTG;
    private Date ngayXB;
    private int lanTaiBan;

    public SanPhamSach() {
        super();
    }

   // @Override
    /*public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma sach");
        setMaSP(sc.nextLine());
        System.out.println("Nhap ten san sach");
        setTenSp(sc.nextLine());
        System.out.println("Nhap so luong");
        setSoLuong(Integer.parseInt(sc.nextLine()));
        System.out.println("Don gia");
        setDonGia(sc.nextFloat());
        System.out.println("Danh Muc");
        setTenSp(sc.nextLine());
        System.out.println("Nha xuat ban");
        nhaXb = sc.nextLine();
        System.out.println("Nam xuat ban");
        namXB = sc.nextLine();
        System.out.println("Tac gia");
        tenTG = sc.nextLine();
        System.out.println("Ngay xuat ban");
        try {
            ngayXB = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Nhap Lan tai ban");
        lanTaiBan = Integer.parseInt(sc.nextLine());
    }*/

    public SanPhamSach(String maSP, String tenSp, int soLuong, float donGia, String maDM, String nhaXb, String namXB, String tenTG, Date ngayXB, int lanTaiBan) {
        super(maSP,tenSp,soLuong,donGia,maDM);
        this.nhaXb = nhaXb;
        this.namXB = namXB;
        this.tenTG = tenTG;
        this.ngayXB = ngayXB;
        this.lanTaiBan = lanTaiBan;
    }

    public String getNhaXb() {
        return nhaXb;
    }

    public void setNhaXb(String nhaXb) {
        this.nhaXb = nhaXb;
    }

    public String getNamXB() {
        return namXB;
    }

    public void setNamXB(String namXB) {
        this.namXB = namXB;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public Date getNgayXB() {
        return ngayXB;
    }

    public void setNgayXB(Date ngayXB) {
        this.ngayXB = ngayXB;
    }

    public int getLanTaiBan() {
        return lanTaiBan;
    }

    public void setLanTaiBan(int lanTaiBan) {
        this.lanTaiBan = lanTaiBan;
    }

    @Override
    public void HienThiThongTin() {
        System.out.println("Ma SP" + getMaSP());
        System.out.println("Ten SP" + getTenSp());
        System.out.println("So luong SP" + getSoLuong());
        System.out.println("Don Gia SP" + getDonGia());
        System.out.println("Danh Muc SP" + getMaDM());
        System.out.println("Nha xb SP" + nhaXb);
        System.out.println("Năm sx" + namXB);
        System.out.println("Tác gia" + tenTG);
        System.out.println("Ngay XB" + ngayXB);
        System.out.println("Lan tai ban" + lanTaiBan);
    }

    @Override
    public double PhanTramGiamGia(String loaikh) {
        return  loaikh.equals("Thuong")? 0.02:loaikh.equals("Vip1")?0.05:0.1;
    }

}
