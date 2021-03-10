package rtep_k1.comcom.springboot_tranhoanganh.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import rtep_k1.comcom.springboot_tranhoanganh.Model.NhanVien;
import rtep_k1.comcom.springboot_tranhoanganh.Services.NhanVienService;
import rtep_k1.comcom.springboot_tranhoanganh.Services.NhanVienServiceIplm;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller

public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienServiceIplm;
    @GetMapping("/nhanvien")
    public String tableNhanVien(Model model){
        List<NhanVien>listnv = nhanVienServiceIplm.listAll();
        model.addAttribute("listnv",listnv);
        return "/nhanvien/table_nhanvien";
    }
   /* @GetMapping("/nhanvien")
    public String homeNhanVien(Model model, HttpServletRequest request, RedirectAttributes redirect){
        request.getSession().setAttribute("employeelist",null);
        if(model.asMap().get("success")!=null){
            redirect.addFlashAttribute("success",model.asMap().get("success").toString());
        }
        return "redirect:/nhanvien/table_nhanvien";
    }
    @GetMapping("/nhanvien/page/{pageNumber}")
    public String tableNhanVien(Model model, HttpServletRequest request,@PathVariable int pagenumber){
        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("employeelist");
        int pagesize = 6;
        List<NhanVien>list = (List<NhanVien>)nhanVienServiceIplm.listAll()
        request.getSession().setAttribute("employeelist",null);
        if(model.asMap().get("success")!=null){
            redirect.addFlashAttribute("success",model.asMap().get("success").toString());
        }
        return "redirect:/nhanvien/table_nhanvien";
    }*/
    @GetMapping("/nhanvien/create")
    public String createNhanVien(Model model){
        model.addAttribute("employment",new NhanVien());
        return "/nhanvien/create";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveNhanVien(@ModelAttribute("nhanVien") NhanVien nhanVien) {
        nhanVienServiceIplm.save(nhanVien);
        return "redirect:/nhanvien";
    }
    @RequestMapping("/edit/{MaNhanVien}")
    public ModelAndView showEditProductPage(@PathVariable(name = "MaNhanVien") int MaNhanVien) {
        ModelAndView mav = new ModelAndView("/nhanvien/edit_nhanvien");
        NhanVien nhanVien = nhanVienServiceIplm.get(MaNhanVien);
        mav.addObject("nhanVien",  nhanVien);
        return mav;
    }

    @RequestMapping("/delete/{MaNhanVien}")
    public String deleteProduct(@PathVariable(name = "MaNhanVien") int MaNhanVien) {
        nhanVienServiceIplm.delete(MaNhanVien);
        return "redirect:/nhanvien";
    }
}
