package by.education.vintilov.ATM.java;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(new DebitCard(1, "Vasil"));


        System.out.println(atm.infoAboutClient());
        atm.withdrawMoneyFromCard(100);
        System.out.println(atm.infoAboutClient());
        atm.putMoneyOnCard(500);
        System.out.println(atm.infoAboutClient());

        System.out.println(atm.getBalanceInOtherCurrencies());


    }
}
