package ru.fivestarter.brain;

import ru.fivestarter.brain.neyron.Effector;
import ru.fivestarter.brain.neyron.Neyron;
import ru.fivestarter.brain.neyron.Sensor;
import ru.fivestarter.brain.observer.Observer;

/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public class BrainImpl implements Brain, Observer {
    Neyron sensor;
    Neyron effector;

    public void init() {
        sensor = new Sensor();
        effector = new Effector();
        effector.registerObserver(this);
    }

    @Override
    public void feel() {
        sensor.signal();
    }

    @Override
    public void action() {

    }

    @Override
    public void update() {
        action();
    }
}
