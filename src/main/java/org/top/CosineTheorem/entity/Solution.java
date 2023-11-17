package org.top.CosineTheorem.entity;

public class Solution {
    private Double result;

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
        return "Найдена сторона равна "+result;
    }
}
