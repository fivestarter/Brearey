package ru.fivestarter.brain;

import java.util.Random;
import java.util.Set;

import com.google.common.collect.Sets;

import ru.fivestarter.brain.neyron.Neuron;

/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public class SynapseManagerImpl implements SynapseManager {
    Set<Neuron> targetNeurons;

    @Override
    public void update(Neuron neuron) {
        Set<Neuron> availableNeurons = getAvailableNeyrons(neuron);
        Neuron randomNeuron = getRandomNeyron(availableNeurons);
        neuron.registerObserver(randomNeuron);
        randomNeuron.notifyObserver(neuron);
    }

    public void init(Set<Neuron> targetNeurons) {
        this.targetNeurons = targetNeurons;
    }

    private Set<Neuron> getAvailableNeyrons(Neuron initiator) {
        Set<Neuron> ret = Sets.newHashSet(targetNeurons);
        ret.remove(initiator);
        ret.removeAll(initiator.getObservers());
        return ret;
    }

    private Neuron getRandomNeyron(Set<Neuron> neurons) {
        int item = new Random().nextInt(neurons.size());
        int i = 0;
        Neuron ret = null;
        for (Neuron obj : neurons) {
            if (i == item) {
                ret = obj;
                break;
            }
            i = i + 1;
        }
        return ret;

    }
}
