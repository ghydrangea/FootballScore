package football;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
    @GetMapping("/")
    public String welcome(Model model) {
    	model.addAttribute("message", "Civilized Land");
        return "/home";
    }
}
