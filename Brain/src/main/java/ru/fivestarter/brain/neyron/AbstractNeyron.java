package ru.fivestarter.brain.neyron;

import java.util.List;

import com.google.common.collect.Lists;

import ru.fivestarter.brain.observer.Observer;

/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public abstract class AbstractNeyron implements Neyron {
    List<Observer> observers = Lists.newArrayList();

    @Override
    public void registerObserver(Observer subject) {
        observers.add(subject);
    }

    @Override
    public void removeObserver(Observer subject) {
        observers.remove(subject);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.notify();
        }
    }
}
