import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ListDoChoi {
    public static Scanner scanner = new Scanner(System.in);
    private List<SP_DoChoiTreEm> doChoiTreEmList;
    private FileDao doChoiTreEmDAO;

    public ListDoChoi() {
        doChoiTreEmDAO = new FileDao();
        doChoiTreEmList = doChoiTreEmDAO.readFileDoChoi();
    }
    public void add(){
        String MaSp =inputMaSP();
        String TenSp=inputTenSP();
        Integer SoLuong = inputSoLuong();
        Integer DonGia = inputDonGia();
        String DanhMuc = inputDanhMuc();
        String XuatXu = inputXuatXu();
        String ThuongHieu = inputThuongHieu();
        String NhaCC = inputNhaCC();
        String HDSD = inputHuongDSD();
        SP_DoChoiTreEm doChoiTreEm = new SP_DoChoiTreEm(MaSp,TenSp,SoLuong,DonGia,DanhMuc,XuatXu,ThuongHieu,NhaCC,HDSD);
        doChoiTreEmList.add(doChoiTreEm);
        doChoiTreEmDAO.ghiFiledochoi(doChoiTreEmList);

    }
    private String inputMaSP() {
        System.out.print("Input MASP: ");
        return scanner.nextLine();
    }
    private String inputTenSP() {
        System.out.print("Input TenSP: ");
        return scanner.nextLine();
    }
    private int inputSoLuong() {
        System.out.print("Input So Luong: ");
        return Integer.parseInt((scanner.nextLine()));
    }
    private int inputDonGia() {
        System.out.print("Input Don Gia: ");
        return  Integer.parseInt((scanner.nextLine()));
    }
    private String inputDanhMuc() {
        System.out.print("Input Danh Muc: ");
        return scanner.nextLine();
    }
    private String inputXuatXu() {
        System.out.print("Input Xuat Xu: ");
        return scanner.nextLine();
    }
    private String inputThuongHieu() {
        System.out.print("Input Thuong Hieu: ");
        return scanner.nextLine();
    }
    private String inputNhaCC() {
        System.out.print("Input Nha Cung Cap: ");
        return scanner.nextLine();
    }
    private String inputHuongDSD() {
        System.out.print("Input Huong Dan Su Dung: ");
        return scanner.nextLine();
    }
    public List<SP_DoChoiTreEm> getDoChoiTreEmList(){
        return doChoiTreEmList;
    }
    public void setDoChoiTreEmList(List<SP_DoChoiTreEm> SachList){
        this.doChoiTreEmList = doChoiTreEmList;
    }
    public void show() {
        for (SP_DoChoiTreEm doChoiTreEm : doChoiTreEmList) {
            System.out.format("%s |", doChoiTreEm.getMaSanPham());
            System.out.format("%5s |", doChoiTreEm.getTenSanPham());
            System.out.format("%5d |", doChoiTreEm.getSoluong());
            System.out.format("%5d |", doChoiTreEm.getDongia());
            System.out.format("%5s |", doChoiTreEm.getTenDM());
            System.out.format("%5s |", doChoiTreEm.getXuatXu());
            System.out.format("%5s |", doChoiTreEm.getThuongHieu());
            System.out.format("%5s |", doChoiTreEm.getNhaCC());
            System.out.format("%5s \n", doChoiTreEm.getHuongDanSD());

        }
    }
}
