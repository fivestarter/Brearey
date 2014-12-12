package ru.fivestarter.brain.neyron;

import java.util.Set;


/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public interface Neuron {
    void registerObserver(Neuron subject);
    void removeObserver(Neuron subject);
    Set<Neuron> getObservers();
    void notifyObserver(Neuron neuron);
}
