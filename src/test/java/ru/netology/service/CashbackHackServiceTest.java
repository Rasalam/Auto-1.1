package ru.netology.service;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldReturnOneThousand() {
        CashbackHackService service = new CashbackHackService ();
        int amount = 0;
        int expected = service.remain(amount);
        int actual = 1000;
        org.testng.Assert.assertEquals(actual, expected);
        }

    @org.testng.annotations.Test
    public void shouldReturnNineHundredAndNinetyNineA() {
        CashbackHackService service = new CashbackHackService ();
        int amount = 1;
        int expected = service.remain(amount);
        int actual = 999;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnNineHundredAndNinetyNineB() {
        CashbackHackService service = new CashbackHackService ();
        int amount = 1001;
        int expected = service.remain(amount);
        int actual = 999;
        org.testng.Assert.assertEquals(actual, expected);
    }


    @org.testng.annotations.Test
    public void shouldReturnOne() {
        CashbackHackService service = new CashbackHackService ();
        int amount = 999;
        int expected = service.remain(amount);
        int actual = 1;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnZero() {
        CashbackHackService service = new CashbackHackService ();
        int amount = 1000;
        int expected = service.remain(amount);
        int actual = 0;
        org.testng.Assert.assertEquals(actual, expected);
    }

}