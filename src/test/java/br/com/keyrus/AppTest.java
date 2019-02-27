package br.com.keyrus;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    public void testApp()
    {
        assertTrue( true );
    }

    @Test
    public void failingTest() {
        assertTrue(true);
    }
}
