package service;

import domian.Account;

public interface PaymentService {

    void doPayment(Account from, Account to);
}
