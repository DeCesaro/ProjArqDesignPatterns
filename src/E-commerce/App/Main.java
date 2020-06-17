package creational;

public class Main {
    public static void main(String[] args) {
        FacadeMain fachada = new FacadeMain();

        fachada.addCarrinhoObserver((CartProductObserver) Cart.getInstance());

        fachada.UI();

    }
}
