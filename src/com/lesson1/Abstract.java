package com.lesson1;

public class Abstract {
    public static void main(String[] args) {
        Square f1 = new Square(4);
        f1.setWidth(10);
        f1.getPerimeter();
        Bird b1 = new Bird();
        b1.abc();
        int b = 2147483647;
        System.out.println(b+2);
        String name;
    }
}

interface Flyable{
    int count = 0;
    default int getName(){
        int i = 0;
        return i;};
    public abstract void abc();
    static void main() {
        System.out.println("main method");
    }
}

class Bird implements Flyable {
    public void abc() {
        System.out.println("abc method");
    }

}

abstract class Figura {
    public int countOfSide;

    public Figura(int countOfSide) {
        this.countOfSide = countOfSide;
    }

    abstract void getPerimeter();
    abstract void getSize();
}

class Square extends Figura {
//    private int countOfSide = 4;
    private int width;

    public Square(int countOfSide) {
        super(countOfSide);
//         this.countOfSide = countOfSide;
//        System.out.println("square");
    }

    @Override
    public void getPerimeter() {
        System.out.println("The perimeter of square is " + (width * 4));
    }
    @Override
    public void getSize() {
        System.out.println("The size of square is " + (width * width));
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

