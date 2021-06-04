package com.capgemini.adm.tdd;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private List<String> arguments = new ArrayList<>();
    private App unitUnderTest;

    @BeforeClass
    public static void setupClass() {
        System.out.println("before suite");
    }

    @AfterClass
    public static void teardownClass() {
        System.out.println("after class");
    }

    @Before
    public void setup() {
        System.out.println("before");
        arguments.add("hello");
        arguments.add("world");
        unitUnderTest = new App(arguments);
    }

    @After
    public void teardown() {
        System.out.println("after");
        arguments.clear();
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        System.err.println("... quick test ...");
        assertTrue( true );

        System.out.println("unit under test is " + unitUnderTest);
    }

    @Test
    public void anotherTest() {
        System.err.println("... another test ...");
        System.out.println("unit under test is " + unitUnderTest);

        assertEquals(2, unitUnderTest.getArguments().size());
        assertThat(unitUnderTest.getArguments(), hasSize(2));
        assertThat(unitUnderTest.getArguments(), contains("hello", "world"));
    }
}
