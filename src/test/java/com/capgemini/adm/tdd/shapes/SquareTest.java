package com.capgemini.adm.tdd.shapes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {
    @Test
    public void testAreaOfSquare() {
        Square square = new Square(5.0);
        assertEquals("The area of a square with side 5 is 25.", 25.0, square.getArea(), 0.001);
    }

    @Test
    public void testPerimeterOfSquare() {
        Square square = new Square(5.0);
        assertEquals("The perimeter of a square with side 5 is 20.", 20.0, square.getPerimeter(), 0.001);
    }

    @Test
    public void testNumberOfSidesOfSquare() {
        Square square = new Square(5.0);
        assertEquals("A square has 4 sides.", 4, square.getNumberOfSides());
    }
}
