package ru.fivestarter.brain.neyron;

import java.util.Set;

import ru.fivestarter.brain.Brain;

/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public class Effector implements Neuron {
    Brain brain;

    public Effector(Brain brain) {
        this.brain = brain;
    }

    @Override
    public void registerObserver(Neuron subject) {
        throw new RuntimeException();
    }

    @Override
    public void removeObserver(Neuron subject) {
        throw new RuntimeException();
    }

    @Override
    public Set<Neuron> getObservers() {
        throw new RuntimeException();
    }

    @Override
    public void notifyObserver(Neuron neuron) {
        brain.action();
    }
}
