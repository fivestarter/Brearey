package ru.fivestarter.brain.observer;

/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public interface Subject {
    void registerObserver(Observer subject);
    void removeObserver(Observer subject);
    void notifyObserver();
}
