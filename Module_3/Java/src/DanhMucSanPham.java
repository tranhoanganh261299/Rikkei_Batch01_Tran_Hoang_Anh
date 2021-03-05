public class DanhMucSanPham {
    private String id;
    private String tenDM;

    public DanhMucSanPham() {
    }

    public DanhMucSanPham(String id, String tenDM) {
        this.id = id;
        this.tenDM = tenDM;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDM() {
        return tenDM;
    }

    public void setTenDM(String tenDM) {
        this.tenDM = tenDM;
    }
}
