package org.top.CosineTheorem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.top.CosineTheorem.entity.Coefficient;
import org.top.CosineTheorem.entity.Solution;
import org.top.CosineTheorem.service.FindingAThirdParty;

@Controller
public class CosineTheoremController {

    private final FindingAThirdParty findingAThirdParty;

    public CosineTheoremController(FindingAThirdParty findingAThirdParty){
        this.findingAThirdParty = findingAThirdParty;
    }
    @GetMapping("theorem")
    public String theorem(Model model){
        Coefficient emtyCoefficient = new Coefficient(1,2,3,true);
        model.addAttribute("coefficient",emtyCoefficient);
        return "cosine-theorem";

    }

    @PostMapping("cosine-theorem")
    public String cosineTheorem(Coefficient coefficient, Model model){
        System.out.println(">получены коэффициенты "+coefficient);
        try{
            Solution solution = findingAThirdParty.finding(coefficient);
            System.out.println("<Получено решение "+solution);
            model.addAttribute("solution",solution);
        }catch (IllegalArgumentException er){
            model.addAttribute("errorMessage",er.getMessage());
        }
        return "cosine-theorem";
    }
}
