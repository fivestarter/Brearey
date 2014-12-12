package ru.fivestarter.brain;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import ru.fivestarter.brain.neyron.Effector;
import ru.fivestarter.brain.neyron.Neuron;
import ru.fivestarter.brain.neyron.NeuronImpl;

/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public class BrainImpl implements Brain {
    private static final int NEYRONS_NUMBER = 10;

    private Neuron sensor;
    private Neuron effector;
    private List<Neuron> neuronList;
    private SynapseManager synapseManager;

    public BrainImpl() {
        synapseManager = new SynapseManagerImpl();

        sensor = new NeuronImpl();
        sensor.registerObserver((Neuron) synapseManager);

        effector = new Effector(this);
        initNeyronList((Neuron) synapseManager);

        Set<Neuron> affectedNeurons = Sets.newHashSet(neuronList);
        affectedNeurons.add(effector);
        synapseManager.init(affectedNeurons);

    }

    @Override
    public void feel() {
        sensor.notifyObserver(null);
    }

    @Override
    public void action() {

    }

    @Override
    public void update(Neuron neuron) {
        action();
    }

    private void initNeyronList(Neuron observer) {
        neuronList = Lists.newArrayList();
        for (int i = 0; i < NEYRONS_NUMBER; i++) {
            Neuron neuron = new NeuronImpl();
            neuron.registerObserver(observer);
            neuronList.add(neuron);
        }
    }
}
