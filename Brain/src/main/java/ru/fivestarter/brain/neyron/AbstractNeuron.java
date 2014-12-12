package ru.fivestarter.brain.neyron;

import java.util.Set;

import com.google.common.collect.Sets;


/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public abstract class AbstractNeuron implements Neuron {
    Set<Neuron> observers = Sets.newHashSet();

    @Override
    public void registerObserver(Neuron subject) {
        observers.add(subject);
    }

    @Override
    public void removeObserver(Neuron subject) {
        observers.remove(subject);
    }

    @Override
    public Set<Neuron> getObservers() {
        return observers;
    }

    @Override
    public void notifyObserver(Neuron observer) {
        for (Neuron neuron : observers) {
            neuron.notifyObserver(this);
        }
    }
}
