package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.Assert;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnOneThousandJUnitJupiter() {
        int expected = service.remain(0);
        int actual = 1000;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnNineHundredAndNinetyNineJUnitJupiterA() {
        int expected = service.remain(1);
        int actual = 999;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnNineHundredAndNinetyNineJUnitJupiterB() {
        int expected = service.remain(1001);
        int actual = 999;
        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void shouldReturnOneJUnitJupiter() {
        int expected = service.remain(999);
        int actual = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnZeroJUnitJupiter() {
        int expected = service.remain(1000);
        int actual = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnOneThousandJUnit4() {
        int expected = service.remain(0);
        int actual = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnNineHundredAndNinetyNineJUnit4A() {
        int expected = service.remain(1);
        int actual = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnNineHundredAndNinetyNineJUnit4B() {
        int expected = service.remain(1001);
        int actual = 999;
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void shouldReturnOneJUnit4() {
        int expected = service.remain(999);
        int actual = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnZeroJUnit4() {
        int expected = service.remain(1000);
        int actual = 0;
        Assert.assertEquals(actual, expected);
    }

}