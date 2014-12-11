package ru.fivestarter.brain;

import ru.fivestarter.brain.neyron.Neyron;
import ru.fivestarter.brain.neyron.Sensor;

/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public class BrainImpl implements Brain{
    Neyron sensor;

    public void init() {
        sensor = new Sensor();
    }

    @Override
    public void feel() {
        sensor.signal();
    }

    @Override
    public void action() {

    }
}
