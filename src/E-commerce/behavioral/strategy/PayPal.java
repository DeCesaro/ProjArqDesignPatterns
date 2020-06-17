package behavioral.strategy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayPal implements PaymentMethod {

    @Override
    public void Paymentdetail(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Insira seu e-mail:");
            reader.readLine();
            System.out.println("Insira sua senha:");
            reader.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void pay(double amount) {
        System.out.println("Valor de R$" + amount + " a ser pago via PayPal");
        System.out.println("Pagamento sendo efetuado, aguarde um momento");
        System.out.println("...");
        System.out.println("Pagamento realizado");
    }
}