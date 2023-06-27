package by.education.vintilov.ATM.java;

public class ATM {
    private final DebitCard debitCard;

    public ATM(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void putMoneyOnCard(int money) {
        debitCard.setBalance(debitCard.getBalance() + money);
    }

    public void withdrawMoneyFromCard(int money) {
        debitCard.setBalance(debitCard.getBalance() - money);
    }


    public String infoAboutClient() {
        return "id: " + debitCard.getId() +
                ",  name: " + debitCard.getName() +
                ", balance: " + debitCard.getBalance();
    }


    public String getBalanceInOtherCurrencies() {
        return "balance in usdt: " + debitCard.getBalance() + ",\n" +
                "Balance in Bitcoin: " + (double) debitCard.getBalance() / 30000 + ",\n" +
                "Balance in Rub: " + debitCard.getBalance() * 60;
    }
}



