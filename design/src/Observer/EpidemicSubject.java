package Observer;

import java.util.ArrayList;
import java.util.List;

class EpidemicSubject implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver(int stage) {
        for (Observer o : observers) {
            o.display(stage);
        }
    }
}
