package App;

import creational.Cart;
import structural.FacadeUser;

public class Main {
    public static void main(String[] args) {
        FacadeUser facade = new FacadeUser();
        facade.addCartObserver(Cart.getInstance());
        facade.UI();
    }
}
