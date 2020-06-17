package creational;

import behavioral.strategy.*;

import java.util.Scanner;

public class BuyOptionsFactory {
    public double value;

    public void pay() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Como deseja efetuar o pagamento?");
        System.out.println("1- Cartao de Credito");
        System.out.println("2- Cartao de Debito");
        System.out.println("3- Boleto Bancario");
        System.out.println("4- PayPal");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                CreditCardPayment p1 = new CreditCardPayment();
                p1.Paymentdetail();
                p1.pay(value);
                break;
            case 2:
                DebitCardPayment p2 = new DebitCardPayment();
                p2.Paymentdetail();
                p2.pay(value);
                break;
            case 3:
                BoletoPayment p3 = new BoletoPayment();
                p3.Paymentdetail();
                p3.pay(value);
                break;
            case 4:
                PayPal p4 = new PayPal();
                p4.Paymentdetail();
                p4.pay(value);
                break;
            default:
                System.out.println("Numero invalido, digite novamente.");
                pay();
                break;
        }
    }
}
