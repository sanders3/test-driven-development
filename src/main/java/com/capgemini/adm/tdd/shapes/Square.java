package com.capgemini.adm.tdd.shapes;

public class Square implements Shape {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public int getNumberOfSides() {
        return 4;
    }
}
