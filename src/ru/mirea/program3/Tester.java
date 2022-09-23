package ru.mirea.program3;

public class Tester {
    private int n;
    Circle[] poop = new Circle[n];
    public static void main(String[] args) {

        Point a = new Point();
        Circle b = new Circle();
        a.setXY(8.3, 9.6);
        b.setO(a);
        b.setR(9);
        System.out.println(b);

    }
}
