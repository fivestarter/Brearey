package ru.fivestarter.brain.neyron;

import java.util.Set;

import ru.fivestarter.brain.observer.Observer;
import ru.fivestarter.brain.observer.Subject;

/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public interface Neuron extends Subject, Observer {
    void addEffected(Neuron neuron);
    Set<Neuron> getEffected();
}
