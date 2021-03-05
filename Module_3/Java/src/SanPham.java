public abstract class SanPham {
    private String maSP;
    private String tenSp;
    private int soLuong;
    private float donGia;
    private String maDM;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSp, int soLuong, float donGia, String maDM) {
        this.maSP = maSP;
        this.tenSp = tenSp;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.maDM = maDM;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public String getMaDM() {
        return maDM;
    }

    public void setMaDM(String maDM) {
        this.maDM = maDM;
    }
    //public abstract void NhapThongTin();
    public abstract void HienThiThongTin();
    public abstract double PhanTramGiamGia(String loaikh);
}
