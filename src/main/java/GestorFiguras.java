package main.java;

import java.util.Arrays;

public class GestorFiguras {
    public static double suma(Figura[] o){
        double res = 0;
        for(Figura f : o){
            res += f.area();
        }
        return res;
    }

    public static void sort(Figura[] o){
        Arrays.sort(o);
    }

    public static void prettyPrint(Figura[] o){
        for (Figura f : o){
            System.out.println(".....................");
            System.out.println("Figura: " + f.getClass().getName());
            System.out.println("Area: " + f.area());
            System.out.println(".....................");
        }
    }

    public static void main(String[] args) {
        Figura[] arr = {new Rectangle(3, 6),new Quadrat(3), new Cercle(1), new TriangleEQ(4, 5)};
        System.out.println("=====Initial arr=====");
        GestorFiguras.prettyPrint(arr);

        System.out.println("=====Suma=====");
        System.out.println(GestorFiguras.suma(arr));

        System.out.println("=====Sort=====");
        GestorFiguras.sort(arr);
        GestorFiguras.prettyPrint(arr);
    }
}
