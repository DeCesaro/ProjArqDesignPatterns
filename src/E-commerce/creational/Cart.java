package creational;

import behavioral.observer.CartProductObserver;
import structural.Item;

import java.util.ArrayList;


public class Cart implements CartProductObserver {

    private static Cart instance = null;

        private ArrayList<Item> cart = new ArrayList<Item>();  // Applying singleton pattern

        private Cart() {
            cart = new ArrayList();
        }

    public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }

    public double getTotalValue() {
        double valorTotal = 0;
        for (Item p : cart) {
            valorTotal += p.getValue();
        }
        return valorTotal;
    }

    public String printProduct() {
        String print = "";
        for (Item p : cart) {
            print += p.toString() + "\n";
        }
        return print;
    }

    public void listProduct() {
            for (Item p : cart)
                System.out.println(" - " + p.getName());
        }

    public void addProd(Item p) {
        if (p != null) {
            if (!cart.contains(p)) {
                cart.add(p);
            }
        }
    }

        @Override
        public void call(AddProduct event) {
            addProd(event.getAddProduct());
            System.out.println("Produto adicionado!");
            System.out.println("=========================");
        }

    public String toString() {
        String toString = "Preco do carrinho:\nR$ " + getTotalValue();
        toString += "\nItens no carrinho:\n" + printProduct();
        return toString;
    }

}