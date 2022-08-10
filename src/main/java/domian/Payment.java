package domian;

import java.math.BigDecimal;

public class Payment {

    private Account from;

    private Account to;

    private BigDecimal amount;

    private String currency;

    private PaymentType paymentType;

    public Payment(Account from, Account to, BigDecimal amount, String currency) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.currency = currency;
    }
}
