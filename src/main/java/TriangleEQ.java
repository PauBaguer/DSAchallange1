package main.java;

public class TriangleEQ extends Figura{
    private double b;
    private double h;

    public TriangleEQ(double b, double h) {
        this.b = b;
        this.h = h;
    }
    public double area(){
        return this.b * this.h / 2;
    }
}
