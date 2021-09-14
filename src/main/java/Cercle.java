package main.java;

public class Cercle extends Figura{
    private double r;

    public Cercle(double r) {
        this.r = r;
    }

    public double area(){
        return Math.PI * Math.pow(this.r, 2);
    }
}
