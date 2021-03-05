import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class FileDao {

    private static final String FILE_NAME = "sach.csv";
    public void ghiFile(List<SanPhamSach>SachList){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(SachList);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    public List<SanPhamSach> readFile(){
        List<SanPhamSach> SachList = new ArrayList<>();
        FileInputStream fos = null;
        ObjectInputStream oos = null;
        try {
            fos = new FileInputStream(new File(FILE_NAME));
            oos = new ObjectInputStream(fos);
            SachList = (List<SanPhamSach>)oos.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            closeStream(fos);
            closeStream(oos);
        }
        return SachList;
    }

    public void ghiFiledochoi(List<SP_DoChoiTreEm>SachList){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File("dochoi_treem.csv"));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(SachList);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    public List<SP_DoChoiTreEm> readFileDoChoi(){
        List<SP_DoChoiTreEm> SachList = new ArrayList<>();
        FileInputStream fos = null;
        ObjectInputStream oos = null;
        try {
            fos = new FileInputStream(new File("dochoi_treem.csv"));
            oos = new ObjectInputStream(fos);
            SachList = (List<SP_DoChoiTreEm>)oos.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            closeStream(fos);
            closeStream(oos);
        }
        return SachList;
    }

    public void ghiFileDungCu(List<SP_DoDungHocTap>SachList){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File("dungcuhoctap.csv"));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(SachList);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    public List<SP_DoDungHocTap> readFileDungCu(){
        List<SP_DoDungHocTap> SachList = new ArrayList<>();
        FileInputStream fos = null;
        ObjectInputStream oos = null;
        try {
            fos = new FileInputStream(new File("dungcuhoctap.csv"));
            oos = new ObjectInputStream(fos);
            SachList = (List<SP_DoDungHocTap>)oos.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            closeStream(fos);
            closeStream(oos);
        }
        return SachList;
    }

    private void closeStream(OutputStream fos) {
        if(fos!=null){
            try{
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    private void closeStream(InputStream ins) {
        if (ins!=null){
            try{
                ins.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
