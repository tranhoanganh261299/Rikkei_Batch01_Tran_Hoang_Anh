import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MainControl {



    public  void showMenu(){

        Scanner input = new Scanner(System.in);
        int choose ;
        do{
            System.out.println("1. Thêm san pham");
            System.out.println("2. Thêm đon hang");
            System.out.println("3. Hien thi thong tin san pham");
            System.out.println("4. Hien thi don hang");
            System.out.println("5. Thoat");
            choose = input.nextInt();
            switch (choose){
                case 1:
                    Scanner input_1 =new Scanner(System.in);
                    int choose_1 = input_1.nextInt();
                    do{
                        System.out.println("1. Them sach");
                        System.out.println("2. Them do choi tre em");
                        System.out.println("3. Them do dung hoc tap");
                        System.out.println("4. Go to back");
                        choose = input.nextInt();
                        /*switch (choose_1){
                           case 1:
                                spsach.NhapThongTin();
                                System.out.println(nhap);
                                break;
                            case 2:
                               // sptreem.NhapThongTin();
                                break;
                            case 3:
                                sphoctap.NhapThongTin();
                                break;
                            case 4:
                                showMenu();
                        }*/
                    }
                    while (choose_1!=0);
                    break;
                case 2:
                    Scanner input_2 =new Scanner(System.in);
                    int choos_2 = input_2.nextInt();
                    // Them don hang
                    break;
                case 3:

            }
        }
        while (choose!=0);
        do{
            System.out.println("1. Nhap thong tin sach");
            System.out.println("2. Nhap thong tin do choi tre em");
            System.out.println("3. Nhap thong tin do dung hoc tap");
            System.out.println("4. Hien thi thong tin sach");
            System.out.println("5. Hien thi thong tin do choi tre em");
            System.out.println("6. Hien thi thong tin do dung hoc tap");
            System.out.println("7. Thoat");
            choose = input.nextInt();
            switch (choose){
                case 1:

            }
        }
        while (choose!=0);
    }
    public static void main(String[] args){

    }
}
