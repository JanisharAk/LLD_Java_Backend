package DesignPattern.part05_adapter;

import DesignPattern.part05_adapter.thirdParty.yesbank.YesBankApi;

public class YesBankAdapter implements BankApiAdapter {
    private YesBankApi yesBankApi = new YesBankApi();
    @Override
    public double getBalance(String accountNumber) {
        yesBankApi.doSomething();
        return 0;
    }
    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        yesBankApi.doSomething();
        return false;
    }
}