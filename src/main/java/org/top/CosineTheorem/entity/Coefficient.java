package org.top.CosineTheorem.entity;

public class Coefficient {
   private Double b;
    private Double c;
    private Double alfa;
    private Boolean isRadian;

    public Coefficient(){}

    public Coefficient(double b, double c, double alfa, boolean isRadian){
        this.b = b;
        this.c = c;
        this.alfa = alfa;
        this.isRadian = isRadian;
    }

    public Boolean getRadian() {
        return isRadian;
    }

    public void setRadian(Boolean radian) {
        isRadian = radian;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double getAlfa() {
        return alfa;
    }

    public void setAlfa(Double alfa) {
        this.alfa = alfa;
    }

    @Override
    public String toString(){
        return "Сторона b="+b+"Сторона с="+c+"Угол алфа="+alfa+"Радиан"+isRadian;
    }
}
