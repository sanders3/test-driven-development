package com.capgemini.adm.tdd.shapes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleTest {
    @Test
    public void testAreaOfCircle() {
        Circle circle = new Circle(5.0);
        assertEquals("The area of a circle with radius 5 is 78.54.", 78.54, circle.getArea(), 0.001);
    }

    @Test
    public void testCircumferenceOfCircle() {
        Circle circle = new Circle(5.0);
        assertEquals("The circumference of a circle with radius 5 is 31.416", 31.416, circle.getCircumference(), 0.0001);
    }

    @Test
    public void testSidesOfCircle() {
        Circle circle = new Circle(5.0);
        assertThat("A circle doesn't have sides", circle.getSides(), is(0));
    }

    @Test
    public void testDiameterOfCircle() {
        Circle circle = new Circle(5.0);
        assertThat("A circle has a diameter which is twice radius", circle.getDiameter(), is(2 * circle.getRadius()));

    }
}
