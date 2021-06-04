package com.capgemini.adm.tdd.shapes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ShapesTest {
    @Test
    public void testTotalAreaOfThreeSquares() {
        List<Square> squares = new ArrayList<>();
        squares.add(new Square(1.0));
        squares.add(new Square(2.0));
        squares.add(new Square(3.0));
        double total = 0.0;
        for (Square square : squares) {
            total += square.getArea();
        }

        assertThat(total, is(14.0));
    }

    @Test
    public void testTotalAreaOfMixOfShapes() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(1.0));
        shapes.add(new Square(2.0));
        shapes.add(new Square(3.0));
        double total = 0.0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }

        assertThat(total, is(Math.PI + 13.0));
    }

    @Test
    public void testTotalPerimeterOfThreeSquares() {
        List<Square> squares = new ArrayList<>();
        squares.add(new Square(1.0));
        squares.add(new Square(2.0));
        squares.add(new Square(3.0));
        double total = 0.0;
        for (Square square : squares) {
            total += square.getPerimeter();
        }

        assertThat(total, is(4.0 + 8.0 + 12.0));
    }

    @Test
    public void testTotalPerimeterOfThreeMixedShapes() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(1.0));
        shapes.add(new Square(2.0));
        shapes.add(new Square(3.0));
        double total = 0.0;
        for (Shape shape : shapes) {
            total += shape.getPerimeter();
        }

        assertThat(total, is((Math.PI * 2) + 8.0 + 12.0));
    }}
