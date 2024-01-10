/*
* File: Romb.java
* Author: Körömi Erik
* Copyright: 2024, Körömi Erik
* Date: 2024-01-10
* Web: https://github.com/
* Licenc: MIT
*
*/

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Romb;

public class RombTest {
    Romb romb;

    @BeforeTest
    public void setUp() {
        this.romb = new Romb();

    }

    @Test
    public void calcArea_20_25() {
        double area = this.romb.calcArea(20, 25);
        double expected = 250;
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test
    public void calcArea_35_40() {
        double area = this.romb.calcArea(35, 40);
        double expected = 700;
        Assert.assertEquals(actual, expected, 0.1);

    }
}