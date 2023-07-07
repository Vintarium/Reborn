package by.education.vintilov.ATM.test;

import by.education.vintilov.ATM.java.ATM;
import by.education.vintilov.ATM.java.DebitCard;
import org.junit.Test;

import static org.junit.Assert.*;

public class ATMTest {
    private final ATM atm = new ATM(new DebitCard(3, "Bred Colins"));

    @Test
    public void putMoneyOnCard() {
        atm.putMoneyOnCard(200);
        int expected = 200;
        int actual = atm.getBalanceOnTheCard();
        assertEquals(expected, actual);
    }

    @Test
    public void withdrawMoneyFromCard() {
        atm.putMoneyOnCard(200);
        atm.withdrawMoneyFromCard(100);
        int expected = 100;
        int actual = atm.getBalanceOnTheCard();
        assertEquals(expected, actual);
    }

    @Test
    public void infoAboutClient() {
        String expected = "id: " + "3" +
                ",  name: " + "Bred Colins" +
                ", balance: " + "0";
        String actual = atm.infoAboutClient();
        assertEquals(expected, actual);
    }

    @Test
    public void getBalanceInOtherCurrencies() {
        atm.putMoneyOnCard(500);
        String expected = "balance in usdt: " + "500" + ",\n" +
                "Balance in Bitcoin: " + (double) 500 / 30000 + ",\n" +
                "Balance in Rub: " + 500 * 60;
        String actual = atm.getBalanceInOtherCurrencies();
        assertEquals(expected, actual);
    }
}