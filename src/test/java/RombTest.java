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
import java.util.InputMismatchException;

import lan.zold.Romb;

public class RombTest {
    Romb romb;

    @BeforeTest
    public void setUp() {
        this.romb = new Romb();

    }

    @Test
    public void calcArea_20_25() {
        double actual = this.romb.calcArea(20, 25);
        double expected = 250;
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test
    public void calcArea_35_40() {
        double actual = this.romb.calcArea(35, 40);
        double expected = 700;
        Assert.assertEquals(actual, expected, 0.1);

    }

    @Test(expectedExceptions = InputMismatchException.class)

    public void calcArea_20_0() {
        this.romb.calcArea(20, 0);
    }

    @Test(expectedExceptions = InputMismatchException.class)
    public void calcArea_0_30() {
        this.romb.calcArea(0, 30);

    }

    @Test
    public void calcPerim_10() {
        double actual = this.romb.calcPerim(10);
        double expected = 40.0;
        Assert.assertEquals(expected, actual);
    }

    @Test
        public void calcPerim_11() {
        double actual = this.romb.calcPerim(11);
        double expected = 44.0;
        Assert.assertEquals(expected, actual);
    }