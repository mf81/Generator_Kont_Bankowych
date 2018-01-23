package eu.maciejfijalkowski.Generator_Kont_Bankowych.controllers;

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

    @GetMapping("/generate")
    public String indexAfterGenerate(){
        return "redirect:/";
    }

    @PostMapping("/generate")
    public String chooseBank (@RequestParam(value="section") String sectionValue,BankiZbior bankiZbior,ModelMap modelMap){

        if (sectionValue.equals("0")) {
            modelMap.addAttribute("nazwaBanku", bankiZbior.getSelection(0).getName().toUpperCase());
            modelMap.addAttribute("bankNumber", bankiZbior.getSelection(0).getBankNumber());
            return "pko";
        }
        if (sectionValue.equals("1")) {
            modelMap.addAttribute("nazwaBanku",bankiZbior.getSelection(1).getName().toUpperCase());
            modelMap.addAttribute("bankNumber", bankiZbior.getSelection(1).getBankNumber());
            return "pocztowy";
        }
        if (sectionValue.equals("2")) {
            modelMap.addAttribute("nazwaBanku",bankiZbior.getSelection(2).getName().toUpperCase());
            modelMap.addAttribute("bankNumber", bankiZbior.getSelection(2).getBankNumber());
            return "nord";
        }

        modelMap.addAttribute("bankiZObiektu", bankiZbior.getListaBankow());
        return "index";
    }
}
