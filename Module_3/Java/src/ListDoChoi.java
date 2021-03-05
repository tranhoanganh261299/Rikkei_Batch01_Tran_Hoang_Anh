import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ListDoChoi {
    public static Scanner sc = new Scanner(System.in);
    private List<SP_DoChoiTreEm> DoChoiList;
    private FileDao fileDao;

    public ListDoChoi() {
        fileDao  = new FileDao();
        DoChoiList = fileDao.readFileDoChoi();
    }
    public  void  add(){
        String maSP= inPutMasp();
        String tenSp= inPutSach();
        int soluong= inPutSL();
        float dongia= inPutDonGia();
        String danhmuc= inputDanhMuc();
        String inputXX= inputXX();
        String thuonghieu= inputThuongHieu();
        String nhacc= NhaCC();
        String huongdan= inputHD();
        String mau = mauL();
        String chatlieu= inputCL();
        float kichthuoc = inputKT();
        SP_DoChoiTreEm dochoi = new SP_DoChoiTreEm(maSP, tenSp,soluong,dongia, danhmuc, inputXX, thuonghieu, nhacc, huongdan, mau,chatlieu, kichthuoc);
        DoChoiList.add(dochoi);
        fileDao.ghiFiledochoi(DoChoiList);

    }



    public String inPutMasp(){
        System.out.println("nhap ma sp");
        return sc.nextLine();
    }
    public String inPutSach(){
        System.out.println("Nhap ten san sp");
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
    public String inputXX(){
        System.out.println("Xuat xu");
        return sc.nextLine();
    }
    public String inputThuongHieu(){
        System.out.println("Thuong hieu");
        return sc.nextLine();
    }
    public String NhaCC(){
        System.out.println("ncc");
        return sc.nextLine();
    }
    public String inputHD(){
        System.out.println("Huong dan su dung");
        return sc.nextLine();
    }
    public String mauL(){
        System.out.println("Mau Sac");
        return sc.nextLine();
    }
    public String inputCL(){
        System.out.println("Chat Lieu");
        return sc.nextLine();
    }
    public float inputKT(){
        System.out.println("KichThuoc");
        return Float.parseFloat(sc.nextLine());
    }

}
