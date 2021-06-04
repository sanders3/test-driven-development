package com.capgemini.adm.tdd;

import static org.junit.Assert.assertTrue;

import javax.naming.InitialContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AppMockTest {

    @Mock private InitialContext initialContext;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        System.err.println("... quick test ...");
        assertTrue( true );
    }
}
