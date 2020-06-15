package Structural;

import Behavioral.ObserverProducts;
import Behavioral.Subject;

import java.util.List;
import java.util.ArrayList;

public class ProductsCatalog implements Subject {

    public List<ObserverProducts> clients;

    public List<ObserverProducts> getClients(){
        return clients;
    }

    public void setClients(List<ObserverProducts> clients){
        this.clients = clients;
    }

    public ProductsCatalog(){
        this.clients = new ArrayList<>();
    }

    @Override
    public void registerObserver(ObserverProducts observer) {
        clients.add(observer);
    }

    @Override
    public void removeObserver(ObserverProducts observer) {
        clients.remove(observer);
    }

    @Override
    public void notifyObservers(String products) {
        for(ObserverProducts subscriber: clients){
            subscriber.update(products);
        }
    }
}
