package creational;

import structural.Item;

public class AddProduct {
    private final Item product;

        public AddProduct(Item product) {
            super();
            this.product = product;
        }

    public Item getAddProduct() {
        return product;
    }
}
