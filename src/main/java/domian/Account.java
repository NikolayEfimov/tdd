package domian;

import java.math.BigDecimal;

public class Account {

    private final Long number;

    private BigDecimal balance;

    public Account(Long number) {
        this.number = number;
        this.balance = BigDecimal.ZERO;
    }
}
