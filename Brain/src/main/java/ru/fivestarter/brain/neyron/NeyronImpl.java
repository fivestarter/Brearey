package ru.fivestarter.brain.neyron;

import java.util.Set;

import com.google.common.collect.Sets;

/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public class NeyronImpl extends AbstractNeyron {
    private Set<Neyron> effectedNeyrons = Sets.newHashSet();

    @Override
    public void addEffected(Neyron neyron) {
        effectedNeyrons.add(neyron);
    }

    @Override
    public Set<Neyron> getEffected() {
        return effectedNeyrons;
    }

    @Override
    public void update(Neyron neyron) {

    }
}
