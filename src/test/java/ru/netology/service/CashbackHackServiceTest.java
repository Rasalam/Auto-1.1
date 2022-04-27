package ru.netology.service;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService ();

    @org.testng.annotations.Test
    public void shouldReturnOneThousand() {
        int expected = service.remain(0);
        int actual = 1000;
        org.testng.Assert.assertEquals(actual, expected);
        }

    @org.testng.annotations.Test
    public void shouldReturnNineHundredAndNinetyNineA() {
        int expected = service.remain(1);
        int actual = 999;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnNineHundredAndNinetyNineB() {
        int expected = service.remain(1001);
        int actual = 999;
        org.testng.Assert.assertEquals(actual, expected);
    }


    @org.testng.annotations.Test
    public void shouldReturnOne() {
        int expected = service.remain(999);
        int actual = 1;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnZero() {
        int expected = service.remain(1000);
        int actual = 0;
        org.testng.Assert.assertEquals(actual, expected);
    }

}