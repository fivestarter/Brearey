package ru.fivestarter.brain;

import java.util.List;

import com.google.common.collect.Lists;

import ru.fivestarter.brain.neyron.Effector;
import ru.fivestarter.brain.neyron.Neyron;
import ru.fivestarter.brain.neyron.NeyronImpl;
import ru.fivestarter.brain.neyron.Sensor;
import ru.fivestarter.brain.observer.Observer;

/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public class BrainImpl implements Brain, Observer {
    private static final int NEYRONS_NUMBER = 10;

    private Neyron sensor;
    private Neyron effector;
    private List<Neyron> neyronList;
    private SynapseManager synapseManager = new SynapseManagerImpl();

    public void init() {
        sensor = new Sensor();
        sensor.registerObserver((Observer) synapseManager);
        effector = new Effector();
        effector.registerObserver(this);
        initNeyronList((Observer) synapseManager);
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

    private void initNeyronList(Observer observer) {
        neyronList = Lists.newArrayList();
        for (int i = 0; i < NEYRONS_NUMBER; i++) {
            Neyron neyron = new NeyronImpl();
            neyron.registerObserver(observer);
            neyronList.add(neyron);
        }
    }
}
