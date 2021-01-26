package me.whiteship.springinit.thymeleaf;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafSampleController {

    @GetMapping("/thymeleaf/hello")
    public String thymeleafHello(Model model){
        model.addAttribute("name", "heeju");
        return "hello";
    }
}
