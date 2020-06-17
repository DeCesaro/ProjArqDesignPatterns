package behavioral.strategy;

public class BoletoPayment implements PaymentMethod {

    @Override
    public void Paymentdetail() {
        System.out.println("================================================================");
        System.out.println("CAIXA        10490.00001 00200.000008 00000.0000 8 5653000226.63");
        System.out.println("▓▒▒▒▓▓▒▓▒▓▓▒▒▓▓▓▒▒▓▒▓▒");
        System.out.println("================================================================");
    }

    @Override
    public void pay (double payment) {

        System.out.println("Valor a ser pago: R$" + payment);
        System.out.println("Este boleto possui validade de até 3 dias úteis até o seu pagamento");
    }
}
