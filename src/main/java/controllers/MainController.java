package controllers;

import models.Banki;
import models.Tekst;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/")
    public String index(ModelMap modelMap){



        modelMap.addAttribute("banki", new Banki());
        modelMap.addAttribute("txt", Tekst.getT());

        return "index";
    }
}
