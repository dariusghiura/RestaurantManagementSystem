package BusinessLayer;

import PresentationLayer.Chef.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyObservers();
}
