package org.top.CosineTheorem.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @PostMapping("cosine-theorem")
    public String cosineTheorem(Coefficient coefficient, Model model){
        try{
            Solution solution = findingAThirdParty.finding(coefficient);
            model.addAttribute("solution",solution);
        }catch (IllegalArgumentException er){
            model.addAttribute("errorMessage",er.getMessage());
        }
        return "index";
    }
}
