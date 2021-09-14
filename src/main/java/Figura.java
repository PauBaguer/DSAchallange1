package main.java;

public abstract class Figura implements Comparable<Figura> {

    public abstract double area(); //no hi ha implementació, ja que no hi ha {}


    //retorna enter negatiu: es mes petit
    //retorna 0 si són iguals
    //retorna enter positiu si és més gran
    @Override
    public int compareTo(Figura f) {
        return (Double.compare(this.area(), f.area()));
    }
}
