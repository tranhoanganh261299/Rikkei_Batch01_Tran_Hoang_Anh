package rtep_k1.comcom.springboot_tranhoanganh.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloController {
    @GetMapping("/a")
    public String showMessage(){
        return ("index");
    }
}
