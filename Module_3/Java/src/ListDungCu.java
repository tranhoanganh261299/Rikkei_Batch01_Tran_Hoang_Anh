import java.util.List;
import java.util.Scanner;

public class ListDungCu {
    public static Scanner scanner = new Scanner(System.in);
    private List<SP_DoDungHocTap> DungCuList;
    private FileDao fileDao;

    public ListDungCu() {
        fileDao  = new FileDao();
        DungCuList = fileDao.readFileDungCu();
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
        String MauSac = inputMauSac();
        String ChatLieu = inputChatLieu();
        String KichThuoc = inputKichThuoc();
        SP_DoDungHocTap dungCuHocTap = new SP_DoDungHocTap(MaSp,TenSp,SoLuong,DonGia,DanhMuc,XuatXu,ThuongHieu,NhaCC,HDSD,MauSac,ChatLieu,KichThuoc);
        DungCuList.add(dungCuHocTap);
        fileDao.ghiFileDungCu(DungCuList);

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
    private String inputMauSac() {
        System.out.print("Input Mau Sac: ");
        return scanner.nextLine();
    }
    private String inputChatLieu() {
        System.out.print("Input Chat Lieu: ");
        return scanner.nextLine();
    }
    private String inputKichThuoc() {
        System.out.print("Input Kich Thuoc: ");
        return scanner.nextLine();
    }
    public List<SP_DoDungHocTap> getDungCuHocTapList(){
        return DungCuList;
    }
    public void setDungCuHocTapList(List<SP_DoDungHocTap> dungCuHocTapListList){
        this.DungCuList = dungCuHocTapListList;
    }
    public void show() {
        for (SP_DoDungHocTap dungCuHocTap : DungCuList) {
            System.out.format("%s |", dungCuHocTap.getMaSanPham());
            System.out.format("%5s |", dungCuHocTap.getTenSanPham());
            System.out.format("%5d |", dungCuHocTap.getSoluong());
            System.out.format("%5d |", dungCuHocTap.getDongia());
            System.out.format("%5s |", dungCuHocTap.getTenDM());
            System.out.format("%5s |", dungCuHocTap.getXuatXu());
            System.out.format("%5s |", dungCuHocTap.getThuongHieu());
            System.out.format("%5s |", dungCuHocTap.getNhaCC());
            System.out.format("%5s |", dungCuHocTap.getHuongDanSD());
            System.out.format("%5s |", dungCuHocTap.getMauSac());
            System.out.format("%5s |", dungCuHocTap.getChatLieu());
            System.out.format("%5s\n", dungCuHocTap.getKichThuoc());

        }
    }
}
