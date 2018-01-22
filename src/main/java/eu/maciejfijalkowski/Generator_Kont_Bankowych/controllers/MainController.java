package eu.maciejfijalkowski.Generator_Kont_Bankowych.controllers;

import eu.maciejfijalkowski.Generator_Kont_Bankowych.models.Banki;
import eu.maciejfijalkowski.Generator_Kont_Bankowych.models.Tekst;
import eu.maciejfijalkowski.Generator_Kont_Bankowych.models.services.BankiZbior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @Autowired
    BankiZbior bankiZbior;

    @GetMapping("/")
    public String index(ModelMap modelMap, BankiZbior bankiZbior){

        modelMap.addAttribute("bankiZObiektu", bankiZbior.getListaBankow());


        modelMap.addAttribute("banki", new Banki().BankiMapa().entrySet());
        modelMap.addAttribute("txt", Tekst.getT());
        return "index";
    }
}
