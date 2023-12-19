package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }
    @GetMapping(value = "/about")
    ModelAndView about(@RequestParam HashMap<String, String> queryStringParams) {
        ModelAndView modelAndView = new ModelAndView(viewName:"about");

        String name = queryStringParams.get(key:"name");

        String id = queryStringParams.get(key:"id");
        String title = queryStringParams.get(key:"title");
        String description = queryStringParams.get(key:"descripiton");

        // CsvManager manager = new CsvManager(CsvManager)
    }

}
