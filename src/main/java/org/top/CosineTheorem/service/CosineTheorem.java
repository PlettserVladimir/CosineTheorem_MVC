package org.top.CosineTheorem.service;

import org.springframework.stereotype.Service;

@Service
public class CosineTheorem implements FindingAThirdParty{
    @Override
    public Double finding(Double a, Double b, Double alfa, Boolean isRadian) {
        //A² = b² + c² - 2bc cos α
        double result= 0;
        if (isRadian){
           result = Math.pow(a,2) + Math.pow(b,2) - (2*a*b)*Math.cos(alfa);
        }
        return Math.pow(result,2);
    }
}
