import java.util.Scanner;

public class SP_DoChoiTreEm extends SanPham {
    private String xuatXu;
    private String thuongHieu;
    private String ncc;
    private String hdsd;
    private String mau;
    private String chatLieu;
    private float kichThuoc;

    public SP_DoChoiTreEm() {
        super();
    }

   /* @Override
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

    public SP_DoChoiTreEm(String maSP, String tenSp, int soLuong, float donGia, String maDM, String xuatXu, String thuongHieu, String ncc, String hdsd, String mau, String chatLieu, float kichThuoc) {
        super(maSP, tenSp, soLuong, donGia, maDM);
        this.xuatXu = xuatXu;
        this.thuongHieu = thuongHieu;
        this.ncc = ncc;
        this.hdsd = hdsd;
        this.mau = mau;
        this.chatLieu = chatLieu;
        this.kichThuoc = kichThuoc;
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

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public float getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(float kichThuoc) {
        this.kichThuoc = kichThuoc;
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
        System.out.println("Màu Sac" + mau);
        System.out.println("Chat Lieu SP" + chatLieu);
        System.out.println("Kich Thuoc SP" + kichThuoc);
    }

    @Override
    public double PhanTramGiamGia(String loaikh) {
        return  loaikh.equals("Thuong")? 0.2:loaikh.equals("Vip1")?0.5:0.7;
    }

}
