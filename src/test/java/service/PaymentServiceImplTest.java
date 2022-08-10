package service;

import domian.Account;
import domian.Payment;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class PaymentServiceImplTest {

    PaymentService service = new PaymentServiceImpl();

    @Test
    void processIsNotSuccessfulBecauseSenderHasNotEnoughFunds() {
        var account1 = new Account(1L, "Tinkoff");
        var account2 = new Account(2L, "Alfa-bank");

        var payment = new Payment(
                account1,
                account2,
                BigDecimal.valueOf(500),
                "RUB"
        );

        service.process(payment);
//        assertThat(payment).isEquualTo()
    }
}