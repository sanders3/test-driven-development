package com.capgemini.adm.tdd.shapes;

public class Square {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

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
