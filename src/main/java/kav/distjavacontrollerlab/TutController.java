package kav.distjavacontrollerlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tutorial")
public class TutController {
    @RequestMapping("/css")
    public String showCss(){
        return "pages/css";
    }

    @RequestMapping("/html")
    public String showHtml(){
        return "pages/html";
    }
    @RequestMapping("/netlify")
    public String showNetlify(){
        return "pages/netlify";
    }

    @RequestMapping("/redirect-project")
    public String showProject(){
        return "redirect:https://clever-montalcini-0f08c5.netlify.app/index.html";
    }
}
