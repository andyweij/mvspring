package demo.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class RequestParamExampleController {
     
    @RequestMapping(value="/user", method = RequestMethod.POST)
    public String userInfo(Model model, @RequestParam(value = "name", defaultValue = "Guest") String name ) {
 
        model.addAttribute("name", name);
 
        if("admin".equals(name)||!"name".isEmpty()) {
            model.addAttribute("email", "@demo.com");
        } else{
            model.addAttribute("email", "Not set");
        }
        return "userInfo";
    }
    
    @RequestMapping("/userui")
    public String userUI(Model model) {
 
        model.addAttribute("username", "admin"); 
      
        return "userform";
    }
  
}
