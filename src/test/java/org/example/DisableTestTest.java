package org.example;

import org.junit.*;

import static org.junit.Assert.*;

public class DisableTestTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    // Disable Test Using Ignore
    @Ignore
    @Test
    public void testMethodToBeDisabled() {
        Assert.assertEquals(90, 90);
    }
}