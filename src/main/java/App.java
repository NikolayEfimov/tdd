import domian.Account;
import domian.Payment;
import service.PaymentService;
import service.PaymentServiceImpl;

import java.math.BigDecimal;

public class App {

    public static void main(String... args) {
        var account1 = new Account(1L, "Tinkoff");
        var account2 = new Account(2L, "Alfa-bank");

        var payment = new Payment(
                account1,
                account2,
                BigDecimal.valueOf(500),
                "RUB"
        );
        PaymentService paymentService = new PaymentServiceImpl();

        paymentService.process(payment);

    }
}
