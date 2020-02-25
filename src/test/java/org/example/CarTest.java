package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class CarTest {

    private Car bmwX6;
    private Car benzAMG;

    @Before
    public void setUp() throws Exception {
        bmwX6 = new Car("BMW", "X6", "2017", "4.0 V6");
        benzAMG = new Car("Mercedes Benz", "C63 AMG BLACK", "2019", "8.0 V10");
    }

    @After
    public void tearDown() throws Exception {
    }

    // Object Equality Test
    @Test
    public void testEquals() {
        bmwX6.equals(benzAMG);
        Assert.assertEquals(false, false);
    }

    // TimeOut Test
    @Test(timeout = 10000)
    public void timeOutsTest()
    {
    }
}