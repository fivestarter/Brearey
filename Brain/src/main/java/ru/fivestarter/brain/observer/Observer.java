package ru.fivestarter.brain.observer;

import ru.fivestarter.brain.neyron.Neyron;

/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public interface Observer {
    void update(Neyron neyron);
}
