package ru.fivestarter.brain.neyron;

import java.util.Set;

import com.google.common.collect.Sets;

import ru.fivestarter.brain.observer.Observer;

/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public class NeuronImpl extends AbstractNeuron {
    private Set<Neuron> effectedNeurons = Sets.newHashSet();

    @Override
    public void addEffected(Neuron neuron) {
        effectedNeurons.add(neuron);
    }

    @Override
    public Set<Neuron> getEffected() {
        return effectedNeurons;
    }

    @Override
    public void update(Neuron neuron) {

    }

    @Override
    public Set<Neuron> getObservers() {
        return null;
    }
}
