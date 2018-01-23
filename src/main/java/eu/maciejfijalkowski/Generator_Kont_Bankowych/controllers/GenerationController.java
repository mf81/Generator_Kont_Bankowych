package eu.maciejfijalkowski.Generator_Kont_Bankowych.controllers;

import eu.maciejfijalkowski.Generator_Kont_Bankowych.models.FinalAccountNumber;
import eu.maciejfijalkowski.Generator_Kont_Bankowych.models.services.ADMZbior;
import eu.maciejfijalkowski.Generator_Kont_Bankowych.models.services.BankiZbior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GenerationController {


//    @PostMapping("/generatenumber")
//    public String indexAfterGenerateNumber(
//                                            @ModelAttribute(value="nazwaBanku") String nazwaBanku,
//                                            @ModelAttribute(value="bankNumber") String bankNumber,
//                                            @ModelAttribute(value="numberEF") String numberEF,
//                                            @ModelAttribute(value="admNumber") String admNumber,
//                                            @ModelAttribute(value="nazwaWM") String nazwaWM,
//                                            @ModelAttribute(value="nazwaKlienta") String nazwaKlienta,
//                                            ModelMap modelMap)
//    {
//        modelMap.addAttribute("nazwaBanku",nazwaBanku);
//        modelMap.addAttribute("bankNumber",bankNumber);
//        modelMap.addAttribute("numberEF",numberEF);
//        modelMap.addAttribute("admNumber",admNumber);
//        modelMap.addAttribute("nazwaWM",nazwaWM);
//        modelMap.addAttribute("nazwaKlienta",nazwaKlienta);
//
//        return "generatenumber";
//    }

    @GetMapping("/generatenumber")
    public String indexAfterGenerate(){
        return "redirect:/";
    }

    @PostMapping("/generatenumber")
    public String indexAfterGenerateNumber(FinalAccountNumber finalAccountNumber)
    {
        //FinalAccountNumber finalAccountNumber
        //modelMap.addAttribute("finalAccountNumber",finalAccountNumber);
        return "generatenumber";
    }


}
