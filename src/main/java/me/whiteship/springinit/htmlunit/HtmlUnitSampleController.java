package me.whiteship.springinit.htmlunit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlUnitSampleController {

    @GetMapping("/htmlunit/hello")
    public String htmlUnitHello(Model model){
        model.addAttribute("name", "heeju");
        return "hello";
    }

}
