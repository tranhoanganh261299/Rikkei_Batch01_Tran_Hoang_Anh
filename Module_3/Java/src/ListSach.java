import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ListSach {
    public static Scanner sc = new Scanner(System.in);
    private List<SanPhamSach> SachList;
    private FileDao fileDao;

    public ListSach() {
       fileDao  = new FileDao();
       SachList = fileDao.readFile();
    }
    public  void  add(){
        String maSP= inPutMasp();
        String tenSach= inPutSach();
        int soluong= inPutSL();
        float dongia= inPutDonGia();
        String danhmuc= inputDanhMuc();
        String nhaXB= inputNXB();
        String namsx= inputNamXB();
        String tacgia= inputTacGia();
        Date ngayXB= inputNgay();
        int taiban =  inputTaiBan();
        SanPhamSach sach = new SanPhamSach(maSP, tenSach,soluong,dongia, danhmuc,nhaXB,namsx,tacgia,ngayXB,taiban);
        SachList.add(sach);
        fileDao.ghiFile(SachList);

    }
    public String inPutMasp(){
        System.out.println("nhap ma sach");
        return sc.nextLine();
    }
    public String inPutSach(){
        System.out.println("Nhap ten san sach");
        return (sc.nextLine());
    }
    public int inPutSL() {
        System.out.println("Nhap so luong");
        return (Integer.parseInt(sc.nextLine()));
    }
    public float inPutDonGia(){
        System.out.println("Don gia");
        return Float.parseFloat(sc.nextLine());
    }
    public String inputDanhMuc(){
        System.out.println("Danh Muc");
        return (sc.nextLine());
    }
    public String inputNXB(){
        System.out.println("Nha xuat ban");
        return sc.nextLine();
    }
     public String inputNamXB(){
         System.out.println("Nam xuat ban");
         String namXB = "^\\d{4}$";
         namXB = sc.nextLine();
         return namXB;
     }
     public String inputTacGia(){
         System.out.println("Tac gia");
         return sc.nextLine();
     }
    public Date inputNgay(){
        System.out.println("Ngay xuat ban");
        Date ngayXB = new Date();
        try {
            ngayXB = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ngayXB;
    }
     public int inputTaiBan(){
         System.out.println("Nhap Lan tai ban");
         return Integer.parseInt(sc.nextLine());
     }

}
