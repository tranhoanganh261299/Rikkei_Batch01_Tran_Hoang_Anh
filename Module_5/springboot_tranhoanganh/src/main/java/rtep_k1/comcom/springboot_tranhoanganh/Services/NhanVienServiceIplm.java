package rtep_k1.comcom.springboot_tranhoanganh.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rtep_k1.comcom.springboot_tranhoanganh.Model.NhanVien;
import rtep_k1.comcom.springboot_tranhoanganh.Repositorys.NhanVienRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class NhanVienServiceIplm {
    @Autowired
    private NhanVienRepository nhanVienRepository;
    public List<NhanVien>listAll(){
        return nhanVienRepository.findAll();
    }
}
