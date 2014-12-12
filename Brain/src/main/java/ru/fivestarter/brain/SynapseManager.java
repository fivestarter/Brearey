package ru.fivestarter.brain;

import java.util.Set;

import ru.fivestarter.brain.neyron.Neyron;

/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public interface SynapseManager {
    void init(Set<Neyron> targetNeyrons);
}
