package Adapter;

public interface BankApi {
    double getBalance(String accountNumber);
    boolean sendMoney(String fromAc, String toAc, double amount);
}
