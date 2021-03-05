import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MainControl {



    public  void showMenu(){
        FileDao fileDao = new FileDao();
        ListDungCu listDungCu = new ListDungCu();
        ListDoChoi listDoChoi = new ListDoChoi();
        ListSach listSach= new ListSach();
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
                        choose = Integer.parseInt(input.nextLine());
                        String ch="y";
                        Scanner nhap = new Scanner(System.in);
                        switch (choose_1){
                           case 1:
                                while (ch.toLowerCase().equals("y")){
                                    listSach.add();
                                    System.out.println("Nhap y de tiep tuc va s de dung lai.");
                                    ch=nhap.nextLine();
                                }
                                break;
                            case 2:
                                while (ch.toLowerCase().equals("y")){
                                    listDoChoi.add();
                                    System.out.println("Nhap y de tiep tuc va s de dung lai.");
                                    ch=nhap.nextLine();
                                }
                                break;
                            case 3:
                                while (ch.toLowerCase().equals("y")){
                                    listDungCu.add();
                                    System.out.println("Nhap y de tiep tuc va s de dung lai.");
                                    ch=nhap.nextLine();
                                }
                                break;
                            case 4:
                                showMenu();
                        }
                    }
                    while (choose_1!=0);
                    break;
                case 2:
                    Scanner input_2 =new Scanner(System.in);
                    int choos_2 = input_2.nextInt();
                    // Them don hang
                    break;
                case 3:
                    Scanner input_3 =new Scanner(System.in);
                    int choose_3 = input_3.nextInt();
                    do{
                        System.out.println("1. Them sach");
                        System.out.println("2. Them do choi tre em");
                        System.out.println("3. Them do dung hoc tap");
                        System.out.println("4. Go to back");
                        switch (choose_3){
                            case 1:
                                System.out.println("=====Danh sach Sach=====");
                                fileDao.readFile();
                                break;
                            case 2:
                                System.out.println("=====Danh sach Do Choi Tre Em=====");
                                fileDao.readFileDoChoi();
                                break;
                            case 3:
                                System.out.println("=====Danh sach Do Dung Hoc Tap=====");
                                fileDao.readFileDungCu();
                                break;
                            case 4:
                                showMenu();
                                break;
                        }
                    }
                    while (choose_3!=0);
                case 4:
                    // hieen thi don hang
                    break;
                case 5:
                    
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
