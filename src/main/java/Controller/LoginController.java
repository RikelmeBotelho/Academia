package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String home() {
        return "login";
    }

    @GetMapping("/registro")
    public String sla() {
        return "registro_alunos";
    }

    @GetMapping("/TESTE2")
    public String sla2() {
        return "sla2";
    }
}
