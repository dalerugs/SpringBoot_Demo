package jccm.PEPSOL.controller;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class HomeController {

    private String appMode;

    public HomeController(Environment environment) {
        this.appMode = environment.getProperty("app-mode");
    }

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("datetime",new Date());
        model.addAttribute("username","dalerugs");
        model.addAttribute("admin",false);
        model.addAttribute("appMode",appMode);
        return "index";
    }
}
