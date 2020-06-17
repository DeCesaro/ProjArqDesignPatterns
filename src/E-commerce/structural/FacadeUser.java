package structural;

import behavioral.observer.CartProductObserver;
import creational.AddProduct;
import creational.BuyOptionsFactory;
import creational.Cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacadeUser {
    private Cart cart;
    private List<CartProductObserver> observers = new ArrayList<CartProductObserver>();

    public void addCarrinhoObserver(CartProductObserver observer) {
        this.observers.add(observer);
    }

    public void UI() {

        createCarrinho();

        System.out.println("BEM-VINDO AO BACELO E-SHOP");
        System.out.println("========================");
        System.out.println("1- Adicionar produto no carrinho");
        System.out.println("2- Visualizar Carrinho");
        System.out.println("3- Efetuar Pagamento");
        System.out.println("4- Fechar programa");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 1:
                adicionaProduto();
                break;
            case 2:
                printCarrinho();
                break;
            case 3:
                endOperation();
                break;
            case 4:
                System.out.println("Obrigado pela preferência! Volte Sempre!");
                break;
            default:
                System.out.println("Impossível acessar esta opção");
                UI();
                break;
        }
    }

    public void endOperation(){
        BuyOptionsFactory fac = new BuyOptionsFactory();
        fac.value = cart.getTotalValue();
        fac.pay();


    }


    public void createCarrinho() {
        cart = cart.getInstance();

    }

    public void printCarrinho(){
        System.out.println(cart.toString());
        UI();
    }

    public void adicionaProduto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual produto gostaria de adicionar?");
        System.out.println("Digite abaixo o nome do produto:");

        String nome = sc.next();

        System.out.println("Digite o preço:");

        int preco = sc.nextInt();

        Item p = new Item(nome, preco);
        AddProduct event = new AddProduct(p);

        for (CartProductObserver observer : this.observers) {
            observer.call(event);
        }

        UI();
    }
}
