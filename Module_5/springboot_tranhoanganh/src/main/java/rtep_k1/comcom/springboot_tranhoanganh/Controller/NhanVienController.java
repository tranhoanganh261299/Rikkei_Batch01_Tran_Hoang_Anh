package rtep_k1.comcom.springboot_tranhoanganh.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import rtep_k1.comcom.springboot_tranhoanganh.Model.NhanVien;
import rtep_k1.comcom.springboot_tranhoanganh.Services.NhanVienService;
import rtep_k1.comcom.springboot_tranhoanganh.Services.NhanVienServiceIplm;

import java.util.List;

@Controller
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienServiceIplm;
    @GetMapping("/nhanvien")
    public String tableNhanVien(Model model){
        List<NhanVien>listnv = nhanVienServiceIplm.listAll();
        model.addAttribute("listnv",listnv);
        return "table_nhanvien";
    }
}
