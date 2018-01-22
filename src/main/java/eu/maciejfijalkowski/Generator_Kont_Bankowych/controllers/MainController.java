package eu.maciejfijalkowski.Generator_Kont_Bankowych.controllers;

import eu.maciejfijalkowski.Generator_Kont_Bankowych.models.Banki;
import eu.maciejfijalkowski.Generator_Kont_Bankowych.models.Tekst;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("banki", Banki.BankiMapa());
        modelMap.addAttribute("txt", Tekst.getT());
        return "index";
    }
}
