package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }
    @GetMapping(value = "/about")
    String aboutMeAction() {
        String name = "Alina";
        String surname = "Barišņikova";
        int age = 17;
        String group = "DP2-1";
        model.addAtribute("age", age)

        return "about";

    }
}
