package Behavioral;

public class PayPal implements PaymentMethod {
    @Override
    public String pay(Double amount) {
        return "You have paid with PayPal";
    }
}