package ATMPackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class indexController {

    @RequestMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/register")
    public String AcountInfo(Model model) {
        model.addAttribute(new index());
        return "register"; //the next form am going to call
    }
@PostMapping("/register")
public @ResponseBody double processAccount(@ModelAttribute index index_object){
        double val = index_object.getBalance();

        return val;
    }
}