package ru.fivestarter.brain.neyron;

import java.util.Set;

import ru.fivestarter.brain.observer.Observer;
import ru.fivestarter.brain.observer.Subject;

/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public interface Neyron extends Subject, Observer {
    void addEffected(Neyron neyron);
    Set<Neyron> getEffected();
}
