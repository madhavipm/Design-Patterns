package Adapter;

public class YesBankAdapter implements BankApi{

    YesBankApi yesBankApi = new YesBankApi();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        System.out.println("YESBank API: Sending " + amount + " rs from " + fromAcc + " to " + toAcc);
        return true;
    }
}
