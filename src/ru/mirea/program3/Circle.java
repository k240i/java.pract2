package ru.mirea.program3;

public class Circle {
    private Point o;

    private double r;
    public Circle(Point o, double r){
        this.o=o;
        this.r=r;
    }
    public Circle(){}

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Point getO() {
        return o;
    }

    public void setO(Point o) {
        this.o = o;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "o=" + o +
                ", r=" + r +
                '}';
    }
}
