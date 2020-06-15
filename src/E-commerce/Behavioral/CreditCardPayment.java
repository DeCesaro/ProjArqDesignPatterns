package Behavioral;

import java.util.Date;

public class CreditCardPayment implements PaymentMethod {
    private final String name;
    private final String cardNumber;
    private final Date expires;

    public CreditCardPayment (String name, String cardNumber, Date expires) {
        super();
        this.name = name;
        this.cardNumber = cardNumber;
        this.expires = expires;
    }

    @Override
    public boolean pay(double amount) {
        return true;
    }
}