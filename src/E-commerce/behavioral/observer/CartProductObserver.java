package behavioral.observer;

import creational.AddProduct;

public interface CartProductObserver {
    void call(AddProduct event);

}
