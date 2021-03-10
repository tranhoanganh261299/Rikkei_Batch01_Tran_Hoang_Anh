package rtep_k1.comcom.springboot_tranhoanganh.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rtep_k1.comcom.springboot_tranhoanganh.Model.NhanVien;
import rtep_k1.comcom.springboot_tranhoanganh.Repositorys.NhanVienRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class NhanVienService {
    @Autowired
    private NhanVienRepository repo;
    public List<NhanVien> listAll(){
        return repo.findAll();
    }
    public void save(NhanVien em){
        repo.save(em);
    }
    public NhanVien get(int maNV){
        return repo.findById(maNV).get();
    }
    public void delete(int maNV){
        repo.deleteById(maNV);
    }
}
