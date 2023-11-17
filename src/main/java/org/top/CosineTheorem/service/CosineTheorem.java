package org.top.CosineTheorem.service;

import org.springframework.stereotype.Service;
import org.top.CosineTheorem.entity.Coefficient;
import org.top.CosineTheorem.entity.Solution;

@Service
public class CosineTheorem implements FindingAThirdParty{

    @Override
    public Solution finding(Coefficient coefficient) {
        //A² = b² + c² - 2bc cos α
        Double b = coefficient.getB();
        Double c = coefficient.getC();
        Double alfa = coefficient.getAlfa();
        Boolean isRadian = coefficient.getRadian();
        double result;

        if (b == null || c == null || alfa == null || b < 0 || c<0 || alfa <0 ) {
            throw new IllegalArgumentException("invalid coefficients values");
        }
        if (!isRadian){
            alfa = Math.toRadians(alfa);
        }
           result =Math.sqrt(Math.pow(b,2) + Math.pow(c,2) - (2*c*b)*Math.cos(alfa));

        return new Solution(result);
    }
}
