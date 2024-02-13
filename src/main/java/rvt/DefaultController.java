package rvt;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }
    @GetMapping(value = "/about")
    ModelAndView about(@RequestParam HashMap<String, String> queryStringParams) {
        ModelAndView modelAndView = new ModelAndView("about");

        String name = queryStringParams.get("name");

        String id = queryStringParams.get("id");
        String title = queryStringParams.get("title");
        String description = queryStringParams.get("descripiton");

        return modelAndView;

        // CsvManager manager = new CsvManager(CsvManager)
    }

    @GetMapping(value="/test")
    @ResponseBody()
    public String testAction() {
        String name = "John";

        return name;
    }

}
