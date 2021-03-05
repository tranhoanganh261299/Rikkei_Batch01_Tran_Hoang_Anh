import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SP_DoDungHocTap extends SanPham{
    private String xuatXu;
    private String thuongHieu;
    private String ncc;
    private String hdsd;

    public SP_DoDungHocTap() {
        super();
    }

    /*@Override
    public void NhapThongTin() {
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
        System.out.println("Xuat xu");
        xuatXu = sc.nextLine();
        System.out.println("Thuong hieu");
        thuongHieu = sc.nextLine();
        System.out.println("ncc");
        ncc = sc.nextLine();
        System.out.println("Huong dan su dung");
        hdsd = sc.nextLine();
    }*/

    public SP_DoDungHocTap(String maSP, String tenSp, int soLuong, float donGia, String maDM, String xuatXu, String thuongHieu, String ncc, String hdsd) {
        super(maSP, tenSp, soLuong, donGia, maDM);
        this.xuatXu = xuatXu;
        this.thuongHieu = thuongHieu;
        this.ncc = ncc;
        this.hdsd = hdsd;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getNcc() {
        return ncc;
    }

    public void setNcc(String ncc) {
        this.ncc = ncc;
    }

    public String getHdsd() {
        return hdsd;
    }

    public void setHdsd(String hdsd) {
        this.hdsd = hdsd;
    }

    @Override
    public void HienThiThongTin() {
        System.out.println("Ma SP" + getMaSP());
        System.out.println("Ten SP" + getTenSp());
        System.out.println("So luong SP" + getSoLuong());
        System.out.println("Don Gia SP" + getDonGia());
        System.out.println("Danh Muc SP" + getMaDM());
        System.out.println("Xuat xu SP" + xuatXu);
        System.out.println("Thuong hieu SP" + thuongHieu);
        System.out.println("Nha cung cap SP" + ncc);
    }

    @Override
    public double PhanTramGiamGia(String loaikh) {
        return  loaikh.equals("Thuong")? 0.1:loaikh.equals("Vip1")?0.3:0.7;
    }
}
