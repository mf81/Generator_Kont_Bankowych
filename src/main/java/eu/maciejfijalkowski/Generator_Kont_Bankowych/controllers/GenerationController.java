package eu.maciejfijalkowski.Generator_Kont_Bankowych.controllers;

import eu.maciejfijalkowski.Generator_Kont_Bankowych.models.services.ADMZbior;
import eu.maciejfijalkowski.Generator_Kont_Bankowych.models.services.BankiZbior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GenerationController {


    @GetMapping("/generatenumber")
    public String indexAfterGenerateNumber(){
        return "redirect:/";
    }


}
