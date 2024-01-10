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
    public void testCalcArea() {
        double area = this.romb.calcArea(20.0);
        double expected = Assert.assertEquals(actual, expected, );
    }

}