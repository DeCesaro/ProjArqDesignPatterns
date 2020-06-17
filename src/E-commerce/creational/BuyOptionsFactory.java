package creational;

import behavioral.strategy.BoletoPayment;
import behavioral.strategy.CreditCardPayment;
import behavioral.strategy.DebitCardPayment;
import behavioral.strategy.PayPal;

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
                p1.pay(value);
                System.out.println("Muito Obrigado por utilizar nossos servicos!\nVolte sempre!!!");
                break;
            case 2:
                DebitCardPayment p2 = new DebitCardPayment();
                p2.pay(value);
                System.out.println("Muito Obrigado por utilizar nossos servicos!\nVolte sempre!!!");
                break;
            case 3:
                BoletoPayment p3 = new BoletoPayment();
                p3.pay(value);
                System.out.println("Muito Obrigado por utilizar nossos servicos!\nVolte sempre!!!");
                break;
            case 4:
                PayPal p4 = new PayPal();
                p4.pay(value);
                System.out.println("Muito Obrigado por utilizar nossos servicos!\nVolte sempre!!!");
                break;
            default:
                System.out.println("Numero invalido, digite novamente.");
                pay();
                break;
        }
    }
}
