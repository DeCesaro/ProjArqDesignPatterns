package Behavioral;

public interface Subject {

    public void registerObserver(ObserverProducts observer);
    public void removeObserver(ObserverProducts observer);
    public void notifyObservers(String product);
}