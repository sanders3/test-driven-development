package com.capgemini.adm.tdd;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

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
        assertThat( true, is(true) );
        assertThat("hello, world", containsString("llo") );
    }
}
