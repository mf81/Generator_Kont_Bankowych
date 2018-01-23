package eu.maciejfijalkowski.Generator_Kont_Bankowych.controllers;

import eu.maciejfijalkowski.Generator_Kont_Bankowych.models.BankiKlasa;
import eu.maciejfijalkowski.Generator_Kont_Bankowych.models.services.BankiZbior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    @Autowired
    BankiZbior bankiZbior;

    @GetMapping("/")
    public String index(ModelMap modelMap, BankiZbior bankiZbior){

        modelMap.addAttribute("bankiZObiektu", bankiZbior.getListaBankow());

        return "index";
    }



    @PostMapping("/generate")
    public String chooseBank (@RequestParam(value="section") String sectionValue,BankiZbior bankiZbior,ModelMap modelMap){

        if (sectionValue.equals("1")) {
            modelMap.addAttribute("nazwaBanku", bankiZbior.getSelection(0).getName().toUpperCase());
            return bankiZbior.getSelection(0).getName().toLowerCase();
        }
        if (sectionValue.equals("2")) {
            modelMap.addAttribute("nazwaBanku",bankiZbior.getSelection(1).getName().toUpperCase());
            return bankiZbior.getSelection(1).getName().toLowerCase();
        }
        if (sectionValue.equals("3")) {
            modelMap.addAttribute("nazwaBanku",bankiZbior.getSelection(2).getName().toUpperCase());
            return bankiZbior.getSelection(2).getName().toLowerCase();
        }

        modelMap.addAttribute("bankiZObiektu", bankiZbior.getListaBankow());
        return "index";
    }
}
