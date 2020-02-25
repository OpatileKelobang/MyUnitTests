package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FailingTestTest {

    private Car toyota;
    private Car cressida;

    @Before
    public void setUp() throws Exception {
        toyota = new Car("Toyota", "Hilux", "2017", "2.7i");
        cressida = new Car("Toyota", "Cressida", "2004", "2.4i");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void comparison() {
        toyota.equals(cressida);
        Assert.assertEquals(false, true);
    }
}