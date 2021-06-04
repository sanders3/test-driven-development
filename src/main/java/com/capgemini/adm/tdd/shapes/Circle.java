package com.capgemini.adm.tdd.shapes;

public final class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        if (radius < 0.0) {
            throw new IllegalArgumentException("Negative radius: [" + radius + "]");
        }

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2.0 * radius;
    }

    @Override
    public int getNumberOfSides() {
        return 1;
    }
}