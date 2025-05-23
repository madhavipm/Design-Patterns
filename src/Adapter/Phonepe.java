package Adapter;

public class Phonepe {
    public static void main(String[] args) {
        BankApi bankApi1 = new ICICIBankAdapter();

        String acc1 = "Madhavi";
        String acc2 = "Sai";

        bankApi1.sendMoney(acc1, acc2, 15000);

        BankApi bankApi2 = new YesBankAdapter();

        bankApi2.sendMoney(acc1, acc2, 25000);

    }
}
