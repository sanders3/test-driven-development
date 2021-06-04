package com.capgemini.adm.tdd;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Integration test for simple App.
 */
public class AppTestIT {

    @Before
    public void expensiveSetup() throws InterruptedException {
        System.err.println("... setting up an expensive test ...");
        Thread.sleep(10_000);
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAlsoAnswerWithTrue() {
        System.err.println("... running an expensive test ...");
        assertTrue( true );
    }
}
