package ru.mirea.program2;

public class TestBall {
    /*По UML диаграмме класса, представленной на рис. 2.5 написать
программу, которая состоит из двух классов. Один из них Ball должен
реализовывать сущность мяч, а другой с названием TestBall тестировать работу
созданного класса. Класс Ball должен содержать реализацию методов,
представленных на UML. Диаграмма на рисунке описывает сущность Мяч
написать программу. Класс Ball моделирует движущийся мяч.*/
    public static void main(String[] args) {
        Ball b = new Ball();
        System.out.println(b);
        b.setXY(4.5, 2.7);
        System.out.println(b);
        b.move(5, 0.9);
        System.out.println(b);
    }
}
