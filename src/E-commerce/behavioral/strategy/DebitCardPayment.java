package creational;

import java.util.Scanner;

public class DebitCardPayment implements PaymentMethod {
    Scanner sc = new Scanner(System.in);

    @Override
    public void detalhesPagamento() {

        System.out.println("Digite o número do cartão: ");
        sc.nextLine();
        System.out.println("Digite a data de expiração do cartão:");
        sc.nextLine();
        System.out.println("Digite o número do CVV (encontra-se na parte de trás do cartão):");
        sc.nextLine();
    }

    @Override
    public void pay(double payment) {

        System.out.println("Valor de  R$ " + payment + " sendo realizado");
        System.out.println("Pagamento realizado com sucesso!");
    }

}
