package com.capgemini.adm.tdd.shapes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CircleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testAreaOfCircle() {
        Circle circle = new Circle(5.0);
        assertEquals("The area of a circle with radius 5 is 78.54.", 78.54, circle.getArea(), 0.001);
    }

    @Test
    public void testPerimeterOfCircle() {
        Circle circle = new Circle(5.0);
        assertEquals("The circumference of a circle with radius 5 is 31.416", 31.416, circle.getPerimeter(), 0.0001);
    }

    @Test
    public void testSidesOfCircle() {
        Circle circle = new Circle(5.0);
        assertThat("A circle has one sides", circle.getNumberOfSides(), is(1));
    }

    @Test
    public void testDiameterOfCircle() {
        Circle circle = new Circle(5.0);
        assertThat("A circle has a diameter which is twice radius", circle.getDiameter(), is(2 * circle.getRadius()));

    }


    @Test
    public void checkNegativeRadiusRejected() {
        
        try {
            new Circle(-1.0);
            fail("exception should have failed");
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), containsString("Negative radius"));
            assertThat(e.getMessage(), containsString(" [-1.0]"));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNegativeRadiusRejected2() {
        new Circle(-1.0);
    }

    @Test
    public void checkNegativeRadiusRejected3() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Negative radius");
        thrown.expectMessage(" [-1.0]");
        
        new Circle(-1.0);
    }
    
    @Test
    public void checkNegativeRadiusRejected4() {

        assertThrows("negative radius rejected",
            IllegalArgumentException.class,
            () -> new Circle(-1.0));
    }

}

