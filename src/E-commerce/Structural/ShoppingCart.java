package Structural;

import Behavioral.PaymentMethod;

public class ShoppingCart {

    private final List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<Item>();
    }

   /* public void addItem(Item item) {

        items.add(item);
    }

    public double calcTotalCost() {

        double total = 0.0;
        for (Item item : items) {

            total += item.getPrice();
        }

        return total;
    }

    /**
     * Strategy pattern
     * @param method
     * @return
     */
   /** public boolean pay(PaymentMethod method) {

        double totalCost = calcTotalCost();
        return method.pay(totalCost);
    }
}