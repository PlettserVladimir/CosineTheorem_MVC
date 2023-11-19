package org.top.CosineTheorem.entity;

import java.text.DecimalFormat;

public class Solution {
    private Double result;
    private static final String format = "#0.00";


    public Solution(){}

    public Solution(Double result){
        this.result = result;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
    public String toString(){
        String formatDouble = new DecimalFormat(format).format(result);
        return "Найдена сторона равна "+formatDouble;
    }
}
