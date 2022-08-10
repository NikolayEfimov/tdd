package domian;

import java.math.BigDecimal;

public class Account {

    private final Bank bank;

    private final Long number;

    private BigDecimal balance;

    public Account(Long number, String bankName) {
        this.number = number;
        this.balance = BigDecimal.ZERO;
        bank = new Bank(bankName);
    }
}
